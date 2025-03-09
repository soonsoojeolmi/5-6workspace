-- 그룹함수와 단일행함수
-- 단일행함수는 각 행에 대해 하나의 값을 반환하며,
-- 그룹함수는 여러 행에 대해 하나의 결과를 반환한다.

-- 단일행 함수
-- 문자 관련 함수: LENGTH, CONCAT, SUBSTR, UPPER, LOWER, INSTR 등

-- CONCAT: 문자열을 하나로 합친다.
USE scott;
-- day01 에 emp insert 까지하고 시작 
SELECT CONCAT(CONCAT(EMPNO, ':'), ENAME) AS CONCAT_RESULT FROM EMP;

-- LENGTH: 문자열의 길이를 구한다.
SELECT LENGTH(ENAME) FROM EMP;

-- TRIM: 주어진 문자열의 앞/뒤에서 지정한 문자를 제거한다.
SELECT ENAME, TRIM(BOTH 'A' FROM ENAME) FROM EMP;  -- 양쪽 끝에서 'A' 제거
SELECT ENAME, TRIM(LEADING 'A' FROM ENAME) FROM EMP;  -- 왼쪽에서 'A' 제거
SELECT ENAME, TRIM(TRAILING 'A' FROM ENAME) FROM EMP;  -- 오른쪽에서 'A' 제거

-- REPLACE: 문자열을 대체한다.
SELECT ENAME,REPLACE(ENAME, ' ', '') FROM EMP;
SELECT REPLACE('서울시 강남구 역삼동', '역삼동', '삼성동') AS VAL;

-- SUBSTR: 문자열의 일부를 잘라낸다.
SELECT ENAME, 
       SUBSTR(HIREDATE, 3, 2) AS 입사년도, 
       SUBSTR(HIREDATE, 6, 2) AS 입사월, 
       SUBSTR(HIREDATE, 9, 2) AS 입사일
FROM EMP;

-- NULL 처리 함수: NVL 대신 IFNULL 사용
-- IFNULL(컬럼명, NULL일 때 대체할 값)

select  ename,comm,  ifnull(comm,  0) comml from emp;

-- 숫자 관련 함수: ABS, MOD, ROUND, FLOOR, TRUNC, CEIL

-- ABS: 절대값을 구하는 함수
SELECT ABS(-10) AS COL1, ABS(10) AS COL2;

-- MOD: 나머지를 구하는 함수
SELECT MOD(10, 5) AS COL1, MOD(10, 3) AS COL2;

-- ROUND: 반올림 함수
SELECT ROUND(123.456) AS ROUND_NO_DECIMAL;  -- 반올림
SELECT ROUND(123.456, 1) AS ROUND_ONE_DECIMAL;  -- 소수점 첫째 자리까지출력, 둘째자리 반올림

-- FLOOR: 내림 함수
SELECT FLOOR(123.456) AS FLOOR_RESULT;

-- TRUNC (MySQL에서는 TRUNC 대신 ROUND를 사용)
SELECT ROUND(123.456, 0) AS TRUNC_RESULT;  -- 소수점 이하 자르기

-- CEIL: 올림 함수
SELECT CEIL(123.456) AS CEIL_RESULT;

-- 날짜 함수: CURDATE(), MONTHS_BETWEEN() 대신 TIMESTAMPDIFF 사용
-- SYSDATE 대신 NOW() 또는 CURRENT_TIMESTAMP 사용

-- SYSDATE: 현재 날짜와 시간을 반환 (NOW() 또는 CURRENT_TIMESTAMP로 대체)
SELECT NOW() AS SYSDATE;  -- 또는
SELECT CURRENT_TIMESTAMP AS SYSDATE;

-- TIMESTAMPDIFF: 두 날짜 사이의 개월 수 계산
SELECT ENAME, HIREDATE, TIMESTAMPDIFF(MONTH, HIREDATE, NOW()) AS MONTHS_BETWEEN FROM EMP;

-- ADD_MONTHS: 날짜에 개월 수 더하기
SELECT DATE_ADD(NOW(), INTERVAL 5 MONTH) AS ADD_5_MONTHS;
SELECT DATE_ADD(NOW(), INTERVAL -1 MONTH) AS SUBTRACT_1_MONTH;

-- WEEKDAY(): 주어진 날짜의 요일을 반환 월요일(0)부터 일요일(6)까지
select WEEKDAY(NOW());
SELECT NOW() AS TODAY, DATE_ADD(NOW(), INTERVAL (7 - WEEKDAY(NOW())) + 3 DAY) AS NEXT_THURSDAY;

-- LAST_DAY: 해당 월의 마지막 날을 반환
SELECT LAST_DAY(NOW()) AS LAST_DAY_OF_MONTH;
SELECT DATE_ADD(NOW(), INTERVAL -1 MONTH) AS SUBTRACT_1_MONTH;

