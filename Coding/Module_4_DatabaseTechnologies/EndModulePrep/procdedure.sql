-- 2. write a procedure to insert record into employee table.
-- the procedure should accept empno, ename, sal, job, hiredate as input parameter
-- write insert statement inside procedure insert_rec to add one record into table

delimiter //
create procedure acceptemp(pEmpno int ,pEname varchar(20),pSal double(9,2),pJob varchar(20),pHiredate date)
begin
insert into emp(empno,ename,sal,job,hiredate)
values(pEmpno,pEname,pSal,pJob,pHiredate);
end//
-- call acceptemp(7001,'Sohel', 5000,'eng','2025-05-12');
-- call acceptemp(7002,'prince', 5000,'eng','2025-05-12');
-- call acceptemp(7003,'kasutabhi', 5000,'eng','2025-05-12');
-- call acceptemp(7004,'chetan', 5000,'eng','2025-05-12');
-- call acceptemp(7005,'nikhil', 5000,'eng','2025-05-12');
-- call acceptemp(7006,'ali', 5000,'eng','2025-05-12');



-- ______________________
-- 3. write a procedure to delete record from employee table.
-- the procedure should accept empno as input parameter.
-- write delete statement inside procedure delete_emp to delete one record from emp
-- Table
delimiter //
create procedure deleteRec(pEmpno int)
begin
delete from emp
where empno = pEmpno;
end//
delimiter ;
-- 4. write a procedure to display empno,ename,deptno,dname for all employees with sal
-- > given salary. pass salary as a parameter to procedure
delimiter //
create procedure showempwithsal4(pSal double(9,2))
begin
select e.empno,e.ename,e.sal,d.deptno,d.dname 
from emp e join dept d
on e.deptno = d.deptno
where sal > pSal;
end//
delimiter ;

-- call showempwithsal4(5000);

-- ______________________

-- 5. write a procedure to find min,max,avg of salary and number of employees in the
-- given deptno.
-- deptno --→ in parameter
-- min,max,avg and count ---→ out type parameter
-- execute procedure and then display values min,max,avg and count
delimiter //
create procedure minmaxavg1(in pDeptno int,out pMin double(9,2),out pMax double(9,2),out pAvg double(9,2),out pCount int)
begin
select min(sal),max(sal),avg(sal),count(*) into pMin,pMax,pAvg,pCount from emp
where deptno = pDeptno;
end//
delimiter ;

-- ______________________

-- 6. write a procedure to display all pid,pname,cid,cname and salesman name(use
-- product,category and salesman table)

delimiter //
create procedure forProduct()
begin
select p.pid, p.pname, c.cid, s.sname
from product p inner join category c 
on p.cid = c.cid
inner join salesman s
on p.sid = s.sid;
end //
delimiter ;

-- _____________________

-- 7. write a procedure to display all vehicles bought by a customer. pass customer name
-- as a parameter.(use vehicle,salesman,customer and relation table)

-- Write a procedure to display all products under a given category.
-- Pass the category name as a parameter.
-- (Use product, category, and salesman tables)


delimiter //
create procedure displayProductCategory(in pCname varchar(20))
begin
select p.pname,p.pid, c.cname 
from product p inner join category c
on p.cid = c.cid
where c.cname = pCname;
end //
delimiter ;

-- _____________________
-- 8. Write a procedure that displays the following information of all emp
-- Empno,Name,job,Salary,Status,deptno
-- Note: - Status will be (Greater, Lesser or Equal) respective to average salary of their own
-- department. Display an error message Emp table is empty if there is no matching
-- Record.
delimiter //
create procedure EmpStatus2()
begin
declare vEmpno,vDeptno int default 0;
declare vEname,vJob varchar(30) default '';
declare vSal double (9,2) default  0;
declare vSet int default 0;
declare vAvgSal double(9,2);
DECLARE vStatus VARCHAR(10) DEFAULT '';


declare EMPCUR CURSOR for 
	select empno,ename,job,sal,deptno from emp;

declare CONTINUE HANDLER for NOT FOUND 
set vSet  = 1;

open EMPCUR;

label1: loop
fetch EMPCUR into vEmpno,vEname,vJob,vSal,vDeptno ;
if vset = 1 then
	leave label1;
end if;

select avg(sal) into vAvgSal from emp
where deptno = vDeptno; 


