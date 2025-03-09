use hr;

CREATE TABLE Students (
    student_id INT PRIMARY KEY,
    name VARCHAR(50),
    address VARCHAR(100),
    department VARCHAR(50),
    office VARCHAR(50)
);

INSERT INTO Students (student_id, name, address, department, office) VALUES
(501, '박지성', '맨체스터', '컴퓨터과', '공학관101'),
(401, '김연아', '서울', '체육학과', '체육관101'),
(402, '장미란', '강원도', '체육학과', '체육관101'),
(502, '추신수', '클리블랜드', '컴퓨터과', '공학관101');

CREATE TABLE Courses (
    course_name VARCHAR(50) PRIMARY KEY,
    classroom VARCHAR(50)
);

INSERT INTO Courses (course_name, classroom) VALUES
('데이터베이스', '공학관110'),
('스포츠경영학', '체육관103'),
('자료구조', '공학관111');


CREATE TABLE Enrollments (
    student_id INT,
    course_name VARCHAR(50),
    grade DECIMAL(2,1),
    PRIMARY KEY (student_id, course_name),
    FOREIGN KEY (student_id) REFERENCES Students(student_id),
    FOREIGN KEY (course_name) REFERENCES Courses(course_name)
);

INSERT INTO Enrollments (student_id, course_name, grade) VALUES
(501, '데이터베이스', 3.5),
(401, '데이터베이스', 4.0),
(402, '스포츠경영학', 3.5),
(502, '자료구조', 4.0),
(501, '자료구조', 3.5);

SELECT S.student_id, S.name, S.address, S.department, S.office, E.course_name, C.classroom, E.grade
FROM Students S
JOIN Enrollments E ON S.student_id = E.student_id
JOIN Courses C ON E.course_name = C.course_name
ORDER BY E.course_name, S.student_id desc;
