CREATE TABLE STUDENT (
    CD_STUDENT BIGINT AUTO_INCREMENT PRIMARY KEY,
    NAME VARCHAR(100) NOT NULL,
    AGE INT,
    EMAIL VARCHAR(100)
);

INSERT INTO STUDENT (NAME, AGE, EMAIL) 
VALUES ('Victor', 21, 'victor@gmail.com');