-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: localhost    Database: animal
-- ------------------------------------------------------
-- Server version	8.0.32

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `fish`
--

DROP TABLE IF EXISTS `fish`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `fish` (
  `id` int NOT NULL AUTO_INCREMENT,
  `cost` int DEFAULT NULL,
  `age` int DEFAULT NULL,
  `weight` float DEFAULT NULL,
  `sex` varchar(20) DEFAULT NULL,
  `diet` varchar(40) DEFAULT NULL,
  `Life_cycle` varchar(50) DEFAULT NULL,
  `color` varchar(30) DEFAULT NULL,
  `species` varchar(100) DEFAULT NULL,
  `abilities` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fish`
--

LOCK TABLES `fish` WRITE;
/*!40000 ALTER TABLE `fish` DISABLE KEYS */;
INSERT INTO `fish` VALUES (1,100,2,0.5,'male','Carnivore','Lives up to 5 years','Blue','Tuna','Swimming'),(2,200,5,1,'female','Omnivore','Lives up to 8 years','Green','Salmon','Jumping'),(3,150,3,0.75,'male','Herbivore','Lives up to 7 years','Yellow','Sole','Burrowing'),(4,90,1,0.3,'female','Carnivore','Lives up to 4 years','Red','Trout','Gliding'),(5,250,8,1.5,'male','Carnivore','Lives up to 10 years','Black','Swordfish','Hunting'),(6,120,4,0.6,'female','Omnivore','Lives up to 6 years','Silver','Catfish','Swimming'),(7,80,2,0.4,'male','Herbivore','Lives up to 3 years','Brown','Eel','Gliding'),(8,230,7,1.3,'female','Carnivore','Lives up to 9 years','Orange','Marlin','Burrowing'),(9,140,5,0.7,'male','Omnivore','Lives up to 7 years','Pink','Haddock','Hunting'),(10,160,4,0.8,'female','Herbivore','Lives up to 6 years','Purple','Flounder','Swimming'),(11,110,3,0.55,'male','Carnivore','Lives up to 5 years','Green','Bass','Gliding'),(12,180,6,0.9,'female','Omnivore','Lives up to 8 years','Yellow','Mackerel','Hunting'),(13,100,2,0.5,'male','Herbivore','Lives up to 4 years','Red','Perch','Burrowing'),(14,200,5,1,'female','Carnivore','Lives up to 8 years','Black','Sardine','Swimming'),(15,150,3,0.75,'male','Omnivore','Lives up to 6 years','Blue','Tilapia','Gliding'),(16,90,1,0.3,'female','Herbivore','Lives up to 3 years','Silver','Anchovy','Hunting'),(17,250,8,1.5,'male','Carnivore','Lives up to 10 years','Brown','Cod','Burrowing'),(18,120,4,0.6,'female','Omnivore','Lives up to 7 years','Orange','Pike','Swimming'),(19,80,2,0.4,'male','Herbivore','Lives up to 4 years','Pink','Carp','Gliding');
/*!40000 ALTER TABLE `fish` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-02-10 22:34:21
