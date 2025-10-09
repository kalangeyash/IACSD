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
create procedure displayWRTaverage()
begin
declare vAvg sal int default 0;
select avg(sal) into vAvg from emp;
if vAvg > sal  then

end //
delimiter ;

