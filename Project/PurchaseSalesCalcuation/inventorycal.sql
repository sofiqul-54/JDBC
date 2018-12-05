-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: inventorycal
-- ------------------------------------------------------
-- Server version	5.6.40-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `category`
--

DROP TABLE IF EXISTS `category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `category` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `category`
--

LOCK TABLES `category` WRITE;
/*!40000 ALTER TABLE `category` DISABLE KEYS */;
INSERT INTO `category` VALUES (1,'Mobile'),(2,'Computer'),(3,'Car');
/*!40000 ALTER TABLE `category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `purchase`
--

DROP TABLE IF EXISTS `purchase`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `purchase` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `productName` varchar(30) NOT NULL,
  `productCode` varchar(30) NOT NULL,
  `qty` int(11) NOT NULL,
  `unitprice` double NOT NULL,
  `totalPrice` double NOT NULL,
  `purchasedate` date NOT NULL,
  `cat_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `cat_id` (`cat_id`),
  KEY `user_id` (`user_id`),
  CONSTRAINT `purchase_ibfk_1` FOREIGN KEY (`cat_id`) REFERENCES `category` (`id`),
  CONSTRAINT `purchase_ibfk_2` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `purchase`
--

LOCK TABLES `purchase` WRITE;
/*!40000 ALTER TABLE `purchase` DISABLE KEYS */;
INSERT INTO `purchase` VALUES (1,'LG G6','LGG6',10,40000,400000,'2018-11-21',1,1),(2,'LG G6','LGG6',10,40000,400000,'2018-11-21',1,1),(3,'Toshiba Laptop','AA750',10,50000,500000,'2018-11-21',2,1),(4,'Toshiba Laptop','AA750',10,50000,500000,'2018-11-21',2,1),(5,'Toyota','Premio',5,5000000,25000000,'2018-11-21',3,1),(6,'Toyota','Premio',2,5000000,10000000,'2018-11-21',3,1),(8,'htc 626','HTC626',20,10000,200000,'2018-11-21',1,1),(9,'hp Laptop','HPBB861',10,60000,600000,'2018-11-23',2,1),(10,'hp Laptop','HPBB861',10,60000,600000,'2018-11-23',2,1);
/*!40000 ALTER TABLE `purchase` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sales`
--

DROP TABLE IF EXISTS `sales`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sales` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `productName` varchar(30) NOT NULL,
  `productCode` varchar(30) NOT NULL,
  `qty` int(11) NOT NULL,
  `unitprice` double NOT NULL,
  `totalPrice` double NOT NULL,
  `salesdate` date NOT NULL,
  `product_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `product_id` (`product_id`),
  KEY `user_id` (`user_id`),
  CONSTRAINT `sales_ibfk_1` FOREIGN KEY (`product_id`) REFERENCES `purchase` (`id`),
  CONSTRAINT `sales_ibfk_2` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sales`
--

LOCK TABLES `sales` WRITE;
/*!40000 ALTER TABLE `sales` DISABLE KEYS */;
INSERT INTO `sales` VALUES (1,'LG G6','LGG6',5,50000,250000,'2018-11-21',1,2),(2,'Toshiba Laptop','AA750',5,60000,300000,'2018-11-21',3,2),(3,'Toyota','Premio',2,6000000,12000000,'2018-11-21',5,3),(4,'htc 626','HTC626',5,11000,55000,'2018-11-21',8,1),(5,'LG G6','LGG6',5,44000,220000,'2018-11-23',1,4),(6,'Toshiba Laptop','AA750',5,55000,275000,'2018-11-23',3,1),(7,'hp Laptop','HPBB861',5,66000,330000,'2018-11-23',9,4);
/*!40000 ALTER TABLE `sales` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `summary`
--

DROP TABLE IF EXISTS `summary`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `summary` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `productName` varchar(50) NOT NULL,
  `productCode` varchar(30) NOT NULL,
  `totalQty` int(11) NOT NULL,
  `soldQty` int(11) NOT NULL,
  `availableQty` int(11) NOT NULL,
  `lastUpdate` date DEFAULT NULL,
  `product_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `product_id` (`product_id`),
  CONSTRAINT `summary_ibfk_1` FOREIGN KEY (`product_id`) REFERENCES `purchase` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `summary`
--

LOCK TABLES `summary` WRITE;
/*!40000 ALTER TABLE `summary` DISABLE KEYS */;
INSERT INTO `summary` VALUES (1,'LG G6','LGG6',20,10,10,'2018-11-23',1),(2,'Toshiba Laptop','AA750',20,10,10,'2018-11-23',3),(3,'Toyota','Premio',7,2,5,'2018-11-21',5),(5,'htc 626','HTC626',20,5,15,'2018-11-21',8),(6,'hp Laptop','HPBB861',20,5,15,'2018-11-23',9);
/*!40000 ALTER TABLE `summary` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL,
  `userType` varchar(30) NOT NULL,
  `firstName` varchar(30) DEFAULT NULL,
  `lastName` varchar(30) DEFAULT NULL,
  `email` varchar(30) NOT NULL,
  `mobile` varchar(30) NOT NULL,
  `regiDate` date DEFAULT NULL,
  `status` bit(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'arefin','789','admin','Mr.','Arefin','arefin@gmail.com','01686239145','2018-11-21',''),(2,'jubaiyer','123','salesman','Mr.','Jubaiyer','jubaiyer@gmail.com','01686239146','2018-11-21',''),(3,'mehedee','123','salesman','Mr.','Mehedee','mehedee@gmail.com','01686239147','2018-11-21',''),(4,'mostafiz','123','Salesman','Mr.','Mostafiz','mostafiz@gmail.com','01686239148','2018-11-23','');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-11-23 23:57:01
