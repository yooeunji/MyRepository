-- 1.1 ����� ��
select * from emp;

-- 1.2 Ư�� �����͸� ����
select empno, ename from emp;

--1.3 ��� ������
select ename, sal, sal*12 from emp;

--1.4 �ε� �����ʹ�(Ű�����̴�)
select ename, sal, comm, sal*12+comm from emp;  --comm�� ������ �޾ư��� ���ʽ�
select ename, sal, comm, sal*12+nvl(comm, 0) from emp;
select ename as �̸�, sal as ����, comm ���ʽ�, sal*12+nvl(comm, 0) as ���� from emp ; --as�� �ɼ��̴�. �ֵ�ȳֵ� �������

--1.6 Concatenation ������(���ڿ� ����, �ϳ��� �ݷ����� ��������������)
select (empno ||'-'|| ename) as "�����ȣ-�̸�" from emp;  --�����̳� Ư�����ڰ� ���ԵǾ��ִ� ��Ī����Ҷ�
select ename, sal*12+NVL(comm, 0) "A N N S A L" from emp;

--1.7 DISTINCT Ű���� (�ߺ�����)
--����� �ִ� �μ� ��ȣ��? (�ϳ��� ����ص� �Ǵµ� �� ����ϳ�?)
select deptno from emp;
--�ϳ����� ������ �ϰ�������� distinct�����ش�
select distinct deptno from emp;

--------------------------------------------------------------------------------

--������ �ۼ�
select ename from emp where deptno=20;
--2.1 �� ������



