CREATE TABLE TEACHER (
    CD_TEACHER BIGINT AUTO_INCREMENT PRIMARY KEY,
    NAME VARCHAR(100) NOT NULL,
    EMAIL VARCHAR(100) UNIQUE NOT NULL,
    DEPARTMENT VARCHAR(50) COMMENT 'Departamento/especialidade do professor'
);

INSERT INTO TEACHER(NAME, EMAIL, DEPARTMENT) 
VALUES 
('Darielson Souza', 'darielson@gmail.com', 'Inteligencia Artificial'),
('Alanio Silva', 'alanio@gmail.com', 'Computador e Sociedade');