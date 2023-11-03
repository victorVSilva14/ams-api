CREATE TABLE registry(
	CD_REGISTRY BIGINT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    ENTRY_DATE_TIME DATETIME,
    EXIT_DATE_TIME DATETIME
) ENGINE=InnoDB DEFAULT CHARSET=UTF8; 


INSERT INTO registry(ENTRY_DATE_TIME, EXIT_DATE_TIME) VALUES ('2023-11-03 14:45:00' , '2023-11-03 15:45:00');
