DROP TABLE if EXISTS professors;
CREATE TABLE professors (
id INTEGER AUTO_INCREMENT PRIMARY KEY,
first_name VARCHAR(250) NOT NULL,
last_name VARCHAR(250) NOT NULL,
department varchar
);

INSERT into professors(first_name, last_name, department) VALUES ('mina', 'beshai', 'CS');

DROP TABLE if EXISTS teachers;
CREATE TABLE teachers(
first_name VARCHAR(250) NOT NULL,
last_name VARCHAR(250) NOT NULL,
subject varchar
);

DROP TABLE if EXISTS employee;
CREATE TABLE employee(
name VARCHAR(250) NOT NULL,
position VARCHAR(250) NOT NULL,
id Long AUTO_INCREMENT PRIMARY KEY
);
INSERT into employee(name, position) VALUES ('alex','servant');
INSERT into employee(name, position) VALUES ('mina', 'mean');
INSERT into employee(name, position) VALUES ('marina', 'engineer');