-- WEEKDAY(): 주어진 날짜의 요일을 반환 (월요일(0)부터 일요일(6)까지)
SELECT WEEKDAY(NOW());

-- 다음주 목요일
SELECT NOW() AS TODAY, DATE_ADD(NOW(), INTERVAL (7 - WEEKDAY(NOW())) + 3 DAY) AS NEXT_THURSDAY;

-- LAST_DAY: 해당 월의 마지막 날을 반환
SELECT LAST_DAY(NOW()) AS LAST_DAY_OF_MONTH;

SELECT DATE_ADD(NOW(), INTERVAL -1 MONTH) AS SUBTRACT_1_MONTH;

-- WEEKDAY(): 주어진 날짜의 요일을 반환 (월요일(0)부터 일요일(6)까지)
SELECT WEEKDAY(NOW());

-- 다음주 목요일
SELECT NOW() AS TODAY, DATE_ADD(NOW(), INTERVAL (7 - WEEKDAY(NOW())) + 3 DAY) AS NEXT_THURSDAY;

-- EXTRACT: 특정 날짜에서 연도, 월, 일을 추출
SELECT EXTRACT(YEAR FROM CURRENT_TIMESTAMP) AS 년도,
       EXTRACT(MONTH FROM CURRENT_TIMESTAMP) AS 월,
       EXTRACT(DAY FROM CURRENT_TIMESTAMP) AS 일;

-- LAST_DAY: 해당 월의 마지막 날을 반환
SELECT LAST_DAY(NOW()) AS LAST_DAY_OF_MONTH;

SELECT CAST('2020$12$12' AS DATE);
SELECT CAST('2020/12/12' AS DATE);
SELECT CAST('2020%12%12' AS DATE);
SELECT CAST('2020@12@12' AS DATE);

SELECT CAST('2020-12-12' AS DATE); -- 표준 형식SELECT CAST('2020-12-12' AS DATE); -- 표준 형식
SELECT CAST(REPLACE('2020$12$12', '$', '-') AS DATE);
-- %Y → 4자리 연도 (예: 2024)
-- %y → 2자리 연도 (예: 24 → 2024)
-- %m → 2자리 월 (예: 01 ~ 12)
-- %d → 2자리 일 (예: 01 ~ 31)
-- %H → 24시간 형식 시 (예: 00 ~ 23)
-- %i → 분 (예: 00 ~ 59)
-- %s → 초 (예: 00 ~ 59)
SELECT STR_TO_DATE('2020$12$12', '%Y$%m$%d');

SELECT STR_TO_DATE('2024-02-12 14:30:45', '%Y-%m-%d %H:%i:%s');

-- IF(조건, true_value, false_value):
select if(100>200, '참이다', '거짓이다');

-- IFNULL(검사할 값, NULL일 경우 반환할 대체 값.):
-- 값이 NULL인 경우 대체 값을 반환
select ifnull(null, '널이다')val1,
		ifnull(100,'널이다')val2;

-- NULLIF는 두 값이 같으면 NULL을 반환하고, 그렇지 않으면 첫 번째 값을 반환하는 함수
select nullif(100,100),nullif(200,100);

-- CASE문
/* CASE
        WHEN 조건식 THEN 결과값
        WHEN 조건식 THEN 결과값
    ELSE 결과값
    END*/

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

-- 단일 값 비교(CASE value WHEN ...)
SELECT 	CASE 10   -- 비교 대상 값: 10
		WHEN 1  THEN  '일'
		WHEN 5  THEN  '오'
		WHEN 10 THEN  '십' 
		ELSE '모름'
	END AS 'CASE연습';

-- 조건식 비교 방식의 CASE 구문

-- 직원의 급여를 인상하고자 한다
-- 직급코드가 SALESMAN인 직원은 급여의 10%를 인상하고
-- 직급코드가 MANAGER인 직원은 급여의 15%를 인상하고
-- 직급코드가 clerk 직원은 급여의 20%를 인상한다.
-- 그 외 직급의 직원은 5%만 인상한다.
-- 직원 테이블에서 직원명, 직급코드, 급여, 인상급여(위 조건)을
-- 조회하세요

select * from emp;

SELECT 
    ename, 
    job, 
    sal, 
    CASE 
        WHEN job = 'salesman' THEN sal * 1.1
        WHEN job = 'manager' THEN sal * 1.15
        WHEN job = 'clerk' THEN sal * 1.2
        ELSE sal * 1.05
    END AS changesal
FROM emp;


-- 사원의 급여에 따라 등급을 구분하는 CASE 구문
  -- 사번, 사원명, 급여를 EMP 테이블에서 조회하고 
-- 급여가 2500만원 초과이면 '고급'
-- 급여가 1500~2500만원이면 '중급'
-- 그이하는 초급으로 출력하고 별칭은 'GRADE' 이라고한다.

