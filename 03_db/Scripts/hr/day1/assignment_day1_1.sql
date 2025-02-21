-- hr / hr 계정 만들기
CREATE USER hr@'%' IDENTIFIED BY 'hr';
GRANT ALL PRIVILEGES ON *.* TO 'hr'@'%';

-- hr 데이터 베이스 만들기
CREATE DATABASE hr;
USE hr;

create table bonus

(
	
	ename varchar(10),
	
	job varchar(9),
	
	sal int,
	
	comm int

);

create table dept
(
	deptno int,
	dname varchar(14),
	loc varchar(13)
);

create table emp
(
	empno int,
	ename varchar(10),
	job varchar(9),
	mgr int,
	hiredate date,
	sal int,
	comm decimal(7,2),
	deptno int
);

create table salgrade
(
	grade int,
	losal  int,
	hisal  int
);

insert into dept
   (deptno, dname, loc)
 values
   (10, 'accounting', 'new york');
insert into dept
   (deptno, dname, loc)
 values
   (20, 'research', 'dallas');
insert into dept
   (deptno, dname, loc)
 values
   (30, 'sales', 'chicago');
insert into dept
   (deptno, dname, loc)
 values
   (40, 'operations', 'boston');
commit;

insert into salgrade
   (grade, losal, hisal)
 values
   (1, 700, 1200);
insert into salgrade
   (grade, losal, hisal)
 values
   (2, 1201, 1400);
insert into salgrade
   (grade, losal, hisal)
 values
   (3, 1401, 2000);
insert into salgrade
   (grade, losal, hisal)
 values
   (4, 2001, 3000);
insert into salgrade
   (grade, losal, hisal)
 values
   (5, 3001, 9999);
commit;


insert into emp
   (empno, ename, job, mgr, hiredate, sal, deptno)
values
   (7369, 'smith', 'clerk', 7902, 
    '1980-12-17', 800, 20);
insert into emp
   (empno, ename, job, mgr, hiredate, sal, comm, deptno)
values
   (7499, 'allen', 'salesman', 7698, 
    '1981-02-20', 1600, 300, 30);
insert into emp
   (empno, ename, job, mgr, hiredate, sal, comm, deptno)
values
   (7521, 'ward', 'salesman', 7698, 
    '1981-02-22', 1250, 500, 30);
insert into emp
   (empno, ename, job, mgr, hiredate, sal, deptno)
values
   (7566, 'jones', 'manager', 7839, 
    '1981-04-02', 2975, 20);
insert into emp
   (empno, ename, job, mgr, hiredate, sal, comm, deptno)
values
   (7654, 'martin', 'salesman', 7698, 
    '1981-09-28', 1250, 1400, 30);
insert into emp
   (empno, ename, job, mgr, hiredate, sal, deptno)
values
   (7698, 'blake', 'manager', 7839, 
    '1981-05-01', 2850, 30);
insert into emp
   (empno, ename, job, mgr, hiredate, sal, deptno)
values
   (7782, 'clark', 'manager', 7839, 
    '1981-06-09', 2450, 10);
insert into emp
   (empno, ename, job, mgr, hiredate, sal, deptno)
values
   (7788, 'scott', 'analyst', 7566, 
    '1987-04-19', 3000, 20);
insert into emp
   (empno, ename, job, hiredate, sal, deptno)
values
   (7839, 'king', 'president', 
    '1981-11-17', 5000, 10);
insert into emp
   (empno, ename, job, mgr, hiredate, sal, comm, deptno)
values
   (7844, 'turner', 'salesman', 7698, 
    '1981-09-08', 1500, 0, 30);
insert into emp
   (empno, ename, job, mgr, hiredate, sal, deptno)
values
   (7876, 'adams', 'clerk', 7788, 
    '1987-05-23', 1100, 20);
insert into emp
   (empno, ename, job, mgr, hiredate, sal, deptno)
values
   (7900, 'james min', 'clerk', 7698, 
    '1981-12-03', 950, 30);
insert into emp
   (empno, ename, job, mgr, hiredate, sal, deptno)
values
   (7902, 'ford ford', 'analyst', 7566, 
    '1981-12-03', 3000, 20);
insert into emp
   (empno, ename, job, mgr, hiredate, sal, deptno)
values
   (7934, 'millera', 'clerk', 10000, 
    '1982-01-23', 1300, 10);
commit;

-- 문제
-- 1.emp 테이블에서 sal(급여)이 2000 이상인 직원의 empno, ename과 job을 sal 오름차순으로 정렬하여 조회
select empno, ename, job
from emp
order by sal asc;

-- 2. deptno가 20인 직원들의 empno, ename, sal을 급여 기준 내림차순 정렬
select empno, ename, sal
from emp
where deptno=20
order by sal desc;

-- 3.sal이 2000 이상이면서 comm(커미션)이 NULL이 아닌 직원들의 empno, ename, sal, comm을 조회
select empno, ename, sal, comm
from emp
where (sal>=2000)and comm is not null;

-- 4.job이 'manager'이거나 sal이 2500 이상 4000 이하인 직원들의 empno, ename, job, sal을 조회
-- sal기분 내림차순, 중복되는경우 이름기준 오름차순으로 출력
select empno, ename, job, sal
from emp
where job = 'manager' or (sal between 2500 and 4000)
order by sal desc, ename asc;

-- 5.deptno가 20이 아닌 직원 중에서 sal이 1500 이상인 직원들의 empno, ename, deptno, sal을 조회
select empno, ename, deptno, sal
from emp
where  deptno <> 20 and sal >= 1500;

-- 6.1981년에 입사한 직원 중에서 급여가 높은 상위 3명 조회
select *
from emp
where year(hiredate) = 1981
order by sal
limit 3;

-- 7.ename이 'A'로 시작하지 않는 직원들의 empno, ename을 조회
select empno, ename
from emp
where ename not like 'A%'

-- 8.ename이 5글자인 직원들의 empno, ename을 조회
select empno, ename
from emp
where ename like '_____';

-- 9.deptno가 10, 20, 30인 직원들의 empno, ename, deptno를 조회
-- 부서번호 기준 오름차순, 같은 부서 내에서는 이름 기준 내림차순
select empno, ename, deptno
from emp
where deptno in(10,20,30)
order by deptno asc, ename desc;

-- 10.급여 순위가 3번째인 직원의 empno, ename, sal을 조회 (LIMIT 사용)
select empno, ename, sal
from emp
order by sal
limit 1 offset 2;

commit;