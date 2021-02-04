CREATE DATABASE `cinedb`;

USE `cinedb`;

CREATE TABLE `peliculas` (
  `pelicula_id` bigint NOT NULL AUTO_INCREMENT,
  `pelicula_nombre` varchar(100) NOT NULL,
  `pelicula_paisDeOrigen` varchar(100) NOT NULL,
  `pelicula_fechaDeEstreno` date DEFAULT NULL,
  `pelicula_director` varchar(100) NOT NULL,
  `pelicula_reparto` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`pelicula_id`),
  KEY `FK_Director` (`pelicula_director`)
) ENGINE=InnoDB AUTO_INCREMENT=0;

INSERT INTO cinedb.peliculas (pelicula_nombre,pelicula_paisDeOrigen,pelicula_fechaDeEstreno,pelicula_director,pelicula_reparto) VALUES
	 ('Wea','Philippines','2004-10-11','Tom Morello','Tremaine Silbersak, Edita Ruusa, Marilyn Clewer'),
	 ('No es otra cosa?','tailandia','2019-01-01','Carlitos murrieta','Carlitos murrieta y hermanitos'),
	 ('Peak and go','Canada','2016-10-17','Pepito el malasiano','Bari Meany, Marilyn Clewer'),
	 ('Le france','Francia','2008-08-26','Naie Nidea','Morley Drakes, Bari Meany, Edita Ruusa'),
	 ('Go, go and go','Holanda','2010-08-25','QueEstoy Escribiendo','Tremaine Silbersak, Leola Marshfield');
     