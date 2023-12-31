CREATE TABLE USERS (
    id BIGINT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    USERNAME VARCHAR(100) NOT NULL,
    EMAIL VARCHAR(100) NOT NULL,
    PASSWORD VARCHAR(100) NOT NULL,
    ROLE VARCHAR(30)
) ENGINE=InnoDB DEFAULT CHARSET=UTF8;

INSERT INTO USERS (USERNAME, EMAIL, PASSWORD, ROLE) VALUES
('ADMIN', 'admin@gmail.com', 'root', 'ROLE_ADMIN'),
('Victor', 'victor@gmail.com', 'victor123', 'ROLE_CLIENT'),
('Darielson', 'darielson@gmail.com', 'darielson123', 'ROLE_CLIENT');