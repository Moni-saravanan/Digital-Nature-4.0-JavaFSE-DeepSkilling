-- Scenario 1
declare
   cursor c_loans is
   select l.loanid,
          l.interestrate,
          c.dob
     from loans l
     join customers c
   on l.customerid = c.customerid;
   v_age number;
begin
   for rec in c_loans loop
      select floor(months_between(
         sysdate,
         rec.dob
      ) / 12)
        into v_age
        from dual;
      if v_age > 60 then
         update loans
            set
            interestrate = interestrate - 1
          where loanid = rec.loanid;
      end if;
   end loop;
end;
/

-- Scenario 2
begin
   update customers
      set
      isvip = 'TRUE'
    where balance > 10000;
end;
/

-- Scenario 3
begin
   for rec in (
      select l.loanid,
             c.name,
             l.enddate
        from loans l
        join customers c
      on l.customerid = c.customerid
       where l.enddate <= sysdate + 30
   ) loop
      dbms_output.put_line('Reminder: Loan '
                           || rec.loanid
                           || ' for '
                           || rec.name
                           || ' is due on '
                           || to_char(
         rec.enddate,
         'YYYY-MM-DD'
      ));
   end loop;
end;
/