-- Scenario 1: Package for Customer Management
create or replace package customermanagement is
   procedure addcustomer (
      p_id      number,
      p_name    varchar2,
      p_dob     date,
      p_balance number
   );
   procedure updatecustomerbalance (
      p_id      number,
      p_balance number
   );
   function getcustomerbalance (
      p_id number
   ) return number;
end;
/

create or replace package body customermanagement is
   procedure addcustomer (
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
   end;

   procedure updatecustomerbalance (
      p_id      number,
      p_balance number
   ) is
   begin
      update customers
         set balance = p_balance,
             lastmodified = sysdate
       where customerid = p_id;
   end;

   function getcustomerbalance (
      p_id number
   ) return number is
      v_balance number;
   begin
      select balance
        into v_balance
        from customers
       where customerid = p_id;
      return v_balance;
   end;
end;
/

-- Scenario 2: Package for Employee Management
create or replace package employeemanagement is
   procedure hireemployee (
      p_id       number,
      p_name     varchar2,
      p_position varchar2,
      p_salary   number,
      p_dept     varchar2
   );
   procedure updateemployeedetails (
      p_id     number,
      p_salary number
   );
   function getannualsalary (
      p_id number
   ) return number;
end;
/

create or replace package body employeemanagement is
   procedure hireemployee (
      p_id       number,
      p_name     varchar2,
      p_position varchar2,
      p_salary   number,
      p_dept     varchar2
   ) is
   begin
      insert into employees (
         employeeid,
         name,
         position,
         salary,
         department,
         hiredate
      ) values ( p_id,
                 p_name,
                 p_position,
                 p_salary,
                 p_dept,
                 sysdate );
   end;

   procedure updateemployeedetails (
      p_id     number,
      p_salary number
   ) is
   begin
      update employees
         set
         salary = p_salary
       where employeeid = p_id;
   end;

   function getannualsalary (
      p_id number
   ) return number is
      v_salary number;
   begin
      select salary
        into v_salary
        from employees
       where employeeid = p_id;
      return v_salary * 12;
   end;
end;
/

-- Scenario 3: Package for Account Operations
create or replace package accountoperations is
   procedure openaccount (
      p_accid   number,
      p_custid  number,
      p_type    varchar2,
      p_balance number
   );
   procedure closeaccount (
      p_accid number
   );
   function gettotalcustomerbalance (
      p_custid number
   ) return number;
end;
/

create or replace package body accountoperations is
   procedure openaccount (
      p_accid   number,
      p_custid  number,
      p_type    varchar2,
      p_balance number
   ) is
   begin
      insert into accounts (
         accountid,
         customerid,
         accounttype,
         balance,
         lastmodified
      ) values ( p_accid,
                 p_custid,
                 p_type,
                 p_balance,
                 sysdate );
   end;

   procedure closeaccount (
      p_accid number
   ) is
   begin
      delete from accounts
       where accountid = p_accid;
   end;

   function gettotalcustomerbalance (
      p_custid number
   ) return number is
      v_total number;
   begin
      select sum(balance)
        into v_total
        from accounts
       where customerid = p_custid;
      return v_total;
   end;
end;
/