SELECT 
    empno, 
    ename, 
    sal, 
    CASE 
        WHEN sal > 2500 THEN '고급'
        WHEN sal BETWEEN 1500 AND 2500 THEN '중급'
        ELSE '초급'
    END AS GRADE
FROM EMP;

commit;
commit;

-- day3
use scott;

-- COUNT, SUM, AVG, MIN, MAX 그룹 함수\

-- 부서별 집계
select count(sal), sum(sal), avg(sal), min(sal), max(sal)
from emp
where job  = 'salesman';

-- 직급별 집계
select count(sal), sum(sal), avg(sal), min(sal), max(sal)
from emp
group by job;

-- 직급별 집계
select count(sal), sum(sal) salary, avg(sal), min(sal), max(sal)
from emp
having sum(sal)>5000
order by sum(sal) desc;

-- COUNT(*)은 사용 가능하지만, 다른 그룹 함수(SUM, AVG, MAX, MIN 등)에서는 (*)를 사용할 수 없다.
-- COUNT(*) → 테이블의 모든 행 개수 반환 (NULL 포함)
-- COUNT(컬럼명) → 특정 컬럼의 NULL이 아닌 값만 카운트
-- COUNT(DISTINCT 컬럼명) → 특정 컬럼에서 중복 제거 후 유니크한 값 개수만 카운트

select * from emp;
select count(mgr), count(*), count(distinct mgr)
from emp;

-- 집계함수 

-- ROLLUP 함수 : 그룹별로 중간 집계 처리를 하는 함수 
-- GROUP BY 절에서만 사용 
-- 그룹별로 묶여진 값에 중간집계와 총집계를 구할때 사용
-- 그룹별로 계산된 값에대한 총집계가 자동으로 추가된다. 
-- 인자로 전달한 그룹중에서 가장 먼저 지정한 그룹(컬럼)별 합계와 총합계

select 
	deptno,
	job,
	sum(sal)
from emp
group by DEPTNO, JOB with rollup
order  by 1;

-- 직급별 집계
select 
	job,
	sum(sal)
from emp
group by job with rollup
order  by 1;

-- GROUPING 오라클에서 그룹 상태 확인-mysql에서는 지원 x
SELECT 
    DEPTNO,
    JOB,
    SUM(SAL),
    CASE
        WHEN DEPTNO IS NULL AND JOB IS NOT NULL THEN '직급별 합계'
        WHEN DEPTNO IS NOT NULL AND JOB IS NULL THEN '부서별 합계'
        WHEN DEPTNO IS NULL AND JOB IS NULL THEN '총합계'
        ELSE '그룹별 합계'
    END AS 구분
FROM EMP
GROUP BY DEPTNO, JOB WITH ROLLUP
ORDER BY 1;

--@SET SPERATION(집합연산)
-- 두개 이상의 테이블에서 조인을 사용하지 않고 연관된 데이터를 조회하는 방법
-- 여러 개의 질의 결과를 연결하여 하나로 결합하는 방식 
-- 각 테이블의 조회 결과를 하나의 테이블에 합쳐서 반환함 

-- 조건 : SELECT 절의 "컬럼 수가 동일"해야 함
--       SELECT 절의 동일 위치에 존재하는 "컬럼의 데이터 타입이 상호호환"가능해야 함.

-- UNION, UNION ALL, INTERSECT, MINUS

-- UNION : 여러 개의 쿼리 결과를 하나로 합치는 연산자. 중복된 행을 제외하고 하나로 합친다.

select
	empno,
	ename,
	deptno,
	sal
from   emp
where deptno = 10;

select
	empno,
	ename,
	deptno,
	sal
from emp
where sal >1500;

-- UNION ALL : 여러 개의 쿼리 결과를 하나로 합치는 연산자. 중복된 행을 포함한다.

select 
    empno, 
    ename, 
    deptno, 
    sal 
from emp 
where DEPTNO = 10
union all
select 
    empno, 
    ename, 
    deptno, 
    sal 
from emp 
where sal > 1500;

-- INTERSECT : 여러 개의 SELECT 한 결과에서 공통된 부분만 결과로 추출 (MySQL에서는 JOIN으로 대체 가능)

select 
    empno, 
    ename, 
    deptno, 
    sal 
from emp 
where sal > 1500
and DEPTNO = 10;

-- MINUS : 선행 SELECT 결과에서 다음 SELECT 결과와 겹치는 부분을 제외한 나머지 부분만 추출
select
	empno,
	ename,
	deptno,
	sal
from emp
where  deptno = 10
and empno not in(select
					empno
				from emp
				where sal >  1500);

select 
    deptno,
    job,
    mgr,
    floor(avg(sal)) as avg_sal	
