# 1.Query the existence of 1 course

select exists(select id from course where id='8');

# 2.Query the presence of both 1 and 2 courses

select exists(select id from course where id='1' limit 1) and exists(select id from course where id='2' limit 1);

# 3.Query the student number and student name and average score of students whose average score is 60 or higher.

select sc.studentId,s.name,avg(sc.score) as score from student_course sc,student s where s.id = sc.studentId group by sc.studentId having avg(sc.score) >= 60;

# 4.Query the SQL statement of student information that does not have grades in the student_course table

select s.* from student s left join student_course sc on s.id = sc.studentId where score is NULL;

# 5.Query all SQL with grades

select score from student_course;

# 6.Inquire about the information of classmates who have numbered 1 and also studied the course numbered 2

select s.* from student_course sc left join student s on s.id = sc.studentId where sc.studentId = '1' and sc.courseId = '2';

# 7.Retrieve 1 student score with less than 60 scores in descending order

select score from student_course where score < 60 order by score desc limit 1;

# 8.Query the average grade of each course. The results are ranked in descending order of average grade. When the average grades are the same, they are sorted in ascending order by course number.

select courseId,avg(score) from student_course group by courseId order by avg(score) desc,courseId asc;

# 9.Query the name and score of a student whose course name is "Math" and whose score is less than 60

select s.name,sc.score from course c,student s,student_course sc where c.name = 'math' and c.id = sc.courseId and s.id = sc.studentId and score < 60;