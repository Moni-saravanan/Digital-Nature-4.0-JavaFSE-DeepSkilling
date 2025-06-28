-- Scenario 1: Update LastModified when customer is updated
create or replace trigger updatecustomerlastmodified before
   update on customers
   for each row
begin
   :new.lastmodified := sysdate;
end;
/

-- Scenario 2: Insert into AuditLog on transaction insert
create or replace trigger logtransaction after
   insert on transactions
   for each row
begin
   insert into auditlog (
      logid,
      transactionid,
      logdate,
      action
   ) values ( auditlog_seq.nextval,
              :new.transactionid,
              sysdate,
              'New Transaction' );
end;
/

-- Scenario 3: Enforce transaction rules
create or replace trigger checktransactionrules before
   insert on transactions
   for each row
declare
   v_balance number;
begin
   if :new.transactiontype = 'Withdrawal' then
      select balance
        into v_balance
        from accounts
       where accountid = :new.accountid;
      if :new.amount > v_balance then
         raise_application_error(
            -20004,
            'Withdrawal exceeds balance'
         );
      end if;
   elsif
      :new.transactiontype = 'Deposit'
      and :new.amount <= 0
   then
      raise_application_error(
         -20005,
         'Deposit amount must be positive'
      );
   end if;
end;
/