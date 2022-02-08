-- create database essentials;
-- drop database essentials;
-- show databases essentials;
-- use essentials;
-- show tables;

create table student(roll int,sname varchar(30),mark int);
-- describe student;
insert into student values(101,'mathan',100);
insert into student values(102,'raj',100);

select * from student;
-- to display the table
-- varchar takes relative size and used to store the string (adjustable)

update  student set mark=89 where sname='mathan';

-- set SQL_SAFE_UPDATES =0; to make the safe update disable

select * from student;
