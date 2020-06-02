DROP TABLE IF EXISTS `subject`;

CREATE TABLE `subject` (
  `id` varchar(255) NOT NULL PRIMARY KEY,
  `subject` varchar(128) NOT NULL,
  `teacher` varchar(128) NOT NULL,
  `description` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert into student values('1001','Chinese','Mr. Wang','the exam is easy'),('1002','math','Miss Liu','the exam is difficult');