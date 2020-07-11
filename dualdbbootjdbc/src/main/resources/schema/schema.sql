-- MySQL dump 10.13  Distrib 5.7.30, for Linux (x86_64)
--
-- Host: localhost    Database: DD-LOCAL
-- ------------------------------------------------------
-- Server version	5.7.30-0ubuntu0.18.04.1

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
-- Current Database: `DD-LOCAL`
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `DD-LOCAL` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `DD-LOCAL`;

--
-- Table structure for table `dd_local_user`
--

DROP TABLE IF EXISTS `dd_local_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dd_local_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(100) NOT NULL DEFAULT '',
  `email` varchar(100) NOT NULL DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dd_local_user`
--

LOCK TABLES `dd_local_user` WRITE;
/*!40000 ALTER TABLE `dd_local_user` DISABLE KEYS */;
INSERT INTO `dd_local_user` VALUES (3,'db1-user1','db1-user1'),(4,'a','a@a.com');
/*!40000 ALTER TABLE `dd_local_user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mail_template`
--

DROP TABLE IF EXISTS `mail_template`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `mail_template` (
  `mail_template_id` int(11) NOT NULL AUTO_INCREMENT,
  `mail_type` varchar(45) DEFAULT NULL,
  `mail_subject` text,
  `mail_body` text,
  `mail_to_recepient` text,
  `mail_cc_recepient` text,
  PRIMARY KEY (`mail_template_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mail_template`
--

LOCK TABLES `mail_template` WRITE;
/*!40000 ALTER TABLE `mail_template` DISABLE KEYS */;
INSERT INTO `mail_template` VALUES (1,'job','sub','body','aa','aa');
/*!40000 ALTER TABLE `mail_template` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Current Database: `DD-PRD`
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `DD-PRD` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `DD-PRD`;

--
-- Table structure for table `dd_prd_user`
--

DROP TABLE IF EXISTS `dd_prd_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dd_prd_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(100) NOT NULL DEFAULT '',
  `email` varchar(100) NOT NULL DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dd_prd_user`
--

LOCK TABLES `dd_prd_user` WRITE;
/*!40000 ALTER TABLE `dd_prd_user` DISABLE KEYS */;
INSERT INTO `dd_prd_user` VALUES (6,'db2-user','db2-user');
/*!40000 ALTER TABLE `dd_prd_user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-07-11 21:43:16
