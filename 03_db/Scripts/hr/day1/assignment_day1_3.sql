use hr;

-- 1. JOBS 테이블에서 JOB_TITLE의 정보만 출력되도록 하시오
select job_title
from jobs;

-- 2. DEPARTMENTS 테이블의 내용 전체를 출력하는 SELECT문을 작성하시오
select  *
from departments;

-- 3. EMPLOYEES 테이블에서 이름(FIRST_NAME, LAST_NAME), 이메일(EMAIL), 전화번호(PHONE_NUMBER), 고용일(HIRE_DATE)만 출력하시오
select first_name,last_name, email, phone_number, hire_date
from employees;

-- 4. EMPLOYEES 테이블에서 고용일(HIRE_DATE), 이름(FIRST_NAME, LAST_NAME), 월급(SALARY)를 출력하시오
select hire_date, first_name, last_name, salary
from employees;

-- 5. EMPLOYEES 테이블에서 월급(SALARY)이 9000 이상인 사람의 이름(FIRST_NAME, LAST_NAME)과 월급을 출력하시오
select first_name, last_name, salary
from employees
where salary >= 9000;

-- 6. EMPLOYEES 테이블에서 월급(SALARY)이 7000 이상이면서 JOB_ID가 'FI_ACCOUNT'인 사람의 이름(FIRST_NAME, LAST_NAME)과 전화번호(PHONE_NUMBER)를 출력하시오
select first_name, last_name,  phone_number
from employees
where (salary >= 7000)and(job_id='fi_account');

-- 7. EMPLOYEES 테이블에서 고용일이 2005-01-01 ~ 2010-01-01 사이인 사원의 전체 내용을 출력하시오
select *
from employees e 
where hire_date between '2005-01-01'and'2010-01-01';

-- 8. EMPLOYEES 테이블에서 FIRST_NAME 끝이 sa로 끝나는 사원의 전체 이름을 출력하시오
select first_name, last_name
from employees
where first_name like '%sa';

-- 9. EMPLOYEES 테이블에서 전화번호 처음 3자리가 515가 아닌 사원의 이름, 전화번호를 출력하시오
select first_name,  last_name
from employees
where phone_number not like '515%';

-- 10. EMPLOYEES 테이블에서 DEPARTMENT_ID가 90 또는 60이고 고용일이 2005-01-01 ~ 2010-12-01이면서, 월급이 9000 이상인 사원의 전체 정보를 출력하시오
select *
from employees
where (department_id = 90 or department_id = 60)
and hire_date between '2005-01-01'  and '2010-12-01'
and salary >= 9000;

commit;