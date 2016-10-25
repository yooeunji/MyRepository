--Section01 서브쿼리의 기본개념
--테이블간의 데이터를 연결(join문으로 변경가능)

--1.1 단일 행 서브쿼리
--이문세 사원의 부서 이름은?
select dname
from dept
where deptno=(select deptno from emp where ename='이문세');
--조인
select dname
from emp, dept
where emp.depno=dep.deptno
      and ename='이문세';
      
--특별한 경우아니면 서브쿼리가 조인보다 훨씬빠르다. ->(같은값끼리 연결시키는것이 오래걸린다.)

--최저봉급을 받아가는 사원의 정보는?
select *
from emp
where sal=(select min(sal) from emp);
--평균봉급 이상을 받아가는 사원의 수는?
select count(*)
from emp
where sal>=(select avg(sal) from emp);

--Section02 다중행 서브쿼리
--서울에서 근무하는 사원의 이름은?
select ename
from emp
where deptno in (select deptno from dept where loc='서울'); --다중값일때는 in

--2.4 EXISTS 연산자
--사원이 1명이라도 존재하는 부서의 이름은?
select distinct dname
from emp e, dept d
where d.deptno=e.deptno;

--사원이 존재하지않는 부서의 이름은?
select dname
from dept 
left outer join emp
on dept.deptno=emp.deptno
where empno is null;

select dname
from dept
where not deptho in(
select distinct dname
from emp e, dept d
where d.deptno=e.deptno);

select dname 
from dept
where not exists (select * from emp where emp.deptno=dept.deptno);

--Section03 서브쿼리를 이용하여 테이블을 생성하고 데이터를 조작하기
--emp 테이블 복제해서 emp2로 만데세요?(하나의 DDL로 작성하시오)
--제약조건과 인덱스, nullable 복제되지않는다
create table emp2
as
select *from emp;  
--emp 테이블의 구조만 복제해서 emp3로 만드세요?
--제약조건과 인덱스는 복제하지않아도됨

create table emp3
as
select * from emp where 1=0;

--3.3 서버쿼리로 데이터를 삽입하기
--emp3을만들었다면 10번부서의 사원들만 복사하세요.
insert into emp3
select * from emp where deptno=10;

--3.4서브쿼리를 이용한 데이터변경
--20번 부서의 위치를 40번 부서의 위치로 변경하세요.
update dept 
set loc=(select loc from dept where deptno=40)
where deptno=20;
--3.5서브쿼리를 이용한 데이터 삭제
--영업부서의 사원을 삭제하세요
delete emp
where deptno=(select deptno from dept where dname='영업부');





