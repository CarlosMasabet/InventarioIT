-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: localhost    Database: mydb
-- ------------------------------------------------------
-- Server version	8.0.29

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `departamentos`
--

DROP TABLE IF EXISTS `departamentos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `departamentos` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `jefe` varchar(45) NOT NULL,
  `contacto` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `departamentos`
--

LOCK TABLES `departamentos` WRITE;
/*!40000 ALTER TABLE `departamentos` DISABLE KEYS */;
INSERT INTO `departamentos` VALUES (1,'ATIT','Maritza','123'),(2,'Ventas','Jose','123'),(3,'Antencion al cliente','Maria','123'),(4,'Almacen','julio','2113'),(5,'Deposito','Carlos','0412-0846869'),(6,'Comercial','Raiza','123');
/*!40000 ALTER TABLE `departamentos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lista`
--

DROP TABLE IF EXISTS `lista`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `lista` (
  `idlista` int NOT NULL AUTO_INCREMENT,
  `desc` varchar(45) NOT NULL,
  PRIMARY KEY (`idlista`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lista`
--

LOCK TABLES `lista` WRITE;
/*!40000 ALTER TABLE `lista` DISABLE KEYS */;
INSERT INTO `lista` VALUES (1,'Monitor'),(2,'Teclado'),(3,'Mouse'),(4,'Corneta'),(5,'Impresora');
/*!40000 ALTER TABLE `lista` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `marca`
--

DROP TABLE IF EXISTS `marca`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `marca` (
  `id` int NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `marca`
--

LOCK TABLES `marca` WRITE;
/*!40000 ALTER TABLE `marca` DISABLE KEYS */;
INSERT INTO `marca` VALUES (1,'Seleccionar'),(2,'VIT'),(3,'Siragon'),(4,'Dell'),(5,'HP'),(6,'Lenovo'),(7,'Samsung');
/*!40000 ALTER TABLE `marca` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `modelo`
--

DROP TABLE IF EXISTS `modelo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `modelo` (
  `id` int NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(45) NOT NULL,
  `marca` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `marca_idx` (`marca`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `modelo`
--

LOCK TABLES `modelo` WRITE;
/*!40000 ALTER TABLE `modelo` DISABLE KEYS */;
INSERT INTO `modelo` VALUES (11,'V001',2),(12,'V-562',2),(13,'V-h789',2),(14,'s8965',3),(15,'S-hd55',3),(16,'St88',3),(17,'Dlf44',4),(18,'D865',4),(19,'D123',4),(20,'h35474768p',4),(21,'ph1600',4),(22,'hp852',5),(23,'n54d',6),(24,'l941',6),(25,'HMP',6),(26,'EU4',5),(27,'SG-hk226',7),(28,'Sg-544d938a',7);
/*!40000 ALTER TABLE `modelo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pc`
--

DROP TABLE IF EXISTS `pc`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pc` (
  `id` int NOT NULL AUTO_INCREMENT,
  `usuario` varchar(45) NOT NULL,
  `Marca` int NOT NULL,
  `Modelo` int NOT NULL,
  `serial` varchar(45) NOT NULL,
  `estado` varchar(45) NOT NULL,
  PRIMARY KEY (`id`,`Marca`,`Modelo`),
  KEY `fk_pc_Modelo1_idx` (`Modelo`),
  KEY `fk_pc_Marca1_idx` (`Marca`),
  CONSTRAINT `fk_pc_Marca1` FOREIGN KEY (`Marca`) REFERENCES `marca` (`id`),
  CONSTRAINT `fk_pc_Modelo1` FOREIGN KEY (`Modelo`) REFERENCES `modelo` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=40 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pc`
--

LOCK TABLES `pc` WRITE;
/*!40000 ALTER TABLE `pc` DISABLE KEYS */;
INSERT INTO `pc` VALUES (21,'ohsd',3,15,'6fdt23','Activo'),(23,'uwu',3,14,'741852963','Dañado'),(24,'no se',2,11,'awd23wr3','Activo'),(25,'F',2,12,'1472f5839','Dañado'),(26,'GG',2,13,'vd754-87','Activo'),(27,'carlos',4,17,'dre984235','Activo'),(28,'lol',4,20,'lp578','Dañado'),(29,'yolo',4,17,'d8461a','Activo'),(31,'jose',5,26,'68654er','Activo'),(32,'VIC',6,23,'r498ffdd','Dañado'),(33,'VIC',6,25,'oig','Dañado'),(34,'kojf',4,19,'6498j','Dañado'),(35,'fydtr',6,23,'dr78678','Dañado'),(36,'gg',6,24,'852','Dañado'),(37,'el pepe',5,22,'59fdf','Activo'),(38,'UIH7YG',3,15,'UYP6+849','Activo'),(39,'fyuiyt',3,15,'gfutyu','Activo');
/*!40000 ALTER TABLE `pc` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pc_dep`
--

DROP TABLE IF EXISTS `pc_dep`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pc_dep` (
  `dep_id` int NOT NULL,
  `pc_id` int NOT NULL,
  PRIMARY KEY (`dep_id`,`pc_id`),
  KEY `fk_pc-departamentos_departamentos1_idx` (`dep_id`),
  KEY `fk_pc-departamentos_pc1_idx` (`pc_id`),
  CONSTRAINT `fk_pc-departamentos_departamentos1` FOREIGN KEY (`dep_id`) REFERENCES `departamentos` (`id`),
  CONSTRAINT `fk_pc-departamentos_pc1` FOREIGN KEY (`pc_id`) REFERENCES `pc` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pc_dep`
--

LOCK TABLES `pc_dep` WRITE;
/*!40000 ALTER TABLE `pc_dep` DISABLE KEYS */;
INSERT INTO `pc_dep` VALUES (1,21),(1,25),(1,29),(1,33),(1,38),(2,23),(2,34),(2,36),(3,24),(3,28),(3,31),(3,37),(4,26),(5,32),(6,39);
/*!40000 ALTER TABLE `pc_dep` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `perifericos`
--

DROP TABLE IF EXISTS `perifericos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `perifericos` (
  `id` int NOT NULL AUTO_INCREMENT,
  `pc` int NOT NULL,
  `tipo` int NOT NULL,
  `serial` varchar(45) NOT NULL,
  PRIMARY KEY (`id`,`pc`,`tipo`),
  KEY `fk_perifericos_pc1_idx` (`pc`),
  KEY `fk_perifericos_lista1_idx` (`tipo`),
  CONSTRAINT `fk_perifericos_lista1` FOREIGN KEY (`tipo`) REFERENCES `lista` (`idlista`),
  CONSTRAINT `fk_perifericos_pc1` FOREIGN KEY (`pc`) REFERENCES `pc` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=39 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `perifericos`
--

LOCK TABLES `perifericos` WRITE;
/*!40000 ALTER TABLE `perifericos` DISABLE KEYS */;
INSERT INTO `perifericos` VALUES (1,34,1,'ks23'),(2,31,2,'lg8455'),(3,36,3,'8465f'),(4,36,1,'5123'),(5,36,2,'896'),(6,33,3,'8d5d'),(11,28,1,'fd898'),(12,29,2,'hk+9941'),(13,28,2,'8546'),(14,32,1,'lkl8643'),(15,21,1,'225hy'),(16,21,2,'68byd'),(17,21,3,'84jif'),(18,24,1,'587cdfd'),(19,25,1,'j87cd'),(20,25,3,'vkv787'),(21,26,1,'f58b'),(22,26,2,'ll87478h'),(23,26,3,'fd868'),(24,23,2,'fghj45'),(25,23,3,'dg8686'),(26,27,3,'gr558775'),(27,27,1,'bh6563'),(28,29,3,'h4744'),(30,31,4,'87fkjhh'),(31,31,1,'df869'),(32,31,3,'x4s4s88'),(33,37,1,'dkd876'),(34,35,1,'fe325443'),(37,36,5,'64687484'),(38,38,1,'GYT7T');
/*!40000 ALTER TABLE `perifericos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipo_us`
--

DROP TABLE IF EXISTS `tipo_us`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tipo_us` (
  `tipo` int NOT NULL AUTO_INCREMENT,
  `desc` varchar(45) NOT NULL,
  PRIMARY KEY (`tipo`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipo_us`
--

LOCK TABLES `tipo_us` WRITE;
/*!40000 ALTER TABLE `tipo_us` DISABLE KEYS */;
INSERT INTO `tipo_us` VALUES (1,'Administrador'),(2,'Regular'),(3,'Sin permisos');
/*!40000 ALTER TABLE `tipo_us` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuarios` (
  `id` int NOT NULL AUTO_INCREMENT,
  `codigo` varchar(10) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `contraseña` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8_bin NOT NULL,
  `ult_sesion` datetime DEFAULT NULL,
  `tipo_us` int NOT NULL,
  PRIMARY KEY (`id`,`tipo_us`),
  KEY `fk_usuarios_tipo_us1_idx` (`tipo_us`),
  CONSTRAINT `fk_usuarios_tipo_us1` FOREIGN KEY (`tipo_us`) REFERENCES `tipo_us` (`tipo`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` VALUES (1,'001','Administrador','80f5414f8bda805dd0484569dc7be9573807c65f','2023-05-18 11:37:04',1),(2,'v28104377','Carlos Masabet','a01eda32e4e0b1393274e91d1b3e9ecfc5eaba85','2023-04-13 16:40:46',2),(3,'123','no tiene','a01eda32e4e0b1393274e91d1b3e9ecfc5eaba85','2023-01-25 14:23:55',3),(4,'v28104378','Oriana Masabet','8fd0959e8c40dc236d0cb1e29a05a1a91f751e5c','2023-03-28 15:23:35',3),(5,'v8463491','Leonor Paez','9045d8ef48db5db504c9143c8ac4fcf395739a61','2023-03-17 11:43:02',3),(6,'v8218023','Jose  Masabet','8fd0959e8c40dc236d0cb1e29a05a1a91f751e5c','2023-03-23 16:35:42',2),(7,'v28270543','Luis Taipo','8fd0959e8c40dc236d0cb1e29a05a1a91f751e5c','2023-03-26 12:22:03',2);
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-05-18 11:37:21
