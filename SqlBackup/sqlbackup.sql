/*
SQLyog Ultimate v10.00 Beta1
MySQL - 5.1.71-community : Database - jshop
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`jshop` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `jshop`;

/*Table structure for table `bill` */

DROP TABLE IF EXISTS `bill`;

CREATE TABLE `bill` (
  `billno` int(20) NOT NULL,
  `date` date DEFAULT NULL,
  `cname` varchar(20) DEFAULT NULL,
  `cnumber` varchar(10) DEFAULT NULL,
  `totalitems` varchar(20) DEFAULT NULL,
  `grandtotal` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`billno`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `bill` */

/*Table structure for table `billdetails` */

DROP TABLE IF EXISTS `billdetails`;

CREATE TABLE `billdetails` (
  `billno` int(20) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `cname` varchar(20) DEFAULT NULL,
  `cnumber` varchar(20) DEFAULT NULL,
  `otype` varchar(20) DEFAULT NULL,
  `ometal` varchar(20) DEFAULT NULL,
  `currentprice` varchar(20) DEFAULT NULL,
  `weight` varchar(20) DEFAULT NULL,
  `price` varchar(20) DEFAULT NULL,
  `gst` varchar(20) DEFAULT NULL,
  `mcharges` varchar(20) DEFAULT NULL,
  `grandtotal` varchar(20) DEFAULT NULL,
  `jid` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `billdetails` */

/*Table structure for table `dealer` */

DROP TABLE IF EXISTS `dealer`;

CREATE TABLE `dealer` (
  `dnum` varchar(10) NOT NULL,
  `dname` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`dnum`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `dealer` */

insert  into `dealer`(`dnum`,`dname`) values ('9907965194','Bobby Verma');

/*Table structure for table `jewellery` */

DROP TABLE IF EXISTS `jewellery`;

CREATE TABLE `jewellery` (
  `jid` int(20) NOT NULL,
  `otype` varchar(20) DEFAULT NULL,
  `ometal` varchar(20) DEFAULT NULL,
  `weight` varchar(20) DEFAULT NULL,
  `qty` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`jid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `jewellery` */

insert  into `jewellery`(`jid`,`otype`,`ometal`,`weight`,`qty`) values (1,'Neckless','Gold','0.5','10'),(2,'Coin','Silver','0.2','10'),(3,'Ring','Gold','0.1','10'),(4,'Neckless','Silver','0.8','10');

/*Table structure for table `purchase` */

DROP TABLE IF EXISTS `purchase`;

CREATE TABLE `purchase` (
  `jid` int(20) DEFAULT NULL,
  `otype` varchar(20) DEFAULT NULL,
  `metal` varchar(20) DEFAULT NULL,
  `weight` varchar(20) DEFAULT NULL,
  `currentprice` varchar(20) DEFAULT NULL,
  `priceper` varchar(20) DEFAULT NULL,
  `qty` varchar(20) DEFAULT NULL,
  `grandtotal` varchar(20) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `dnum` varchar(10) DEFAULT NULL,
  `dname` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `purchase` */

insert  into `purchase`(`jid`,`otype`,`metal`,`weight`,`currentprice`,`priceper`,`qty`,`grandtotal`,`date`,`dnum`,`dname`) values (1,'Neckless','Gold','0.5','10000','5000.0','5','25000.0','2021-04-04','9907965194','9907965194'),(1,'Neckless','Gold','0.5','10000','5000.0','5','25000.0','2021-04-04','9907965194','9907965194');

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `username` varchar(20) NOT NULL,
  `password` varchar(20) DEFAULT NULL,
  `favcolor` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `user` */

insert  into `user`(`username`,`password`,`favcolor`) values ('admin','1234','Blue');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
