-- 1.1 문장과 절
select * from emp;

-- 1.2 특정 데이터만 보기
select empno, ename from emp;

--1.3 산술 연산자
select ename, sal, sal*12 from emp;

--1.4 널도 데이터다(키워드이다)
select ename, sal, comm, sal*12+comm from emp;  --comm은 연말에 받아가는 보너스
select ename, sal, comm, sal*12+nvl(comm, 0) from emp;
select ename as 이름, sal as 월급, comm 보너스, sal*12+nvl(comm, 0) as 연봉 from emp ; --as는 옵션이다. 넣든안넣든 결과같다

--1.6 Concatenation 연산자(문자열 결합, 하나의 콜롬으로 가지고오고싶을때)
select (empno ||'-'|| ename) as "사원번호-이름" from emp;  --공백이나 특수문자가 포함되어있는 별칭사용할때
select ename, sal*12+NVL(comm, 0) "A N N S A L" from emp;

--1.7 DISTINCT 키워드 (중복제거)
--사원이 있는 부서 번호는? (하나만 출력해도 되는데 다 출력하네?)
select deptno from emp;
--하나씩만 나오게 하고싶을때는 distinct붙혀준당
select distinct deptno from emp;


