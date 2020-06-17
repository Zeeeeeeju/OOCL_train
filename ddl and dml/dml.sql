-- Insert record
insert into student values('001','Colin',18,'male'),('002','Emma',20,'female');
-- Revise record
update student set age = 33 where id = '001';
--  Delete record
delete from student where id = '001';
-- Search record
select * from student;