create or replace procedure safetransferfunds (
   p_fromacc number,
   p_toacc   number,
   p_amount  number
) is
   v_balance number;
begin
   select balance
     into v_balance
     from accounts
    where accountid = p_fromacc
   for update;
   if v_balance < p_amount then
      raise_application_error(
         -20001,
         'Insufficient funds in source account.'
      );
   end if;
   update accounts
      set
      balance = balance - p_amount
    where accountid = p_fromacc;
   update accounts
      set
      balance = balance + p_amount
    where accountid = p_toacc;
   commit;
exception
   when others then
      rollback;
      dbms_output.put_line('Transfer Failed: ' || sqlerrm);
end;
/

-- Scenario 2: Update salary procedure with error logging
create or replace procedure updatesalary (
   p_empid      number,
   p_percentage number
) is
begin
   update employees
      set
      salary = salary + ( salary * p_percentage / 100 )
    where employeeid = p_empid;

   if sql%rowcount = 0 then
      raise_application_error(
         -20002,
         'Employee ID not found'
      );
   end if;
   commit;
exception
   when others then
      dbms_output.put_line('Error: ' || sqlerrm);
      rollback;
end;
/

-- Scenario 3: Add new customer with exception check
create or replace procedure addnewcustomer (
   p_id      number,
   p_name    varchar2,
   p_dob     date,
   p_balance number
) is
begin
   insert into customers (
      customerid,
      name,
      dob,
      balance,
      lastmodified
   ) values ( p_id,
              p_name,
              p_dob,
              p_balance,
              sysdate );
   commit;
exception
   when dup_val_on_index then
      dbms_output.put_line('Error: Customer with this ID already exists.');
      rollback;
end;
/