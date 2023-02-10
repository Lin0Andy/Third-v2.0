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
-- Table structure for table `dogs`
--

DROP TABLE IF EXISTS `dogs`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dogs` (
  `id` int NOT NULL AUTO_INCREMENT,
  `cost` int DEFAULT NULL,
  `age` smallint DEFAULT NULL,
  `weight` float(10,1) DEFAULT NULL,
  `sex` varchar(30) DEFAULT NULL,
  `diet` varchar(30) DEFAULT NULL,
  `Life_cycle` varchar(30) DEFAULT NULL,
  `color` varchar(30) DEFAULT NULL,
  `abilities` varchar(200) DEFAULT NULL,
  `species` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=39 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dogs`
--

LOCK TABLES `dogs` WRITE;
/*!40000 ALTER TABLE `dogs` DISABLE KEYS */;
INSERT INTO `dogs` VALUES (1,75,2,0.2,'female','omnivorous','they can live for 14 years','black','excellent sense of smell','beagle'),(2,80,3,0.2,'male','omnivorous','they can live for 13 years','white','excellent hearing','poodle'),(3,85,5,0.1,'female','omnivorous','they can live for 11 years','brown','good agility','labrador'),(4,90,1,0.1,'male','omnivorous','they can live for 16 years','black','strong protective instincts','german shepherd'),(5,95,1,0.1,'female','omnivorous','they can live for 15 years','white','stubborn nature','bulldog'),(6,100,2,0.2,'male','omnivorous','they can live for 14 years','brown','high energy','husky'),(7,105,2,0.2,'female','omnivorous','they can live for 13 years','black','loyal and protective','rottweiler'),(8,110,3,0.2,'male','omnivorous','they can live for 12 years','white','strong work ethic','siberian husky'),(9,115,4,0.2,'female','omnivorous','they can live for 11 years','brown','loyal and confident','doberman'),(10,120,1,0.1,'male','omnivorous','they can live for 16 years','black','friendly and loyal','golden retriever'),(11,125,1,0.1,'female','omnivorous','they can live for 15 years','white','intelligence and trainability','border collie'),(12,130,2,0.2,'male','omnivorous','they can live for 14 years','brown','courageous and loyal','dachshund'),(13,135,2,0.2,'female','omnivorous','they can live for 13 years','black','small size and playful nature','chihuahua'),(14,140,3,0.2,'male','omnivorous','they can live for 12 years','white','affectionate and sociable','boston terrier'),(15,145,4,0.2,'female','omnivorous','they can live for 11 years','brown','friendly and affectionate','cocker spaniel'),(16,150,5,0.1,'male','omnivorous','they can live for 16 years','black','playful and friendly','shih tzu'),(17,155,1,0.1,'female','omnivorous','they can live for 15 years','white','playful and affectionate','pug'),(18,160,2,0.2,'male','omnivorous','they can live for 14 years','brown','they are energetic and good at hunting, but have short legs','yorkshire terrier'),(19,165,2,0.2,'female','omnivorous','they can live for 13 years','black','they are protective and make good guard dogs','weimaraner'),(20,170,3,0.2,'male','omnivorous','they can live for 12 years','white','they are intelligent and easily trained','boxer'),(21,100,1,0.8,'male','omnivorous','they can live for 14 years','brown','they are highly intelligent and good at herding','beagle'),(22,120,1,1.0,'female','omnivorous','they can live for 13 years','black',' friendly and good with children','poodle'),(23,140,7,1.2,'male','omnivorous','they can live for 11 years','white','they are friendly and loyal, but have low energy levels','labrador'),(24,160,8,5.1,'female','omnivorous','they can live for 16 years','brown','strong and energetic','german shepherd'),(25,180,9,4.2,'male','omnivorous','they can live for 15 years','black','they are protective and make good guard dogs','bulldog'),(26,200,1,2.0,'female','omnivorous','they can live for 14 years','white','they can run fast and are good at agility training','husky'),(27,220,1,2.2,'male','omnivorous','they can live for 13 years','brown','they are loyal and protective, but need proper training and socialization','rottweiler'),(28,240,1,2.5,'female','omnivorous','they can live for 12 years','black','they are highly intelligent and good at herding','siberian husky'),(29,260,3,2.8,'male','omnivorous','they can live for 11 years','white','they can run fast and are good at agility training','doberman'),(30,280,4,3.0,'female','omnivorous','they can live for 16 years','brown',' friendly and good with children','golden retriever'),(31,300,5,3.2,'male','omnivorous','they can live for 15 years','black',' friendly and good with children','border collie'),(32,320,1,3.5,'female','omnivorous','they can live for 14 years','white','they can run fast and are good at agility training','dachshund'),(33,340,1,3.8,'male','omnivorous','they can live for 13 years','brown','they are friendly and loyal, but have low energy levels','chihuahua'),(34,360,4,4.0,'female','omnivorous','they can live for 12 years','black','strong and energetic','boston terrier'),(35,380,2,4.2,'male','omnivorous','they can live for 11 years','white','they are protective and make good guard dogs','cocker spaniel'),(36,400,2,4.5,'female','omnivorous','they can live for 16 years','brown','medium','shih tzu'),(37,420,2,4.8,'male','omnivorous','they can live for 15 years','black',' friendly and good with children','pug'),(38,440,2,5.0,'female','omnivorous','they can live for 14 years','white','strong and energetic','yorkshire terrier');
/*!40000 ALTER TABLE `dogs` ENABLE KEYS */;
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