from emp 
group by deptno, job, mgr
union all
select 
    deptno,
    '' job,
    mgr,
    floor(avg(sal)) as avg_sal	
from emp 
group by deptno, mgr
union all
select 
	0 deptno,
    job,
    mgr,
    floor(avg(sal)) as avg_sal	
from emp 
group by job, mgr;

/*@ 조인문(JOIN)
-> 여러테이블의 레코드를 조합하여 하나의 열로 표현한 것, 하나로 합쳐서 결과를 조회한다. 
-> 두 개 이상의 테이블에서 연관성을 가지고 있는 데이터들을 따로 분류하여 새로운 가상의 테이블을 이용하여 출력
   서로 다른 테이블에서 각각 공통값을 이용함으로써 필드를 조합함
   즉, 관계형 데이터베이스에서 SQL 문을 이용한 테이블간 "관계"를 맺는 방법
   
* 
- ANSI 표준구문
(ANSI(미국 국립 표준 협회 => 산업표준을 재정하는 단체)에서 지정한 DBMS에 상관없이 공통으로 사용하는 표준 SQL)
*/

/* INNER JOIN: 테이블 간 공통된 값만 추출
   EMP 테이블과 DEPT 테이블을 조인한다.
   EMPNO, ENAME, JOB, DEPTNO, LOC 컬럼을 검색하며, 조인 조건은 DEPTNO
*/

select * from emp;
select * from dept;

/* INNER JOIN: 테이블 간 공통된 값만 추출
   EMP 테이블과 DEPT 테이블을 조인한다.
   EMPNO, ENAME, JOB, DEPTNO, LOC 컬럼을 검색하며, 조인 조건은 DEPTNO
*/

/* OUTER JOIN: 두 테이블의 지정된 컬럼 값이 일치하지 않는 행도 포함 */

/* 1. LEFT OUTER JOIN: EMP 테이블의 모든 정보를 보여주고, DEPT 테이블은 매칭되는 정보만 표시 */

/* 2. RIGHT OUTER JOIN: DEPT 테이블의 모든 정보를 보여주고, EMP 테이블은 매칭되는 정보만 표시 */

CREATE TABLE member6(
	no INT AUTO_INCREMENT PRIMARY KEY,
	id varchar(10),
	pw varchar(10),
	name varchar(10),
	tel varchar(10),
	create_date timestamp

);


INSERT INTO MEMBER6
VALUES(NULL,'m01', '1', '리사', '010',NOW());
INSERT INTO MEMBER6
VALUES(NULL,'2', '2', '주혁', '010',NOW());
INSERT INTO MEMBER6
VALUES(NULL,'3', '3', '3', '010',NOW());
INSERT INTO MEMBER6
VALUES(NULL,'4', '4', '4', '010',NOW());
INSERT INTO MEMBER6
VALUES(NULL,'5', '5', '5', '010',NOW());
COMMIT;

SELECT * FROM MEMBER6;
CREATE TABLE CATEGORY(

  C_CODE INT PRIMARY KEY,
  C_NAME VARCHAR(30) CHECK(C_NAME IN('공통', '운동', '등산', '게임', '낚시', '요리', '기타'))  
);


INSERT INTO CATEGORY (C_CODE, C_NAME) VALUES(10, '공통');
INSERT INTO CATEGORY (C_CODE, C_NAME) VALUES(20, '운동');
INSERT INTO CATEGORY (C_CODE, C_NAME) VALUES(30, '요리');
INSERT INTO CATEGORY (C_CODE, C_NAME) VALUES(70, '기타');

COMMIT;
SELECT * FROM CATEGORY;
CREATE TABLE BOARD2 (
  NO INT PRIMARY KEY AUTO_INCREMENT,
  CATEGORY_CODE INT,
  TITLE VARCHAR(100),
  CONTENT TEXT NOT NULL,
  WRITER INT NOT NULL,
  COUNT INT DEFAULT 0 NOT NULL,
  CREATED_DATE DATETIME DEFAULT CURRENT_TIMESTAMP,
  MODIFIED_DATE DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  STATUS CHAR(1) DEFAULT 'Y',
  FOREIGN KEY (CATEGORY_CODE) REFERENCES CATEGORY(C_CODE),
  FOREIGN KEY (WRITER) REFERENCES MEMBER6 (NO)
);
INSERT INTO BOARD2 
( CATEGORY_CODE, TITLE, CONTENT, WRITER) 
VALUES( 10, '게시글 1 ', '게시글1 CONTENT 입니다 ', 1);

