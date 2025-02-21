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