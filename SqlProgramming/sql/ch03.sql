--Section01 DUAL 테이블
select * from dual;
select 10+20 from dual;
select sysdate from dual;
--section02 숫자 함수
--2.1절대값을 구하는 ABS함수
SELECT ABS(-15) "Absolute" FROM DUAL;
----------------------------------------
update emp set sal=sal/7;
select *from emp;
rollback;
----------------------------------------
--소수 첫째짜리까지 나타내기(반올림)
select sal, round(sal) from emp;
select sal, round(sal, 1) from emp;
--바로 아래 정수
select sal, floor(sal) from emp;  --이값 바로 아래 정수
select sal, ceil(sal) from emp;
select sal, trunc(sal, 1) from emp;

--section03 문자 처리 함수
--3.1 대소문자 변환함수
select * from employees;
select phone_number from employees where lower(first_name)='steven';
--3.3 문자 조작 함수
--3.3.1 문자열 일부만 추출하는 SUBSTR 함수
select * from employees;
select substr(first_name, 1, 5) from employees;
--3.3.5 특정 기호로 채우는 LPAD/RPAD 함수
select lpad('oracle', 20, '*') from dual;
select rpad('oracle', 20, '*') from dual;
--10자리 공간에 사원의 이름을 다섯자리까지만 나오게하고 나머지는 *처리
select rpad(substr(first_name,1, 5), 10, '*') from employees;

--Section04 형 변환 함수
--4.1.1 날짜형을 문자형으로 변환하기 --원하는 형태의 문자열로 가지고오고싶을때 to_char를 쓴다.
select hire_date, to_char(hire_date, 'YYYY-MM-DD DAY') from employees;
--4.2 문자형을 날짜형으로 변환하기
select first_name, hire_date from employees where hire_date=to_date('06-17-2003', 'MM-DD-YYYY');

--Section05 날짜 함수
--5.1 DBMS의 현재 날짜
select sysdate from dual;
--DBMS의 현재 날짜를 "2016.10.17 월요일"로 변환 //셤문제
select to_char(sysdate, 'YYYY.MM.DD DAY') from dual;

--Section06   NULL을 다른값으로 변환하는 NVL함수
select salary*12 + nvl(commission_pct, 0)*salary from employees;
select nvl2(commission_pct,salary*12+commission_pct*salary, salary*12) from employees; --commision_pct가 널이아니면 앞에께 리턴, 널이면 뒤에께 리턴












