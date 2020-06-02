DROP TABLE IF EXISTS `student`;

CREATE TABLE `student` (
  `id` varchar(255) NOT NULL PRIMARY KEY,
  `name` varchar(128) NOT NULL,
  `age` int(11) NOT NULL,
  `sex` varchar(16) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert into student values('001','zhangsan','18','male'),('002','lisi','20','female');