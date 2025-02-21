-- DB(DataBase)란?
-- -> 한 조직에 필요한 정보를 여러 응용 시스템에서 공용할 수 있도록 논리적으로
-- 연관된 데이터를 모으고, 중복되는 데이터를 최소화하여 구조적으로 통합/저장해 놓은 것

-- Data란?
-- -> 어떠한 자료 혹은 실제 값을 의미함-흩어져있는 어떤자료
--	- 에베레스트의 높이 : 8848m (8848 미터 라는 데이터)

-- 정보란?
-- -> 데이터를 기반으로 하여 의미를 부여한 것-우리가 찾고자하는것 
--	 - 에베레스트는 세계에서 가장 높은 산 (가장 높은 산이라는 정보)

-- DBMS?
-- 데이터베이스에서 데이터를 추출, 조작, 정의, 제어 등을 할 수 있게 해주는 데이터베이스 전용 관리 프로그램
-- 데이터 독립화(데이터저장소를 변경하거나 데이터베이스 크기를 변경하더라도 기존 프로그램에 영향이 없어야한다)
-- 데이터 중복 최소화(데이터가 여러개 중복되어 저장되는것 방지 - 하나의 테이블에 저장하고 공유하여 중복을 최소화 )
-- 데이터 무결성 보장(데이터가 어떤경로로 들어오든 데이터에 오류가 있으면 안됨 - 제약조건을 두어 반드시 들어가야 하는 데이터 , 중복되면 안되는 데이터등을 관리 )
-- 스키마(schema)는 데이터베이스에서 데이터의 구조, 조직, 그리고 관계를 정의하는 틀 또는 청사진을 의미 
-- 데이터베이스 스키마는 데이터가 어떻게 저장될지, 데이터 간에 어떤 관계가 있는지, 데이터에 어떤 제약 조건이 적용되는지 등을 명시
-- 스키마는 데이터베이스를 설계할 때 논리적 구조를 제공
-- 오라클에서의 스키마
-- 오라클에서 "스키마"는 데이터베이스 사용자에게 소속된 객체(테이블, 뷰, 인덱스, 스토어드 프로시저 등)의 집합을 의미
-- 오라클에서 스키마를 생성한다는 것은 사실상 사용자를 생성하는 것이며 해당 사용자에게 소속된 데이터베이스 객체를 관리하는 것
-- 오라클 데이터베이스는 여러 스키마를 포함할 수 있으며, 각 스키마는 고유한 사용자에 의해 소유되고 관리됨



-- MySQL에서의 데이터베이스
-- MySQL에서 "데이터베이스"는 스키마와 거의 동일한 개념으로 사용됨 .
-- MySQL에서 데이터베이스를 생성하면, 그 데이터베이스 내에 테이블, 뷰, 인덱스 등을 생성할 수 있는 논리적 컨테이너로 취급하며, 각 데이터베이스는 서로 독립적인 객체 집합을 가짐.
-- MySQL에서는 사용자와 데이터베이스가 명시적으로 연결되지 않습니다. 대신, 사용자에게 특정 데이터베이스에 대한 접근 권한을 부여할 수 있습니다.

-- 차이점
-- 오라클에서는 "스키마"가 사용자와 직접 연결되어 사용자별로 데이터베이스 객체를 관리하는 개념. 
-- 반면, MySQL에서는 "데이터베이스"가 이러한 역할을 하며, 사용자는 별도로 권한을 부여받아 여러 데이터베이스에 접근할 수 있다. 

-- 구조적 차이: 오라클에서는 데이터베이스 내부에 여러 스키마(사용자)가 존재할 수 있으며, 각 스키마는 자신의 객체를 가짐
--          MySQL에서는 각 데이터베이스가 독립적인 객체 집합을 가지며, 사용자는 권한에 따라 하나 이상의 데이터베이스에 접근가능함
-- 관리 방식: 오라클에서는 스키마(사용자) 생성 시 데이터베이스 객체에 대한 권리가 함께 부여되고 
--          MySQL에서는 데이터베이스를 생성한 후, 별도로 사용자에게 해당 데이터베이스에 대한 접근 권한을 설정해야함

show databases;
-- 'localhost' 대신 '%' 을 사용할 경우 외부에서도 접속 가능
-- CREATE USER '사용자아이디'@'접속허용IP' IDENTIFIED BY '비밀번호';
-- GRANT ALL PRIVILEGES ON 권한허용DB명.* TO '사용자아이디' @ '접속허용IP';

-- create user scott@'%' IDENTIFIED by 'tiger';

GRANT ALL PRIVILEGES ON *.* TO 'scott'@'%';

-- 'localhost' 대신 '%' 을 사용할 경우 외부에서도 접속 가능
-- CREATE USER '사용자아이디'@'접속허용IP' IDENTIFIED BY '비밀번호';
-- GRANT ALL PRIVILEGES ON 권한허용DB명.* TO '사용자아이디' @ '접속허용IP';

select * from mysql.user;

-- create database scott;

use scott;

show grants;

createuser hr@'%' IDENTIFIEDby by 'hr';
-- GRANT ALL PRIVILEGES ON *.* TO 'hr'@'%'

-- 권한삭제
-- 사용자는 필요한데 권한을 삭제하고 싶은 경우
-- 기본형식 (사용자 삭제아닙니다) --
-- REVOKE ALL ON DB명.테이블명 FROM 사용자아이디;