if vSal > vAvgSal then
set vStatus = 'Greater';
elseif vSal < vAvgSal then 
set vStatus = 'Lesser';
else
set vStatus = 'Equal';
end if;


-- Display
select vEmpno,vEname,vJob,vSal,vDeptno,vStatus;
end loop label1;



close EMPCUR;

end//

delimiter ;
-- _____________________
9. Write a procedure to update salary in emp table based on following rules.
Exp< =35 then no Update
Exp> 35 and <=38 then 20% of salary
Exp> 38 then 25% of salary


delimiter //
create procedure upSalByExy()
begin
declare vSal double(9,2) default 0;
declare vExpY,vEmpno int default 0;
declare vSet int default 0;

declare EMPCUR CURSOR for 
select sal,timestampdiff(year,hiredate,curdate()),empno from emp;

declare CONTINUE HANDLER for NOT FOUND set vSet = 1;

open EMPCUR;

label1: loop
fetch EMPCUR into vSal,vExpY,vEmpno;

if vSet = 1 then
	leave label1;
end if;

if vExpY >35 and vExpY<38 then
update emp
set sal = vsal * 1.20
where empno = vEmpno;

elseif vExpy >38 then
update emp
set sal = vsal * 1.25
where empno = vEmpno;

end if;


end loop label1;

close EMPCUR;

end // 

-- _____________________
11. Write a function to compute the following. Function should take sal and hiredate
as i/p and return the cost to company.

DA = 15% Salary, HRA= 20% of Salary, TA= 8% of Salary.
Special Allowance will be decided based on the service in the company.
< 1 Year Nil
>=1 Year< 2 Year 10% of Salary
>=2 Year< 4 Year 20% of Salary
>4 Year 30% of Salary

delimiter //
create function computeCTC(in pSal double(9,2),in pHiredate date)
returns double(9,2)
DETERMINISTIC
begin
declare vCTC double(9,2) default 0;
declare vExp int default 0 ;


    DECLARE vDA DOUBLE(9,2);
    DECLARE vHRA DOUBLE(9,2);
    DECLARE vTA DOUBLE(9,2);
    DECLARE vSpecial DOUBLE(9,2);



    -- Basic components
    SET vDA = 0.15 * pSal;
    SET vHRA = 0.20 * pSal;
    SET vTA = 0.08 * pSal;


set vExp =  timestampdiff(year,pHiredate,curdate());

--set vCTC = vCTC * 1.15 * 1.20 * 1.08; //this is wrong

if vExp < 1 then 
set vSpecial = 0;
elseif vExp >= 1 and vExp<2 then
set vSpecial = 0.10* pSal;
elseif vExp >=2 and vExp<4 then
set vSpecial =0.20* pSal;
else
set vSpecial = 0.30 * pSal;
end if;

-- Compute total CTC

set vCTC = pSal + vHRA + vDA + vTA +vSpecial;
return vCTC;

end // 
delimiter ;

----------------------


 Write a procedure and a function.
Function: write a function to calculate number of years of experience of employee.(note:
pass hiredate as a parameter)

Procedure: Capture the value returned by the above function to calculate the additional
allowance for the emp based on the experience.
Additional Allowance = Year of experience x 3000
Calculate the additional allowance
and store Empno, ename,Date of Joining, and Experience in
years and additional allowance in Emp_Allowance table.

create table emp_allowance(
empno int,
ename varchar(20),
hiredate date,
experience int,
allowance decimal(9,2));

delimiter //
create function calExpYear(pHiredate date)
returns int
begin
declare vExp int default 0;

set vExp = timestampdiff(year,pHiredate,curdate());

return vExp;
end//

create procedure calAllw()
begin
declare vset int default 0;
declare vExpYear,vEmpno int default 0;
declare vEname varchar(30) default '';
declare vHiredate date;
declare vAdditionalAllowance double(9,2) default 0;

declare EMPCUR CURSOR for 
    select empno,ename,hiredate from emp;
declare Continue handler for Not FOUND set vset  = 1 ;

open EMPCUR;

label1: loop
fetch empcur into vEmpno,vEname,vHiredate;
if vset = 1 then
    leave label1;
end if;

set vExpYear = calExpYear(vHiredate);
set vAdditionalAllowance = vExpYear * 3000;

insert into emp_allowance(empno,ename,hiredate,experience,allowance)
values(vEmpno,vEname,vHiredate,vExpYear,vAdditionalAllowance);

end loop label1;

close EMPCUR;

end //

delimiter ;




