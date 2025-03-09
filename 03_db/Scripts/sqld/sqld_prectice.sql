-- sqld / sqld 계정 만들기
CREATE USER sqld@'%' IDENTIFIED BY 'sqld';
GRANT ALL PRIVILEGES ON *.* TO 'sqld'@'%';

-- hr 데이터 베이스 만들기
CREATE DATABASE sqld;
USE sqld;

