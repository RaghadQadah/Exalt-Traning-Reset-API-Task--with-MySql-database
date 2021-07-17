DROP TABLE IF EXISTS Person;

CREATE TABLE Person (
                               id INT AUTO_INCREMENT  PRIMARY KEY,
                               name VARCHAR(250) NOT NULL,
                               age INT NOT NULL,
                               job VARCHAR(250) NOT NULL

);