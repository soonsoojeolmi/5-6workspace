use scott;

 DROP TABLE IF EXISTS travel;
 CREATE TABLE travel (
   no INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
   district VARCHAR(50) NOT NULL,
   title VARCHAR(512) NOT NULL,
   description TEXT, 
   address VARCHAR(512),
   phone VARCHAR(256)   
);

select * from travel;