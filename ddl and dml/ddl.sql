-- **Database level:**
-- Display all the database
show databases;
-- Enter a certain database
use oocl_test;
-- Create a database
create database test;
-- Create the database of the designated character set
create database zeju default character set = 'utf8';
-- Display the creation information fo the database
show create database zeju;
-- Revise the codes of the database
set character_set_database = utf8;
-- Delete a database
drop database ze;
-- **Table level**
-- Revise table name
alter table student rename students;
-- Revise the field's data type
alter table student modify sex varchar(36);
-- Revise field name
alter table student change sex gender varchar(32);
-- Add field
alter table student add des varchar(128);
-- Delete field
alter table student drop des;
-- Revise the table's storage engine
alter table student engine = INNODB;
-- Delete the table's foreign key restriant
alter table student drop foreign key leuma,e;
-- Delete a table
drop table student;