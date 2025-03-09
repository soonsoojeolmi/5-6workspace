use scott;

START TRANSACTION;  
SELECT * FROM testTbl2 WHERE id = 1;  

UPDATE testTbl2  
SET userName = '제니2'  
WHERE id = 1;  

COMMIT;

SELECT * FROM testTbl2 WHERE id = 1;
