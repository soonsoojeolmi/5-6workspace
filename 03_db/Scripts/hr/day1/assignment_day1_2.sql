use hr;

create table employees2(
id  INT auto_increment primary key,
name VARCHAR(100),
department VARCHAR(100),
salary INT
);

insert into employees2
values(1, '제니', 'Engineering', 63000);

insert into employees2
values(2, '리사', 'Sales', 55000);

insert into employees2
values(3, '현수', 'Engineering', 60000);

insert into employees2
values(4, '원중', 'Sales', 55000);

commit;

-- employees 테이블에서 모든 직원 정보를 조회
select * from employees2;

-- department가 Engineering인 직원의 이름과 급여를 조회
select name, salary
from employees2
where department = 'Engineering';

-- 3번 사원의 급여를 65000으로 수정
update employees2
set salary = 65000
where id = 3;

-- 3번 사원을 삭제
delete from employees2
where id = 3;

-- 급여가 높은 순서대로 직원 정보를 조회
-- insert into employees2 values(3, '현수', 'Engineering', 60000);
select *
from employees2
order by salary desc;

-- 급여가 높은 순서대로 상위 2명의 직원 정보를 조회
select  * 
from employees2
order by salary desc
limit 2;

commit;