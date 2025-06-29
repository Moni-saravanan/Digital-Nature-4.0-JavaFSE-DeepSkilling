-- Scenario 1:
create or replace procedure processmonthlyinterest is
begin
   update accounts
      set
      balance = balance + ( balance * 0.01 )
    where accounttype = 'Savings';
   commit;
end;
/

-- Scenario 2: 
create or replace procedure updateemployeebonus (
   p_dept      varchar2,
   p_bonus_pct number
) is
begin
   update employees
      set
      salary = salary + ( salary * p_bonus_pct / 100 )
    where department = p_dept;
   commit;
end;
/

-- Scenario 3: 
create or replace procedure transferfunds (
   p_sourceacc number,
   p_destacc   number,
   p_amt       number
) is
   v_bal number;
begin
   select balance
     into v_bal
     from accounts
    where accountid = p_sourceacc
   for update;

   if v_bal < p_amt then
      raise_application_error(
         -20003,
         'Insufficient funds in source account'
      );
   end if;
   update accounts
      set
      balance = balance - p_amt
    where accountid = p_sourceacc;
   update accounts
      set
      balance = balance + p_amt
    where accountid = p_destacc;
   commit;
end;
/
