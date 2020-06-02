DROP TABLE IF EXISTS `score`;

CREATE TABLE `score` (
  `id` int(11) NOT NULL AUTO_INCREMENT PRIMARY key,
  `student_id` varchar(255) NOT NULL,
  `subject_id` varchar(255) NOT NULL,
  `score` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert into score values(null,'001','1001','80'),(null,'002','1002','60'),(null,'001','1001','70'),(null,'002','1002','60.5');