INSERT INTO BOARD2 
( CATEGORY_CODE, TITLE, CONTENT, WRITER) 
VALUES( 10, '게시글 2 ', '게시글2 CONTENT 입니다 ', 3);
INSERT INTO BOARD2 
( CATEGORY_CODE, TITLE, CONTENT, WRITER) 
VALUES( 10, '게시글 3 ', '게시글3 CONTENT 입니다 ', 1);
INSERT INTO BOARD2 
( CATEGORY_CODE, TITLE, CONTENT, WRITER) 
VALUES( 10, '게시글 4 ', '게시글4 CONTENT 입니다 ', 1);
INSERT INTO BOARD2 
( CATEGORY_CODE, TITLE, CONTENT, WRITER) 
VALUES( 10, '게시글 5 ', '게시글5 CONTENT 입니다 ', 3);

COMMIT;
SELECT * FROM BOARD;
DROP TABLE IF EXISTS BOARD2;
DROP TABLE IF EXISTS CATEGORY;
DROP TABLE IF EXISTS MEMBER6;
/* INNER JOIN: 게시글을 쓴 사람의 정보 조회 */

/* OUTER JOIN: 모든 회원이 작성한 글의 정보 */


/* 글을 기준으로 글을 쓴 사람의 정보 조회 */

/* 글을 기준으로 글을 쓴 사람의 정보 조회 */


use scott;
# TOP-N 분석이란?
	TOP-N 질의는 columns에서 가장 큰 n개의 값 또는 가장 작은 n개의 값을 요청할 때
	사용됨
	예) 가장 적게 팔린 제품 10가지는? 또는 회사에서 가장 소득이 많은 사람 3명은?
*/
-- 인라인 뷰를 활용한 TOP-N 분석
-- ORDER BY 한 결과에 ROWNUM을 붙임
-- ROWNUM은 행 번호를 의미함

SELECT 
    ROW_NUMBER() OVER () AS ROWNUM,
    ENAME, 
    SAL
FROM EMP;

SELECT 
    ROW_NUMBER() OVER () AS ROWNUM,
    ENAME, 
    SAL
FROM EMP
order by sal desc;

SELECT *
from(
	select
    ROW_NUMBER() OVER (order by sal desc) as ROWNUM,
    ENAME, 
    SAL
	FROM EMP
	)a
where rownum <=5;

select
    ROW_NUMBER() OVER (order by sal desc) as ROWNUM,
    ENAME, 
    SAL
FROM EMP
limit 5;

-- 급여 평균 2위 안에 드는 부서의 부서코드와 부서명, 평균급여를 조회
select deptno, dname, sal_avg
from (
    select a.DEPTNO, b.DNAME, avg(a.sal) sal_avg,
           ROW_NUMBER() OVER (order by avg(a.sal) desc) AS ROWNUM
    from emp a
    join dept b on a.DEPTNO = b.DEPTNO
    group by a.DEPTNO, b.DNAME
    limit 2
);

select deptno, dname, sal_avg
from (
    select a.DEPTNO, b.DNAME, avg(a.sal) sal_avg,
           ROW_NUMBER() OVER (order by avg(a.sal) desc) AS ROWNUM
    from emp a
    join dept b on a.DEPTNO = b.DEPTNO
    group by a.DEPTNO, b.DNAME
) a
where rownum <= 2;

-- RANK() OVER(정렬기준) / DENSE_RANK() OVER(정렬기준)
-- 순위를 매기는 함수
-- RANK() OVER : 동일한 순위 이후에 다음 순위는 점프
-- DENSE_RANK() OVER : 동일한 순위 이후에도 다음 순위는 1씩 증가

-- 직원 정보에서 급여를 가장 많이 받는 순으로 이름, 급여, 순위 조회
-- SCOTT FORD 동일, 그다음 JONES 순위가 1 증가


-- DENSE_RANK()를 사용하여 급여 순위를 조회
select 
    ename, 
    sal, 
    DENSE_RANK() over (order by sal desc) as "순위"
from emp;

-- RANK()를 사용하여 급여 순위를 조회
select 
    ename, 
    sal, 
    RANK() over (order by sal desc) as "순위"
from emp;

-- 상위 5명의 직원 급여와 순위 조회
SELECT 
    이름, 
    급여, 
    순위, 
    순위2
FROM (
    SELECT 
        ENAME AS "이름",
        SAL AS "급여",
        RANK() OVER (ORDER BY SAL DESC) AS "순위",
        DENSE_RANK() OVER (ORDER BY SAL DESC) AS "순위2"
    FROM EMP
) A
WHERE 순위 <= 5;

-- WITH 구문 사용
-- 서브쿼리에 이름을 붙여 사용하며, 중복 작성을 줄일 수 있음
with topn_sal as (
    select 
        empno,
        ename,
        sal
    from emp
    order by sal desc
)

select 
    row_number() over() as "순위",
    ename,
    sal
from topn_sal;

-- 여러개의 with절

with tot_sal as (
    select sum(sal) sal1
    from emp
),
avg_sal as (
    select avg(sal) sal2
    from emp
)

select
    '합계' col1, sal1 col2
