# Java_044_Spring

mvn compile spring-boot:run

For correct Mysql connection check db, user and password (fix UserDao.java)

Before start you need create table.
<pre>
CREATE TABLE IF NOT EXISTS `register` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `sex` varchar(100) NOT NULL,
  `country` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
);
</pre>