/*
SQLyog Enterprise - MySQL GUI v7.14 
MySQL - 5.5.5-10.1.16-MariaDB : Database - db_tugaspbo
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

CREATE DATABASE /*!32312 IF NOT EXISTS*/`db_tugaspbo` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `db_tugaspbo`;

/*Table structure for table `tbl_peminjaman` */

DROP TABLE IF EXISTS `tbl_peminjaman`;

CREATE TABLE `tbl_peminjaman` (
  `id` int(4) NOT NULL AUTO_INCREMENT,
  `namaTeman` varchar(50) DEFAULT NULL,
  `barangPinjam` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

/*Data for the table `tbl_peminjaman` */

insert  into `tbl_peminjaman`(`id`,`namaTeman`,`barangPinjam`) values (1,'Rizki','Headset'),(2,'Hari','Keset'),(3,'Deri','Charger'),(4,'Afif','Monitor'),(5,'Dwi','Gitar'),(6,'Satria','Motor');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
