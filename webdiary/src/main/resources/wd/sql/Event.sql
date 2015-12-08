CREATE TABLE `event` (
  `no` int(11) NOT NULL,
  `id` varchar(45) NOT NULL,
  `title` varchar(45) NOT NULL,
  `content` varchar(45) DEFAULT NULL,
  `credate` datetime DEFAULT NULL,
  `photo` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`no`)
)