from tot_sal
union all
select
    '평균' col1, sal2 col2
from avg_sal
union all
select '직원', sum(sal) col2
from emp;

-- 부서별 급여 합계가 전체 급여 총 합의 20%보다 많은 부서 조회
-- 첫 번째 방법: HAVING 절 사용
SELECT
    a.DEPTNO AS DEPTNO,
    b.DNAME AS DEPT_TITLE,
    SUM(a.SAL) AS TOTAL_SAL
FROM EMP a
JOIN DEPT b ON a.DEPTNO = b.DEPTNO
GROUP BY a.DEPTNO, b.DNAME
HAVING SUM(a.SAL) > (
    SELECT SUM(SAL) * 0.2 FROM EMP
);

-- 두 번째 방법: 인라인뷰 사용
SELECT
    a.DEPTNO AS DEPTNO,
    b.DNAME AS DEPT_TITLE,
    SUM(a.SAL) AS TOTAL_SAL
FROM EMP a
JOIN DEPT b ON a.DEPTNO = b.DEPTNO
GROUP BY a.DEPTNO, b.DNAME
where TOTAL_SAL > (
    SELECT SUM(SAL) * 0.2 
    FROM EMP
);

-- 세 번째 방법: WITH 구문 사용
with tot_sal as (
    SELECT
        a.DEPTNO AS DEPTNO,
        b.DNAME AS DEPT_TITLE,
        SUM(a.SAL) AS TOTAL_SAL
    FROM EMP a
    JOIN DEPT b ON a.DEPTNO = b.DEPTNO
    GROUP BY a.DEPTNO, b.DNAME
)

select * 
from tot_sal
where TOTAL_SAL > (
    SELECT SUM(SAL) * 0.2 
    FROM EMP
);

--  클러스터형 인덱스 (Clustered Index)
-- 데이터는 클러스터형 인덱스에 따라 정렬된 상태로 저장
-- PRIMARY KEY가 클러스터형 인덱스로 자동 생성
-- 한 테이블에 하나만 존재


-- 보조인덱스
-- 클러스터형 인덱스와 독립적으로 생성 가능하며, 한 테이블에 여러 개의 생성가능
-- 
-- 보조 인덱스는 데이터를 직접 저장하지 않고 클러스터형 인덱스의 키를 가리키는 포인터를 저장 하여
-- 검색 시 클러스터형 인덱스를 참조
-- 데이터 정렬에 영향을 미치지 않는다.

-- 클러스터형 인덱스는 데이터와 인덱스가 결합되어 저장되며, 
-- PRIMARY KEY 또는 UNIQUE NOT NULL 제약 조건이 있는 컬럼으로 자동 생성
-- 보조 인덱스는 클러스터형 인덱스를 참조하는 추가적인 인덱스로, 한 테이블에 여러 개 생성
-- 검색 속도와 효율성에서 클러스터형 인덱스가 더 빠르지만, 보조 인덱스는 특정 컬럼에 대한 추가적인 검색 최적화를 제공

-- 클러스터형 인덱스:
-- 데이터의 기본 검색 기준이 되는 경우.
-- 예: id 같은 기본 키, 고유한 값(UNIQUE).
-- 보조 인덱스:
-- 검색 최적화가 필요한 다른 컬럼에 추가.
-- 예: email 같은 자주 조회되는 값.

CREATE TABLE  tbl1
	(	a INT PRIMARY KEY, 
		b INT,
		c INT
	);

SHOW INDEX FROM tbl1;

CREATE TABLE  tbl2
	(	a INT PRIMARY KEY,
		b INT UNIQUE,
		c INT UNIQUE,
		d INT
	);

show index from tbl2;

CREATE TABLE  tbl5
	(	a INT UNIQUE NOT NULL,  
		b INT UNIQUE ,
		c INT UNIQUE,
		d INT PRIMARY KEY 
	);

show index from tbl5;

DROP TABLE IF EXISTS usertbl;

CREATE TABLE usertbl 
( userID  char(8) NOT NULL PRIMARY KEY,  
  name    varchar(10) NOT NULL,
  birthYear   int NOT NULL,
  addr	  nchar(2) NOT NULL 
 );

show index from usertbl;

INSERT INTO usertbl VALUES('JNK', '제니', 1996, '서울'); 
INSERT INTO usertbl VALUES('LRS', '리사', 1997, '태국');  
INSERT INTO usertbl VALUES('KJS', '카리나', 2000, '서울'); 
INSERT INTO usertbl VALUES('WNS', '윈터', 2000, '부산');  
INSERT INTO usertbl VALUES('MHJ', '민지', 2004, '서울');

commit;
select * from usertbl;

ALTER TABLE usertbl DROP PRIMARY KEY ;

ALTER TABLE usertbl 
	ADD CONSTRAINT pk_name PRIMARY KEY(name);

