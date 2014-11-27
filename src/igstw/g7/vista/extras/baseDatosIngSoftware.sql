CREATE DATABASE  IF NOT EXISTS `generador` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `generador`;
-- MySQL dump 10.13  Distrib 5.6.13, for Win32 (x86)
--
-- Host: localhost    Database: generador
-- ------------------------------------------------------
-- Server version	5.6.16

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
-- Table structure for table `configuracion_plantilla`
--

DROP TABLE IF EXISTS `configuracion_plantilla`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `configuracion_plantilla` (
  `C_TIPO` char(1) NOT NULL COMMENT 'Tipo: ',
  `C_NIVEL` int(11) NOT NULL COMMENT 'Nivel de configuracion:',
  `C_ESTADO` char(1) NOT NULL DEFAULT 'A' COMMENT 'Estado:',
  `PLA_ID` int(11) NOT NULL COMMENT 'ID de la plantilla',
  PRIMARY KEY (`C_TIPO`,`C_NIVEL`,`PLA_ID`),
  KEY `fk_CONFIGURACION_PLANTILLA_PLANTILLA1_idx` (`PLA_ID`),
  CONSTRAINT `fk_CONFIGURACION_PLANTILLA_PLANTILLA1` FOREIGN KEY (`PLA_ID`) REFERENCES `plantilla` (`P_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `configuracion_plantilla`
--

LOCK TABLES `configuracion_plantilla` WRITE;
/*!40000 ALTER TABLE `configuracion_plantilla` DISABLE KEYS */;
/*!40000 ALTER TABLE `configuracion_plantilla` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `detalle`
--

DROP TABLE IF EXISTS `detalle`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `detalle` (
  `D_ORDEN` int(11) NOT NULL COMMENT 'ID:  ORDEN EN QUE SE IMPRIME  EN EL REPORTE EMPEZANDO POR LA  IZQUIERDA',
  `D_NOMBRE` varchar(45) DEFAULT NULL COMMENT 'Nombre para la etiqueta en formato xml',
  `D_CAMPO` varchar(45) DEFAULT NULL COMMENT 'Nombre del campo agrupador de la consulta sql',
  `D_TAMANIO` int(11) DEFAULT NULL COMMENT 'TamaÃ±o del campo',
  `D_TIPO` varchar(45) DEFAULT NULL COMMENT 'NUMERICO , ALFANUMERICO',
  `D_CIFRADO` char(1) DEFAULT NULL COMMENT 'S : si',
  `D_TRANSFORMA` int(11) DEFAULT NULL COMMENT '0: No se transforma',
  `D_TRANS_ORI` char(1) DEFAULT NULL COMMENT 'I:   Izquierda',
  `D_SUMADOR` int(11) DEFAULT '0' COMMENT '1 : Es campo sumador',
  `D_CONTADOR` int(11) DEFAULT '0' COMMENT '1 : Es campo contador',
  `CON_TIPO` char(1) NOT NULL COMMENT 'Tipo: ',
  `CON_NIVEL` int(11) NOT NULL COMMENT 'Nivel de configuracion:',
  `CON_PLA_ID` int(11) NOT NULL COMMENT 'ID de la plantilla',
  PRIMARY KEY (`D_ORDEN`,`CON_PLA_ID`,`CON_NIVEL`,`CON_TIPO`),
  KEY `fk_DETALLE_CONFIGURACION_PLANTILLA1_idx` (`CON_TIPO`,`CON_NIVEL`,`CON_PLA_ID`),
  CONSTRAINT `fk_DETALLE_CONFIGURACION_PLANTILLA1` FOREIGN KEY (`CON_TIPO`, `CON_NIVEL`, `CON_PLA_ID`) REFERENCES `configuracion_plantilla` (`C_TIPO`, `C_NIVEL`, `PLA_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detalle`
--

LOCK TABLES `detalle` WRITE;
/*!40000 ALTER TABLE `detalle` DISABLE KEYS */;
/*!40000 ALTER TABLE `detalle` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `historial_plantlla`
--

DROP TABLE IF EXISTS `historial_plantlla`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `historial_plantlla` (
  `H_ID` int(11) NOT NULL COMMENT 'Identificador',
  `H_FECHA_MOD` datetime DEFAULT NULL COMMENT 'Fecha de la modificacion o creacion ',
  `H_ESTADO` char(1) DEFAULT NULL COMMENT 'Estado final de la modificacion.',
  `USU_COD` varchar(50) DEFAULT NULL COMMENT 'Codigo de usuario que hace  la  modificacion',
  `PLA_ID` int(11) NOT NULL COMMENT 'PK : Id de plantilla',
  PRIMARY KEY (`H_ID`),
  KEY `fk_HISTORIAL_PLANTLLA_PLANTILLA1_idx` (`PLA_ID`),
  CONSTRAINT `fk_HISTORIAL_PLANTLLA_PLANTILLA1` FOREIGN KEY (`PLA_ID`) REFERENCES `plantilla` (`P_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `historial_plantlla`
--

LOCK TABLES `historial_plantlla` WRITE;
/*!40000 ALTER TABLE `historial_plantlla` DISABLE KEYS */;
/*!40000 ALTER TABLE `historial_plantlla` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `opciones`
--

DROP TABLE IF EXISTS `opciones`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `opciones` (
  `O_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT 'Identificador',
  `O_NOM` varchar(45) NOT NULL COMMENT 'Nombre de la  operacion',
  PRIMARY KEY (`O_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `opciones`
--

LOCK TABLES `opciones` WRITE;
/*!40000 ALTER TABLE `opciones` DISABLE KEYS */;
INSERT INTO `opciones` VALUES (1,'REGISTRAR_PLANTILLA'),(2,'MODIFICAR_PLANTILLA'),(3,'LISTAR_PLANTILLA'),(4,'GENERAR_REPORTE'),(5,'ELIMINAR_PLANTILLA');
/*!40000 ALTER TABLE `opciones` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `plantilla`
--

DROP TABLE IF EXISTS `plantilla`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `plantilla` (
  `P_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT 'Identificador',
  `P_NOMBRE` varchar(50) NOT NULL COMMENT 'Nombre de la  plantilla',
  `P_CONSULTA_SELECT` varchar(200) DEFAULT NULL COMMENT 'Sentencia despues del select',
  `P_CONSULTA_ORDER` varchar(100) DEFAULT NULL COMMENT 'Sentencia despues del order by',
  `P_N_HEADER` int(11) DEFAULT NULL COMMENT 'Nivel de header : 1,2,3,4',
  `P_N_FOOTER` int(11) DEFAULT NULL COMMENT 'Nivel del footer : 0,1,2,3,4',
  `P_N_DETAIL` int(11) DEFAULT NULL COMMENT 'Nivel del detail : 0,1',
  `P_ESTADO` char(1) DEFAULT NULL COMMENT 'E: eliminado',
  `P_FECHA` datetime DEFAULT NULL,
  PRIMARY KEY (`P_ID`),
  UNIQUE KEY `P_NOMBRE_UNIQUE` (`P_NOMBRE`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `plantilla`
--

LOCK TABLES `plantilla` WRITE;
/*!40000 ALTER TABLE `plantilla` DISABLE KEYS */;
INSERT INTO `plantilla` VALUES (1,'plantilla','consulta','campo',2,2,0,'1','2014-11-26 01:00:00');
/*!40000 ALTER TABLE `plantilla` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rol`
--

DROP TABLE IF EXISTS `rol`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `rol` (
  `R_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT 'Identificador',
  `R_DES` varchar(45) NOT NULL COMMENT 'Descripcion del rol',
  PRIMARY KEY (`R_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rol`
--

LOCK TABLES `rol` WRITE;
/*!40000 ALTER TABLE `rol` DISABLE KEYS */;
INSERT INTO `rol` VALUES (1,'ADMINISTRADOR'),(2,'OPERADOR');
/*!40000 ALTER TABLE `rol` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rol_opciones`
--

DROP TABLE IF EXISTS `rol_opciones`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `rol_opciones` (
  `ROL_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID del rol',
  `OPC_ID` int(11) NOT NULL COMMENT 'ID de  la  operacion',
  PRIMARY KEY (`ROL_ID`,`OPC_ID`),
  KEY `fk_ROL_has_OPCIONES_OPCIONES1_idx` (`OPC_ID`),
  KEY `fk_ROL_has_OPCIONES_ROL1_idx` (`ROL_ID`),
  CONSTRAINT `fk_ROL_has_OPCIONES_OPCIONES1` FOREIGN KEY (`OPC_ID`) REFERENCES `opciones` (`O_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_ROL_has_OPCIONES_ROL1` FOREIGN KEY (`ROL_ID`) REFERENCES `rol` (`R_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rol_opciones`
--

LOCK TABLES `rol_opciones` WRITE;
/*!40000 ALTER TABLE `rol_opciones` DISABLE KEYS */;
INSERT INTO `rol_opciones` VALUES (1,1),(1,2);
/*!40000 ALTER TABLE `rol_opciones` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuario` (
  `U_COD` varchar(50) NOT NULL COMMENT 'Codigo identificador',
  `U_NOM` varchar(45) DEFAULT NULL COMMENT 'Nombres del usuario',
  `U_APE_PAT` varchar(45) DEFAULT NULL COMMENT 'Apellido paterno  del usuario',
  `U_APE_MAT` varchar(45) DEFAULT NULL COMMENT 'Apellido materno  del usuario',
  `U_CON` varchar(45) DEFAULT NULL COMMENT 'ContraseÃ±a del usuario',
  `U_ESTADO` char(1) NOT NULL DEFAULT 'A' COMMENT 'A : Activo',
  `ROL_ID` int(11) DEFAULT NULL COMMENT 'PK : Id del rol de usuario',
  PRIMARY KEY (`U_COD`),
  KEY `fk_USUARIO_ROL1_idx` (`ROL_ID`),
  CONSTRAINT `fk_USUARIO_ROL1` FOREIGN KEY (`ROL_ID`) REFERENCES `rol` (`R_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES ('carlos_01','carlos','ochoa','aly','carlos','A',2),('lucero_01','lucero','arcadio','rosas','lucero','I',1),('omar_01','omar','cuba','estrella','omar','A',NULL),('willians_01','willian','castillo','ponce','willian','A',1);
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2014-11-27 11:59:03
