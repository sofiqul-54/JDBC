-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.6.40-log


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema cycleshop
--

CREATE DATABASE IF NOT EXISTS cycleshop;
USE cycleshop;

--
-- Definition of table `cyclepurchase`
--

DROP TABLE IF EXISTS `cyclepurchase`;
CREATE TABLE `cyclepurchase` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) DEFAULT NULL,
  `pCode` varchar(30) DEFAULT NULL,
  `quantity` int(11) DEFAULT NULL,
  `unitPrice` double DEFAULT NULL,
  `totalPrice` double DEFAULT NULL,
  `purchaseDate` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cyclepurchase`
--

/*!40000 ALTER TABLE `cyclepurchase` DISABLE KEYS */;
INSERT INTO `cyclepurchase` (`id`,`name`,`pCode`,`quantity`,`unitPrice`,`totalPrice`,`purchaseDate`) VALUES 
 (1,'Core Project 1','CORE01',10,14000,140000,'2018-12-02'),
 (2,'Core Project 1','CORE01',10,14000,140000,'2018-12-02'),
 (3,'Talus 1','TALUS01',10,15000,150000,'2018-12-03'),
 (4,'Talus 1','TALUS01',10,15000,150000,'2018-12-03'),
 (5,'Core Project 2','CORE02',10,21000,210000,'2018-12-04');
/*!40000 ALTER TABLE `cyclepurchase` ENABLE KEYS */;


--
-- Definition of table `cyclesales`
--

DROP TABLE IF EXISTS `cyclesales`;
CREATE TABLE `cyclesales` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) DEFAULT NULL,
  `pCode` varchar(30) DEFAULT NULL,
  `quantity` int(11) DEFAULT NULL,
  `unitPrice` double DEFAULT NULL,
  `totalPrice` double DEFAULT NULL,
  `salesDate` date DEFAULT NULL,
  `pId` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `pId` (`pId`),
  CONSTRAINT `cyclesales_ibfk_1` FOREIGN KEY (`pId`) REFERENCES `cyclepurchase` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cyclesales`
--

/*!40000 ALTER TABLE `cyclesales` DISABLE KEYS */;
INSERT INTO `cyclesales` (`id`,`name`,`pCode`,`quantity`,`unitPrice`,`totalPrice`,`salesDate`,`pId`) VALUES 
 (1,'Core Project 1','CORE01',5,15000,750000,'2018-12-02',1),
 (2,'Talus 1','TALUS01',5,16500,82500,'2018-12-04',3);
/*!40000 ALTER TABLE `cyclesales` ENABLE KEYS */;


--
-- Definition of table `purchasesalessummary`
--

DROP TABLE IF EXISTS `purchasesalessummary`;
CREATE TABLE `purchasesalessummary` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `pCode` varchar(30) DEFAULT NULL,
  `totalQuantity` int(11) DEFAULT NULL,
  `soldQuantity` int(11) DEFAULT NULL,
  `availableQuantity` int(11) DEFAULT NULL,
  `lastUpdate` date DEFAULT NULL,
  `pId` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `pId` (`pId`),
  CONSTRAINT `purchasesalessummary_ibfk_1` FOREIGN KEY (`pId`) REFERENCES `cyclepurchase` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `purchasesalessummary`
--

/*!40000 ALTER TABLE `purchasesalessummary` DISABLE KEYS */;
INSERT INTO `purchasesalessummary` (`id`,`name`,`pCode`,`totalQuantity`,`soldQuantity`,`availableQuantity`,`lastUpdate`,`pId`) VALUES 
 (2,'Core Project 1','CORE01',20,5,15,'2018-12-02',1),
 (3,'Talus 1','TALUS01',20,5,15,'2018-12-04',3),
 (4,'Core Project 2','CORE02',10,0,10,'2018-12-04',5);
/*!40000 ALTER TABLE `purchasesalessummary` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