select * from usertbl;

CREATE INDEX idx_usertbl_addr 
   ON usertbl (addr);

show index from usertbl;

CREATE UNIQUE INDEX idx_usertbl_birtyYear 
	ON usertbl (birthYear);

-- CREATE UNIQUE INDEX idx_usertbl_birtyYear
-- ON usertbl (birthYear);
--

CREATE INDEX idx_usertbl_name_birthYear
    ON usertbl (addr, birthYear);

DROP INDEX idx_usertbl_name_birthYear ON usertbl;

-- type = ALL → FULL SCAN 발생! (테이블 전체를 검색함)
-- possible_keys = NULL → 사용할 수 있는 인덱스 없음

-- type = ref → 인덱스를 활용한 INDEX SCAN 수행
-- key = idx_usertbl_name_birthYear → 인덱스가 적용됨
-- Extra = Using index → 실제 테이블을 검색하지 않고 인덱스에서 직접 값을 가져옴 (효율적)


-- MySQL은 보조 인덱스보다 PRIMARY KEY를 우선적으로 사용
-- type 정리
-- const - PRIMARY KEY 또는 UNIQUE 인덱스를 사용한 단일 행 검색 (가장 빠름)
-- eq_ref - JOIN에서 PRIMARY KEY 또는 UNIQUE 인덱스를 사용한 1:1 검색
-- ref - 보조 인덱스(INDEX)를 사용한 검색 (일부 값 일치)
-- range - BETWEEN, <, >, IN 등의 범위 검색
-- index - 인덱스를 전체 스캔 (ORDER BY, GROUP BY에서 발생)
-- ALL - 테이블 전체를 검색 (인덱스 없음, 가장 느림)
EXPLAIN SELECT * FROM usertbl WHERE userid = 'JNK'; 
explain SELECT * FROM usertbl WHERE name = '제니';
explain SELECT * FROM usertbl WHERE addr = '서울';

select * from usertbl where userid='jnk';
select * from usertbl where name='제니';

-- VIEW (뷰)
-- SELECT 쿼리문을 저장한 객체이다
-- 실질적인 데이터를 저장하고 있지 않음
-- 테이블을 사용하는 것과 동일하게 사용할 수 있다.
-- 매번 자주 사용하는 쿼리문을 정의해 두고 싶을 때 뷰를 생성
-- VIEW를 한번 만들어두고 마치 테이블처럼 사용한다고 생각!
-- CREATE [OR REPLACE] VIEW 뷰이름 AS 서브쿼리

CREATE OR REPLACE VIEW V_EMP AS
SELECT 
    EMPNO AS 사번,      
    ENAME AS 이름,     
    DEPTNO AS 부서     
FROM EMP;

select * from  v_emp;
drop view v_emp;

SHOW FULL TABLES WHERE Table_Type = 'VIEW';

CREATE OR REPLACE VIEW V_DEPT AS
select * from DEPT;

select * from DEPT;
select * from V_DEPT;

-- 생성된 뷰를 이용해 DML(INSERT, UPDATE, DELETE) 사용 가능

-- 뷰에 INSERT
INSERT INTO V_DEPT
    (DEPTNO, DNAME, LOC)
VALUES
    (50, 'MULTI', 'MULTI');
SELECT * FROM V_DEPT;
SELECT * FROM DEPT;

-- 뷰에 UPDATE
UPDATE V_DEPT
SET DNAME = 'YouTuber'
WHERE DEPTNO = '50';

-- 뷰에 DELETE
DELETE FROM V_DEPT WHERE DEPTNO = '50';

-- DML 명령어로 조작이 불가능한 경우
-- 1. 뷰 정의에 포함되지 않은 컬럼을 조작하는 경우
-- 2. 뷰에 포함되지 않은 컬럼 중에, 베이스가 되는 테이블 컬럼이 NOT NULL 제약 조건이 지정된 경우
-- 3. 산술 표현식으로 정의된 경우
-- 4. JOIN을 이용해 여러 테이블을 연결한 경우 (지원 가능하지만 조작 불가)
-- 5. DISTINCT 포함한 경우
-- 6. 그룹 함수나 GROUP BY를 포함한 경우

CREATE OR REPLACE VIEW V_GROUPDEPT
AS
SELECT 
    DEPTNO,
    SUM(SAL) AS 합계, 
    AVG(SAL) AS 평균 
FROM EMP
GROUP BY DEPTNO;

select * from V_GROUPDEPT;

 -- WITH CHECK OPTION을 사용하면, 특정 조건을 만족하는 행만 추가/수정 가능하도록 제한
CREATE or replace VIEW view_seoul_users AS 
SELECT * FROM usertbl WHERE addr = '서울'
WITH CHECK OPTION;

