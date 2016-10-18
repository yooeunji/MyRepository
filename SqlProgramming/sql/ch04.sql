--Section01 그룹함수
--사원들의 전체 봉급의 합
select sum(sal) from emp;
--월급을 가장 많이 받아가는 사원의 정보
select *from emp where sal=max(sal);
select *from emp where sal=(select max(sal) from emp);
--평균 월급보다 많이 받아가는 사원의 정보
select *from emp where sal>(select avg(sal) from emp);
--전체 사원의 수=전체 행 수
select count(*) from emp;  --전체 행수를 계산하라
select count(empno) from emp; --empno의 갯수를 카운팅해라
select count(comm) from emp; --널은 계산이 안된다
--평균 월급보다 많이 받아가는 사원의 수
select count(*) from emp where sal>(select avg(sal) from emp);

--1.1 그룹 함수와 NULL 값
--1.2 그룹 함수와 단순 컬럼
select avg(comm)as from emp;   --/4(null을 제외한 comm의 수로 나눈다)
select sum(comm)/count(comm) from emp; --위의 결과와같다
select sum(comm)/count(*) from emp; --전체수로 나눈다

select count(distinct job) from emp;

--Section02 데이터 그룹 :Group By 절
--부서별로 평균 봉급은?
select deptno, sal from emp order by deptno;
select deptno, round(avg(sal),1) from emp group by deptno order by deptno; --select 그룹핑컬럼+집계함수   from emp group by deptno;  //중요해★★★★★★★★★★★

--직급 별 평균 봉급은?
select job, avg(sal) from emp group by job;
--부서별(1차 그룹핑) 직급별(2차 그룹핑) 평균 봉급은?
select deptno, job, avg(sal)from emp group by deptno, job order by deptno;

--Section 03 그룹 결과 제한 : HAVING 절
--부서별 평균봉급이 400이상인 부서번호와 평균 봉금은?
select deptno, avg(sal) from emp group by deptno having avg(sal)>500 ;
--그룹핑 전의 조건 where
--그룹핑 후의 조건 having
--사원중에서 부서별 평균 봉급이 300이상인 부서와 평균 봉급은? 중요해★★★★★★★★★★★
select deptno, avg(sal) from emp where job='사원' group by deptno having avg(sal)>=300;
--사원중에서 부서별 평균 봉금이 300이상인 부서와 사원의 평균 봉급 및 수는?
select deptno, avg(sal), count(empno) from emp where job='사원' group by deptno having avg(sal)>=300;
--사원 직급을 제외하고 급여 총액이 1000이넘는 직급에 대해서 직급과 급여 총액을 표시하라.
select job, sum(sal) as salary from emp where not job='사원' group by job having sum(sal)>=1000 order by salary;




