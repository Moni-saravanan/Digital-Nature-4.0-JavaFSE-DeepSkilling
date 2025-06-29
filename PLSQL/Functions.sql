-- Scenario 1:
create or replace function calculateage (
   p_dob date
) return number is
   v_age number;
begin
   select floor(months_between(
      sysdate,
      p_dob
   ) / 12)
     into v_age
     from dual;
   return v_age;
end;
/

-- Scenario 2:
create or replace function calculatemonthlyinstallment (
   p_loanamount number,
   p_annualrate number,
   p_years      number
) return number is
   v_monthlyrate number := p_annualrate / 12 / 100;
   v_months      number := p_years * 12;
   v_installment number;
begin
   v_installment := p_loanamount * v_monthlyrate / ( 1 - power(
      1 + v_monthlyrate,
      -v_months
   ) );
   return v_installment;
end;
/

-- Scenario 3:
create or replace function hassufficientbalance (
   p_accountid number,
   p_amount    number
) return boolean is
   v_balance number;
begin
   select balance
     into v_balance
     from accounts
    where accountid = p_accountid;
   return v_balance >= p_amount;
exception
   when no_data_found then
      return false;
end;
/
