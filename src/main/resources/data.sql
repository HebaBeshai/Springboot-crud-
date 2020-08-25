DROP TABLE if EXISTS professors;
CREATE TABLE professors (
id INTEGER AUTO_INCREMENT PRIMARY KEY,
first_name VARCHAR(250) NOT NULL,
last_name VARCHAR(250) NOT NULL,
department varchar
);

INSERT into professors(first_name, last_name, department) VALUES ('mina', 'beshai', 'CS')