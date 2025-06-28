-- Customers
create table customers (
   customerid   number primary key,
   name         varchar2(100),
   dob          date,
   balance      number,
   lastmodified date,
   isvip        varchar2(5)  -- Added for VIP flag
);

-- Accounts
create table accounts (
   accountid    number primary key,
   customerid   number,
   accounttype  varchar2(20),
   balance      number,
   lastmodified date,
   foreign key ( customerid )
      references customers ( customerid )
);

-- Transactions
create table transactions (
   transactionid   number primary key,
   accountid       number,
   transactiondate date,
   amount          number,
   transactiontype varchar2(10),
   foreign key ( accountid )
      references accounts ( accountid )
);

-- Loans
create table loans (
   loanid       number primary key,
   customerid   number,
   loanamount   number,
   interestrate number,
   startdate    date,
   enddate      date,
   foreign key ( customerid )
      references customers ( customerid )
);

-- Employees
create table employees (
   employeeid number primary key,
   name       varchar2(100),
   position   varchar2(50),
   salary     number,
   department varchar2(50),
   hiredate   date
);

-- AuditLogs
create table auditlog (
   logid         number primary key,
   transactionid number,
   logdate       date,
   action        varchar2(50)
);

-- AuditLog_seq
create sequence auditlog_seq start with 1 increment by 1;

-- Customers
insert into customers (
   customerid,
   name,
   dob,
   balance,
   lastmodified,
   isvip
) values ( 1,
           'John Doe',
           to_date('1985-05-15','YYYY-MM-DD'),
           1000,
           sysdate,
           'FALSE' );

insert into customers (
   customerid,
   name,
   dob,
   balance,
   lastmodified,
   isvip
) values ( 2,
           'Jane Smith',
           to_date('1990-07-20','YYYY-MM-DD'),
           1500,
           sysdate,
           'FALSE' );

-- Accounts
insert into accounts (
   accountid,
   customerid,
   accounttype,
   balance,
   lastmodified
) values ( 1,
           1,
           'Savings',
           1000,
           sysdate );

insert into accounts (
   accountid,
   customerid,
   accounttype,
   balance,
   lastmodified
) values ( 2,
           2,
           'Checking',
           1500,
           sysdate );

-- Transactions
insert into transactions (
   transactionid,
   accountid,
   transactiondate,
   amount,
   transactiontype
) values ( 1,
           1,
           sysdate,
           200,
           'Deposit' );

insert into transactions (
   transactionid,
   accountid,
   transactiondate,
   amount,
   transactiontype
) values ( 2,
           2,
           sysdate,
           300,
           'Withdrawal' );

-- Loans
insert into loans (
   loanid,
   customerid,
   loanamount,
   interestrate,
   startdate,
   enddate
) values ( 1,
           1,
           5000,
           5,
           sysdate,
           add_months(
              sysdate,
              60
           ) );

-- Employees
insert into employees (
   employeeid,
   name,
   position,
   salary,
   department,
   hiredate
) values ( 1,
           'Alice Johnson',
           'Manager',
           70000,
           'HR',
           to_date('2015-06-15','YYYY-MM-DD') );

insert into employees (
   employeeid,
   name,
   position,
   salary,
   department,
   hiredate
) values ( 2,
           'Bob Brown',
           'Developer',
           60000,
           'IT',
           to_date('2017-03-20','YYYY-MM-DD') );

delete from employees
 where employeeid = 2;


select *
  from transactions;