INSERT INTO view_seoul_users VALUES ('JSM', '지수', 1995, '서울'); -- 성공
INSERT INTO view_seoul_users VALUES ('JSM', '지수', 1995, '부산');

-- 트리거(TRIGGER)
-- > 데이터베이스가 미리 정해놓은 조건을 만족하거나 어떠한 동작이 수행되면
-- 자동적으로 수행되는 객체를 의미
-- - 트리거의 사전적 의미 : 연쇄 반응
-- 트리거는 테이블이나 뷰가 INSERT, UPDATE, DELETE등의 DML문에 의해 데이터가 입력,수정,삭제
-- 될 경우 자동으로 실행 됨 
-- 제품 입출고에 따른 재고 변화 자동 업데이트
-- DELIMITER $$를 사용하여 MySQL이 블록 종료를 $$로 인식하게함
-- 기본적으로 MySQL은 ;를 명령문 종료로 인식 ,;(종료) 를 내부에 많이 사용하기떄문,
-- 제품 테이블 생성

commit;

DROP TABLE IF EXISTS product;


CREATE TABLE PRODUCT (
    PCODE INT PRIMARY KEY AUTO_INCREMENT,
    PNAME VARCHAR(30),
    BRAND VARCHAR(30),
    PRICE DECIMAL(10, 2),
    STOCK INT DEFAULT 0
);

-- 제품 입출고 테이블 생성
CREATE TABLE PRO_DETAIL (
    DCODE INT PRIMARY KEY AUTO_INCREMENT,
    PCODE INT,
    PDATE DATE,
    AMOUNT INT,
    STATUS ENUM('입고', '출고'),
    FOREIGN KEY (PCODE) REFERENCES PRODUCT(PCODE)
);

-- 제품 및 입출고 데이터 조회
SELECT * FROM PRODUCT;
SELECT * FROM PRO_DETAIL;

-- 제품 테이블에 데이터 삽입
INSERT INTO PRODUCT (PNAME, BRAND, PRICE) VALUES ('울트라', 'SS', 900000);
INSERT INTO PRODUCT (PNAME, BRAND, PRICE) VALUES ('아이폰', 'AP', 900000);
INSERT INTO PRODUCT (PNAME, BRAND, PRICE) VALUES ('샤오미', 'SOM', 900000);

DELIMITER $$  

CREATE TRIGGER TRG_PRO_DETAIL_INSERT
AFTER INSERT ON PRO_DETAIL
FOR EACH ROW
BEGIN
    IF NEW.STATUS = '입고' THEN
        UPDATE PRODUCT
        SET STOCK = STOCK + NEW.AMOUNT
        WHERE PCODE = NEW.PCODE;
    ELSEIF NEW.STATUS = '출고' THEN
        UPDATE PRODUCT
        SET STOCK = STOCK - NEW.AMOUNT
        WHERE PCODE = NEW.PCODE;
    END IF;
END $$-- 트리거 종료

INSERT INTO PRO_DETAIL (PCODE, PDATE, AMOUNT, STATUS) VALUES (1, CURDATE(), 5, '입고');
INSERT INTO PRO_DETAIL (PCODE, PDATE, AMOUNT, STATUS) VALUES (2, CURDATE(), 10, '입고');
INSERT INTO PRO_DETAIL (PCODE, PDATE, AMOUNT, STATUS) VALUES (3, CURDATE(), 20, '입고');

INSERT INTO PRO_DETAIL (PCODE, PDATE, AMOUNT, STATUS) VALUES (1, CURDATE(), 1, '출고');
INSERT INTO PRO_DETAIL (PCODE, PDATE, AMOUNT, STATUS) VALUES (2, CURDATE(), 5, '출고');
INSERT INTO PRO_DETAIL (PCODE, PDATE, AMOUNT, STATUS) VALUES (3, CURDATE(), 13, '출고');

DELIMITER //
CREATE TRIGGER trg_deletedMemberTBL  
	AFTER DELETE 
	ON memberTBL 
	FOR EACH ROW 
BEGIN 
	-- OLD 테이블의 내용을 백업테이블에 삽입
	INSERT INTO deletedMemberTBL 
		VALUES (OLD.memberID, OLD.memberName, OLD.memberAddress, CURDATE() ); 
END //
DELIMITER ;

CREATE TABLE testTbl2 
  (id  int AUTO_INCREMENT PRIMARY KEY, 
   userName VARCHAR(100),                   
   age int );
INSERT INTO testTbl2 VALUES (NULL, '이유', 25);
INSERT INTO testTbl2 VALUES (NULL, '공유', 22);
INSERT INTO testTbl2 VALUES (NULL, '주혁', 21);
commit;

START TRANSACTION;  
SELECT * FROM testTbl2 WHERE id = 1;  

UPDATE testTbl2  
SET userName = '제니2'  
WHERE id = 1;  

COMMIT;

SET autocommit = 0; -- 활성화
