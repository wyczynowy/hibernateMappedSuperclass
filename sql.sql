create database employeesdb;

use employeesdb;

CREATE TABLE employees (
  person_id int(11) NOT NULL AUTO_INCREMENT,
  name varchar(45) NOT NULL,
  company varchar(45) NOT NULL,
  PRIMARY KEY (person_id)
) ENGINE=InnoDB DEFAULT CHARSET=latin1