-- 사용자의 모든권한 삭제 --
-- REVOKE ALL ON *.* FROM 사용자아이디;
-- REVOKE ALL ON *.* FROM 'hr'@'%';

-- SHOW GRANTS;
-- -- 해당 사용자의 권한이 조회됨 --
-- SHOW GRANTS FOR 사용자아이디@접속허용IP
-- SHOW GRANTS FOR 'hr'@'%'; -- GRANT USAGE ON *.* TO `hr`@`%`   사용자가 접속할수있는권한

-- 유저 삭제
-- 사용자 아이디 삭제 --
-- DROP USER '사용자아이디';
-- DROP USER 'hr'@'%';

create table bonus

(
	
	ename varchar(10),
	
	job varchar(9),
	
	sal int,
	
	comm int

);
-- mysql 8.0.17 버전부터 int 타입에 길이 설정하는 건 더 이상 지원하지 않기로 하고 향후 버전부터는 제거될 기능 중 하나라서 경고
-- integer display width is deprecated and will be removed in a future release.

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

select * from emp;




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

select * from emp;
-- 회원  이름, 급여정보 조회

select ename, sal from emp;

--별칭 추가
select ename as name, sal as  salary from emp;

-- as 생략 가능, 한칸 띄우고 별칭작성

-- 수정
update emp
set sal = 1500, job = 'manager'
where empno = 7934;

select *
from emp
where  empno = 7934;

-- 삭제
delete
from emp
where empno = 7934;

delete
from emp;

rollback; -- 제일 마지막으로 커밋한 시점까지 롤백

-- https://www.w3schools.com/mysql/mysql_operators.asp

-- --------------------------------문제 

-- 1.emp 테이블에서 모든 직원의 이름과 직업을 조회
SELECT ename, job 
FROM emp;

-- 2.dept 테이블에서 모든 컬럼을 조회
SELECT * 
FROM dept;

-- 3.emp 테이블에서 sal(급여)이 3000 이상(>=)인 직원의 정보를 조회
select *
from emp
where sal >= 3000;

-- 4.salgrade 테이블에서 급여 등급(grade)이 3인 데이터를 조회
select *
from salgrade
where grade =3;

-- 5.emp 테이블에서 hiredate가 '1981-12-03' 이후인 직원의 이름과 입사일을 조회
SELECT ename, hiredate
FROM emp
WHERE hiredate > '1981-12-03';

-- 6.job이 'manager'인 직원들의 empno, ename, job을 조회
select empno, ename, job
from emp
where job = 'manager';

-- 1.dept 테이블에  데이터를 추가
-- deptno: 50
-- dname: 'it'
-- loc: 'seattle' 
-- 방법1
insert into dept(deptno, dname, loc)
VALUES (50, 'IT', 'Seattle');


--  방법2 - 테이블에 바로 추가
INSERT INTO dept (deptno, dname, loc)
SELECT 50, 'IT', 'Seattle';

-- 2.emp 테이블에  데이터를 추가
-- empno: 8000
-- ename: 'lee'
-- job: 'developer'
-- mgr: 7782
-- hiredate: '2023-01-10'
-- sal: 4500
-- deptno: 50
insert into emp (empno, ename, job, mgr, hiredate, sal, deptno)
values (8000, 'lee', 'developer', 7782, '2023-01-10', 4500, 50);

-- 방법2  - 테이블에 바로 추가
insert into emp (empno, ename, job, mgr, hiredate, sal, deptno)
values (8000, 'lee', 'developer', 7782, '2023-01-10', 4500, null, 50);

-- 1.emp 테이블에서 직원 smith의 급여를 1000으로 변경
UPDATE emp 
SET sal = 1000 
WHERE ename = 'smith';

-- 2.dept 테이블에서 deptno가 20인 부서의 loc을 'san francisco'로 변경
update dept
set loc = 'san francisco'
where deptno=20;

-- 3.emp 테이블에서 empno가 7839인 직원의 직업을 'president -> ceo'로 변경
update emp
set job='ceo'
where empno = 7839;

-- 1.emp 테이블에서 ename이 'lee'인 데이터를 삭제
delete
from emp
where ename = 'lee';

-- 2.dept 테이블에서 deptno가 50인 부서를 삭제
delete
from dept
where deptno = 50;

-- 3.salgrade 테이블에서 grade가 5인 데이터를 삭제
delete
from salgrade
where grade = 5;
commit;

select distinct job from  emp;
select *from emp;

select distinct deptno, job from emp;
select distinct deptno, job from emp order by deptno;

-- 비교연산
/*
=	같다	WHERE job = 'manager'
!= 또는 <>	같지 않다	WHERE deptno <> 10
>	초과	WHERE sal > 2000
<	미만	WHERE sal < 2000
>=	이상	WHERE sal >= 2000
<=	이하	WHERE sal <= 2000

**/

-- 급여가 3000이상인 직원 조회
select * from emp where sal > 3000;

-- 논리 연산자 (and, or, not)
-- 직급이 'manager'이고 급여가 2500초과인직원 조회

select * from emp
where job='manager'and sal>2500;

-- 직급이 'salesman'이거나 급여가 3000 초과인 직원 조회
select *
from emp
where job = 'salman'
or sal >3000;

-- 직급이 'clerk'가 아닌 직원 조회
select * from emp where not job = "clerk";

-- NOT을 AND, OR과 함께 사용
-- 직급이 'clerk' 또는 'manager'가 아닌 직원 조회
select * from emp where not (job='clerk' or job='manager');
select * from emp where not job='clerk' and not job='manager';