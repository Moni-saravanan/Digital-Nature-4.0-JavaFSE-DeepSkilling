-- Scenario 1: 
declare
   cursor cur_statements is
   select c.customerid,
          c.name,
          t.transactiondate,
          t.amount,
          t.transactiontype
     from customers c
     join accounts a
   on c.customerid = a.customerid
     join transactions t
   on a.accountid = t.accountid
    where to_char(
      t.transactiondate,
      'MMYYYY'
   ) = to_char(
      sysdate,
      'MMYYYY'
   );
begin
   for rec in cur_statements loop
      dbms_output.put_line('Customer: '
                           || rec.name
                           || ' | Date: '
                           || rec.transactiondate
                           || ' | '
                           || rec.transactiontype
                           || ': $'
                           || rec.amount);
   end loop;
end;
/

-- Scenario 2:
declare
   cursor cur_accounts is
   select accountid,
          balance
     from accounts;
begin
   for acc in cur_accounts loop
      update accounts
         set
         balance = balance - 100
       where accountid = acc.accountid;
   end loop;
   commit;
end;
/

-- Scenario 3: 
declare
   cursor cur_loans is
   select loanid,
          interestrate
     from loans;
begin
   for loan in cur_loans loop
      update loans
         set
         interestrate = loan.interestrate - 0.5
       where loanid = loan.loanid;
   end loop;
   commit;
end;
/
