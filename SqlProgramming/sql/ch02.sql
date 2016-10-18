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
 
 ----------------------------------------
 --조건절 작성
select ename from emp where deptno=20;
--2.1 비교 연산자
select ename from emp where deptno!=20;
select ename from emp where deptno<>20;  --윗라인과 같은표현
select ename from emp where sal>=500;
select *from emp where ename='이문세';
--2.1.2 날짜 데이터 조회
--2005년 1월 1일 이전에 입사한 사원의 정보
select * from emp where hiredate < '2005/01/01';  --컴파일러가 이런 문자열을 날짜로 변환해서 인식
select * from emp where hiredate < '2005-01-01'; --슬레쉬도 되고 데쉬도 된다
select * from emp where hiredate < to_date('2005/01/01', 'YYYY/MM/DD');
--2.2 논리 연산자
--2.2.1 AND 연산자
--10번 부서에 소속된 사원 중에서 직급이 과장인 사원
select *from emp where deptno=10 and job='과장';
--2.2.2 OR 연산자
--10번 부서에 소속된 사원 또는 직급이 과장인 사원의 정보
select *from emp where deptno=10 or job='과장';
--월급이 400이상 500이하인 사원의 정보
select *from emp where 400<=sal and sal<=500;
--2.2.3 NOT 연산자
--10번 부서가 아닌 사원의 정보
select *from emp where deptno != 10;
select *from emp where deptno <> 10;
select *from emp where not deptno = 10;
--2.3 BETWEE
--월급이 400이상 500이하인 사원의 정보
select *from emp where 400<=sal and sal<=500; --연산자 세개사용
select *from emp where sal between 400 and 500; --연산자 한개사용(세개사용보단 한개가 좋겠지??)
select * from emp where ename between '바' and '자';

--2.4 IN 연산자
--보너스가 80이거나, 100이거나, 200인 사원의 정보
select *from emp where comm=80 or comm=100 or comm=200;
select *from emp where comm in (80,100,200);
--2.5 LIKE 연산자와 와일드 카드
--2.5.1 와일드카드(%)사용하기
--성이 이씨인 사원의 정보
select *from emp where ename between '이' and '익';
select *from emp where ename like '이%';
--이름 중에 '성'이 포함된 사원의 정보
select *from emp where ename like '%성%';
--2.5.1 와일드 카드(_) 사용하기
--이름중에 두번째 글자가 '성인 사원의 정보'
select *from emp where ename like '_성%';
--이름중에 '성'이 포함되지 않는 사원의 정보
select *from emp where not ename like '%성%';
--2.6 NULL을 위한 연산자
--보너스가 없는(null)인 사원의 정보
select *from emp where comm=null;
select *from emp where comm is null; --is는 null말고는 안온다
select *from emp where comm is not null;

--3.1 오름차순 정렬을 위한 ASC
select *from emp order by sal; --올림차순
select *from emp order by sal asc; --올림차순
select *from emp order by sal desc; --내림차순
select *from emp order by hiredate desc;
--입사날 순서(1차정렬) ->이름순(2차정렬)
select *from emp order by hiredate desc, ename asc; --같은 입사날짜있으면 그 안에서 이름순으로 올림차순해라(김 -> 조)

--30부서에서 월급이 400이상인 사원의 번호,이름, 연봉(내림차순)을 가져오시오 //시험문제야
select empno, ename, (sal*12+nvl(comm,0)) as yearsal from emp
where sal>400 and deptno=30
order by yearsal desc;








