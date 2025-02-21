use hr;

-- 멤버, 게시판, 댓글로 위와 같이 만들어보기 ppt28 참고
-- 과제
create table member (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    PW VARCHAR(100) NOT NULL,
    NAME VARCHAR(100) NOT NULL,
    TEL VARCHAR(20) NOT NULL
);

CREATE TABLE board (
    NO INT AUTO_INCREMENT PRIMARY KEY,
    TITLE VARCHAR(255) NOT NULL,
    CONTENT TEXT NOT NULL,
    WRITER INT NOT NULL,
    CONSTRAINT FK_Board_WRITER FOREIGN KEY (WRITER) REFERENCES member (ID)
);

CREATE TABLE reply (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    ORIID INT NOT NULL,
    CONTENT TEXT NOT NULL,
    WRITER INT NOT NULL,
    CONSTRAINT FK_Reply_ORIID FOREIGN KEY (ORIID) REFERENCES board (no),
    CONSTRAINT FK_Reply_WRITER FOREIGN KEY (WRITER) REFERENCES member (ID)
);

INSERT INTO member (PW, NAME, TEL) VALUES
('hyeonsu57', 'hyeonsu', '010-1234-5678'),
('wonjung34', 'wonjung', '010-5678-1234'),
('sungbin6', 'sungbin', '010-8765-4321');

INSERT INTO board (TITLE, CONTENT, WRITER) VALUES
('1번째', '1번째 게시글입니다.', 1),
('2번째', '2번째 게시글입니다.', 2),
('3번째', '3번째 게시글입니다.', 3);

INSERT INTO reply (ORIID, CONTENT, WRITER) VALUES
(1, '1-1번째 댓글입니다.', 2),
(1, '1-2번째 댓글입니다.', 3),
(2, '2-1번째 댓글입니다.', 1);

commit;