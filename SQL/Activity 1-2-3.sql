use employees;

/*Activity1*/
create database sdet4_Mythili;
use sdet4_Mythili;

/*Activity2*/
CREATE TABLE salesman (
    salesman_id int primary key,
    name varchar(32),
    city varchar(32),
    commission int
);

desc salesman;

INSERT INTO salesman VALUES(5001, 'James Hoog', 'New York', 15);
select * from salesman;

INSERT INTO salesman VALUES
    (5002, 'Nail Knite', 'Paris', 13),
    (5005, 'Pit Alex', 'London', 11), 
    (5006, 'McLyon', 'Paris', 14), 
    (5007, 'Paul Adam', 'Rome', 13),
    (5003, 'Lauson Hen', 'San Jose', 12);

select * from salesman;

/*Activity3*/
SELECT salesman_id, city FROM salesman;
SELECT * FROM salesman WHERE city='Paris';
SELECT salesman_id, commission FROM salesman WHERE name='Paul Adam';




