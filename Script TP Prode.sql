CREATE DATABASE `prode` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */;

-- prode.apostadores definition

CREATE TABLE `apostadores` (
  `idApostador` int(11) DEFAULT NULL,
  `NombreCompleto` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO prode.apostadores (idApostador,NombreCompleto) VALUES
	 (22861213,'RUBEN GIL'),
	 (35566056,'MANUELA RUBIO'),
	 (52588909,'JOSE CARLOS DELGADO'),
	 (86579607,'IVAN ALVAREZ'),
	 (34421168,'JOSE ANGEL MORENO');

	-- prode.equiposqatar2022 definition

CREATE TABLE `equiposqatar2022` (
  `Equipo` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `Partidos` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO prode.equiposqatar2022 (Equipo,Partidos) VALUES
	 ('Switzerland',4),
	 ('Serbia',3),
	 ('Spain',4),
	 ('Portugal',5),
	 ('Poland',4),
	 ('Germany',3),
	 ('England',5),
	 ('Belgium',3),
	 ('Netherlands',5),
	 ('France',7);
INSERT INTO prode.equiposqatar2022 (Equipo,Partidos) VALUES
	 ('Croatia',7),
	 ('Denmark',3),
	 ('Japan',4),
	 ('Saudi Arabia',3),
	 ('Qatar',3),
	 ('Iran',3),
	 ('South Korea',4),
	 ('Argentina',7),
	 ('Uruguay',3),
	 ('Ecuador',3);
INSERT INTO prode.equiposqatar2022 (Equipo,Partidos) VALUES
	 ('Ghana',3),
	 ('Brazil',5),
	 ('USMNT',4),
	 ('Cameroon',3),
	 ('Mexico',3),
	 ('Senegal',4),
	 ('Canada',3),
	 ('Morocco',7),
	 ('Tunisia',3),
	 ('Wales',3);
INSERT INTO prode.equiposqatar2022 (Equipo,Partidos) VALUES
	 ('Australia',4),
	 ('Costa Rica',3);
-- prode.partidosqatar2022 definition

CREATE TABLE `partidosqatar2022` (
  `idPartido` int(11) DEFAULT NULL,
  `Equipo1` varchar(50) DEFAULT NULL,
  `GolesEq1` int(11) DEFAULT NULL,
  `GolesEq2` int(11) DEFAULT NULL,
  `Equipo2` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


INSERT INTO prode.partidosqatar2022 (idPartido,Equipo1,GolesEq1,GolesEq2,Equipo2) VALUES
	 (101,'Qatar',0,2,'Ecuador'),
	 (102,'England',6,2,'Iran'),
	 (103,'Senegal',0,2,'Netherlands'),
	 (104,'USMNT',1,1,'Wales'),
	 (105,'Argentina',1,2,'Saudi Arabia'),
	 (106,'Denmark',0,0,'Tunisia'),
	 (107,'Mexico',0,0,'Poland'),
	 (108,'France',4,1,'Australia'),
	 (109,'Morocco',0,0,'Croatia'),
	 (110,'Germany',1,2,'Japan');
INSERT INTO prode.partidosqatar2022 (idPartido,Equipo1,GolesEq1,GolesEq2,Equipo2) VALUES
	 (111,'Spain',7,0,'Costa Rica'),
	 (112,'Belgium',1,0,'Canada'),
	 (113,'Switzerland',1,0,'Cameroon'),
	 (114,'Uruguay',0,0,'South Korea'),
	 (115,'Portugal',3,2,'Ghana'),
	 (116,'Brazil',2,0,'Serbia'),
	 (201,'Wales',0,2,'Iran'),
	 (202,'Qatar',1,3,'Senegal'),
	 (203,'Netherlands',1,1,'Ecuador'),
	 (204,'England',0,0,'USMNT');
INSERT INTO prode.partidosqatar2022 (idPartido,Equipo1,GolesEq1,GolesEq2,Equipo2) VALUES
	 (205,'Tunisia',0,1,'Australia'),
	 (206,'Poland',2,0,'Saudi Arabia'),
	 (207,'France',2,1,'Denmark'),
	 (208,'Argentina',2,0,'Mexico'),
	 (209,'Japan',0,1,'Costa Rica'),
	 (210,'Belgium',0,2,'Morocco'),
	 (211,'Croatia',4,1,'Canada'),
	 (212,'Spain',1,1,'Germany'),
	 (213,'Cameroon',3,3,'Serbia'),
	 (214,'South Korea',2,3,'Ghana');
INSERT INTO prode.partidosqatar2022 (idPartido,Equipo1,GolesEq1,GolesEq2,Equipo2) VALUES
	 (215,'Brazil',1,0,'Switzerland'),
	 (216,'Portugal',2,0,'Uruguay'),
	 (301,'Ecuador',1,2,'Senegal'),
	 (302,'Netherlands',2,0,'Qatar'),
	 (303,'Wales',0,3,'England'),
	 (304,'Iran',0,1,'USMNT'),
	 (305,'Australia',1,0,'Denmark'),
	 (306,'Tunisia',1,0,'France'),
	 (307,'Saudi Arabia',1,2,'Mexico'),
	 (308,'Poland',0,2,'Argentina');
INSERT INTO prode.partidosqatar2022 (idPartido,Equipo1,GolesEq1,GolesEq2,Equipo2) VALUES
	 (309,'Croatia',0,0,'Belgium'),
	 (310,'Canada',1,2,'Morocco'),
	 (311,'Japan',2,1,'Spain'),
	 (312,'Costa Rica',2,4,'Germany'),
	 (313,'Ghana',0,2,'Uruguay'),
	 (314,'South Korea',2,1,'Portugal'),
	 (315,'Cameroon',1,0,'Brazil'),
	 (316,'Serbia',2,3,'Switzerland'),
	 (401,'Netherlands',3,1,'USMNT'),
	 (402,'Argentina',2,1,'Australia');
INSERT INTO prode.partidosqatar2022 (idPartido,Equipo1,GolesEq1,GolesEq2,Equipo2) VALUES
	 (403,'France',3,1,'Poland'),
	 (404,'England',3,0,'Senegal'),
	 (405,'Japan',1,1,'Croatia'),
	 (406,'Brazil',4,1,'South Korea'),
	 (407,'Morocco',0,0,'Spain'),
	 (408,'Portugal',6,1,'Switzerland'),
	 (501,'Croatia',1,1,'Brazil'),
	 (502,'Netherlands',2,2,'Argentina'),
	 (503,'Morocco',1,0,'Portugal'),
	 (504,'England',1,2,'France');
INSERT INTO prode.partidosqatar2022 (idPartido,Equipo1,GolesEq1,GolesEq2,Equipo2) VALUES
	 (601,'Argentina',3,0,'Croatia'),
	 (602,'France',2,0,'Morocco'),
	 (701,'Croatia',2,1,'Morocco'),
	 (702,'Argentina',3,3,'France');
	 -- prode.pronosticoqatar2022 definition

CREATE TABLE `pronosticoqatar2022` (
  `idApostador` int(11) DEFAULT NULL,
  `idPartido` int(11) DEFAULT NULL,
  `Equipo1` varchar(50) DEFAULT NULL,
  `Pronostico` int(11) DEFAULT NULL,
  `Equipo2` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO prode.pronosticoqatar2022 (idApostador,idPartido,Equipo1,Pronostico,Equipo2) VALUES
	 (22861213,101,'Qatar',3,'Ecuador'),
	 (22861213,102,'England',1,'Iran'),
	 (22861213,103,'Senegal',3,'Netherlands'),
	 (22861213,104,'USMNT',2,'Wales'),
	 (22861213,105,'Argentina',3,'Saudi Arabia'),
	 (22861213,106,'Denmark',2,'Tunisia'),
	 (22861213,107,'Mexico',2,'Poland'),
	 (22861213,108,'France',1,'Australia'),
	 (22861213,109,'Morocco',2,'Croatia'),
	 (22861213,110,'Germany',3,'Japan');
INSERT INTO prode.pronosticoqatar2022 (idApostador,idPartido,Equipo1,Pronostico,Equipo2) VALUES
	 (22861213,111,'Spain',1,'Costa Rica'),
	 (22861213,112,'Belgium',1,'Canada'),
	 (22861213,113,'Switzerland',1,'Cameroon'),
	 (22861213,114,'Uruguay',2,'South Korea'),
	 (22861213,115,'Portugal',1,'Ghana'),
	 (22861213,116,'Brazil',1,'Serbia'),
	 (22861213,201,'Wales',3,'Iran'),
	 (22861213,202,'Qatar',1,'Senegal'),
	 (22861213,203,'Netherlands',2,'Ecuador'),
	 (22861213,204,'England',3,'USMNT');
INSERT INTO prode.pronosticoqatar2022 (idApostador,idPartido,Equipo1,Pronostico,Equipo2) VALUES
	 (22861213,205,'Tunisia',3,'Australia'),
	 (22861213,206,'Poland',1,'Saudi Arabia'),
	 (22861213,207,'France',1,'Denmark'),
	 (22861213,208,'Argentina',3,'Mexico'),
	 (22861213,209,'Japan',2,'Costa Rica'),
	 (22861213,210,'Belgium',1,'Morocco'),
	 (22861213,211,'Croatia',2,'Canada'),
	 (22861213,212,'Spain',2,'Germany'),
	 (22861213,213,'Cameroon',2,'Serbia'),
	 (22861213,214,'South Korea',2,'Ghana');
INSERT INTO prode.pronosticoqatar2022 (idApostador,idPartido,Equipo1,Pronostico,Equipo2) VALUES
	 (22861213,215,'Brazil',2,'Switzerland'),
	 (22861213,216,'Portugal',2,'Uruguay'),
	 (22861213,301,'Ecuador',3,'Senegal'),
	 (22861213,302,'Netherlands',3,'Qatar'),
	 (22861213,303,'Wales',3,'England'),
	 (22861213,304,'Iran',2,'USMNT'),
	 (22861213,305,'Australia',3,'Denmark'),
	 (22861213,306,'Tunisia',3,'France'),
	 (22861213,307,'Saudi Arabia',1,'Mexico'),
	 (22861213,308,'Poland',1,'Argentina');
INSERT INTO prode.pronosticoqatar2022 (idApostador,idPartido,Equipo1,Pronostico,Equipo2) VALUES
	 (22861213,309,'Croatia',1,'Belgium'),
	 (22861213,310,'Canada',3,'Morocco'),
	 (22861213,311,'Japan',1,'Spain'),
	 (22861213,312,'Costa Rica',2,'Germany'),
	 (22861213,313,'Ghana',1,'Uruguay'),
	 (22861213,314,'South Korea',2,'Portugal'),
	 (22861213,315,'Cameroon',3,'Brazil'),
	 (22861213,316,'Serbia',3,'Switzerland'),
	 (22861213,401,'Netherlands',2,'USMNT'),
	 (22861213,402,'Argentina',2,'Australia');
INSERT INTO prode.pronosticoqatar2022 (idApostador,idPartido,Equipo1,Pronostico,Equipo2) VALUES
	 (22861213,403,'France',1,'Poland'),
	 (22861213,404,'England',1,'Senegal'),
	 (22861213,405,'Japan',3,'Croatia'),
	 (22861213,406,'Brazil',1,'South Korea'),
	 (22861213,407,'Morocco',3,'Spain'),
	 (22861213,408,'Portugal',3,'Switzerland'),
	 (22861213,501,'Croatia',3,'Brazil'),
	 (22861213,502,'Netherlands',3,'Argentina'),
	 (22861213,503,'Morocco',1,'Portugal'),
	 (22861213,504,'England',3,'France');
INSERT INTO prode.pronosticoqatar2022 (idApostador,idPartido,Equipo1,Pronostico,Equipo2) VALUES
	 (22861213,601,'Argentina',3,'Croatia'),
	 (22861213,602,'France',3,'Morocco'),
	 (22861213,701,'Croatia',1,'Morocco'),
	 (22861213,702,'Argentina',1,'France'),
	 (35566056,101,'Qatar',2,'Ecuador'),
	 (35566056,102,'England',2,'Iran'),
	 (35566056,103,'Senegal',2,'Netherlands'),
	 (35566056,104,'USMNT',3,'Wales'),
	 (35566056,105,'Argentina',3,'Saudi Arabia'),
	 (35566056,106,'Denmark',3,'Tunisia');
INSERT INTO prode.pronosticoqatar2022 (idApostador,idPartido,Equipo1,Pronostico,Equipo2) VALUES
	 (35566056,107,'Mexico',1,'Poland'),
	 (35566056,108,'France',1,'Australia'),
	 (35566056,109,'Morocco',3,'Croatia'),
	 (35566056,110,'Germany',1,'Japan'),
	 (35566056,111,'Spain',1,'Costa Rica'),
	 (35566056,112,'Belgium',2,'Canada'),
	 (35566056,113,'Switzerland',1,'Cameroon'),
	 (35566056,114,'Uruguay',2,'South Korea'),
	 (35566056,115,'Portugal',1,'Ghana'),
	 (35566056,116,'Brazil',3,'Serbia');
INSERT INTO prode.pronosticoqatar2022 (idApostador,idPartido,Equipo1,Pronostico,Equipo2) VALUES
	 (35566056,201,'Wales',2,'Iran'),
	 (35566056,202,'Qatar',3,'Senegal'),
	 (35566056,203,'Netherlands',2,'Ecuador'),
	 (35566056,204,'England',3,'USMNT'),
	 (35566056,205,'Tunisia',1,'Australia'),
	 (35566056,206,'Poland',2,'Saudi Arabia'),
	 (35566056,207,'France',2,'Denmark'),
	 (35566056,208,'Argentina',3,'Mexico'),
	 (35566056,209,'Japan',2,'Costa Rica'),
	 (35566056,210,'Belgium',2,'Morocco');
INSERT INTO prode.pronosticoqatar2022 (idApostador,idPartido,Equipo1,Pronostico,Equipo2) VALUES
	 (35566056,211,'Croatia',2,'Canada'),
	 (35566056,212,'Spain',2,'Germany'),
	 (35566056,213,'Cameroon',1,'Serbia'),
	 (35566056,214,'South Korea',2,'Ghana'),
	 (35566056,215,'Brazil',2,'Switzerland'),
	 (35566056,216,'Portugal',1,'Uruguay'),
	 (35566056,301,'Ecuador',2,'Senegal'),
	 (35566056,302,'Netherlands',1,'Qatar'),
	 (35566056,303,'Wales',1,'England'),
	 (35566056,304,'Iran',2,'USMNT');
INSERT INTO prode.pronosticoqatar2022 (idApostador,idPartido,Equipo1,Pronostico,Equipo2) VALUES
	 (35566056,305,'Australia',2,'Denmark'),
	 (35566056,306,'Tunisia',1,'France'),
	 (35566056,307,'Saudi Arabia',3,'Mexico'),
	 (35566056,308,'Poland',2,'Argentina'),
	 (35566056,309,'Croatia',1,'Belgium'),
	 (35566056,310,'Canada',1,'Morocco'),
	 (35566056,311,'Japan',2,'Spain'),
	 (35566056,312,'Costa Rica',2,'Germany'),
	 (35566056,313,'Ghana',1,'Uruguay'),
	 (35566056,314,'South Korea',3,'Portugal');
INSERT INTO prode.pronosticoqatar2022 (idApostador,idPartido,Equipo1,Pronostico,Equipo2) VALUES
	 (35566056,315,'Cameroon',3,'Brazil'),
	 (35566056,316,'Serbia',3,'Switzerland'),
	 (35566056,401,'Netherlands',2,'USMNT'),
	 (35566056,402,'Argentina',1,'Australia'),
	 (35566056,403,'France',1,'Poland'),
	 (35566056,404,'England',1,'Senegal'),
	 (35566056,405,'Japan',1,'Croatia'),
	 (35566056,406,'Brazil',1,'South Korea'),
	 (35566056,407,'Morocco',2,'Spain'),
	 (35566056,408,'Portugal',2,'Switzerland');
INSERT INTO prode.pronosticoqatar2022 (idApostador,idPartido,Equipo1,Pronostico,Equipo2) VALUES
	 (35566056,501,'Croatia',1,'Brazil'),
	 (35566056,502,'Netherlands',2,'Argentina'),
	 (35566056,503,'Morocco',3,'Portugal'),
	 (35566056,504,'England',1,'France'),
	 (35566056,601,'Argentina',3,'Croatia'),
	 (35566056,602,'France',3,'Morocco'),
	 (35566056,701,'Croatia',3,'Morocco'),
	 (35566056,702,'Argentina',1,'France'),
	 (52588909,101,'Qatar',2,'Ecuador'),
	 (52588909,102,'England',3,'Iran');
INSERT INTO prode.pronosticoqatar2022 (idApostador,idPartido,Equipo1,Pronostico,Equipo2) VALUES
	 (52588909,103,'Senegal',1,'Netherlands'),
	 (52588909,104,'USMNT',2,'Wales'),
	 (52588909,105,'Argentina',3,'Saudi Arabia'),
	 (52588909,106,'Denmark',2,'Tunisia'),
	 (52588909,107,'Mexico',2,'Poland'),
	 (52588909,108,'France',2,'Australia'),
	 (52588909,109,'Morocco',3,'Croatia'),
	 (52588909,110,'Germany',2,'Japan'),
	 (52588909,111,'Spain',3,'Costa Rica'),
	 (52588909,112,'Belgium',2,'Canada');
INSERT INTO prode.pronosticoqatar2022 (idApostador,idPartido,Equipo1,Pronostico,Equipo2) VALUES
	 (52588909,113,'Switzerland',1,'Cameroon'),
	 (52588909,114,'Uruguay',2,'South Korea'),
	 (52588909,115,'Portugal',2,'Ghana'),
	 (52588909,116,'Brazil',3,'Serbia'),
	 (52588909,201,'Wales',2,'Iran'),
	 (52588909,202,'Qatar',1,'Senegal'),
	 (52588909,203,'Netherlands',1,'Ecuador'),
	 (52588909,204,'England',1,'USMNT'),
	 (52588909,205,'Tunisia',1,'Australia'),
	 (52588909,206,'Poland',1,'Saudi Arabia');
INSERT INTO prode.pronosticoqatar2022 (idApostador,idPartido,Equipo1,Pronostico,Equipo2) VALUES
	 (52588909,207,'France',3,'Denmark'),
	 (52588909,208,'Argentina',2,'Mexico'),
	 (52588909,209,'Japan',3,'Costa Rica'),
	 (52588909,210,'Belgium',2,'Morocco'),
	 (52588909,211,'Croatia',1,'Canada'),
	 (52588909,212,'Spain',1,'Germany'),
	 (52588909,213,'Cameroon',3,'Serbia'),
	 (52588909,214,'South Korea',1,'Ghana'),
	 (52588909,215,'Brazil',2,'Switzerland'),
	 (52588909,216,'Portugal',3,'Uruguay');
INSERT INTO prode.pronosticoqatar2022 (idApostador,idPartido,Equipo1,Pronostico,Equipo2) VALUES
	 (52588909,301,'Ecuador',2,'Senegal'),
	 (52588909,302,'Netherlands',2,'Qatar'),
	 (52588909,303,'Wales',1,'England'),
	 (52588909,304,'Iran',1,'USMNT'),
	 (52588909,305,'Australia',3,'Denmark'),
	 (52588909,306,'Tunisia',2,'France'),
	 (52588909,307,'Saudi Arabia',3,'Mexico'),
	 (52588909,308,'Poland',2,'Argentina'),
	 (52588909,309,'Croatia',1,'Belgium'),
	 (52588909,310,'Canada',1,'Morocco');
INSERT INTO prode.pronosticoqatar2022 (idApostador,idPartido,Equipo1,Pronostico,Equipo2) VALUES
	 (52588909,311,'Japan',3,'Spain'),
	 (52588909,312,'Costa Rica',3,'Germany'),
	 (52588909,313,'Ghana',3,'Uruguay'),
	 (52588909,314,'South Korea',2,'Portugal'),
	 (52588909,315,'Cameroon',3,'Brazil'),
	 (52588909,316,'Serbia',1,'Switzerland'),
	 (52588909,401,'Netherlands',3,'USMNT'),
	 (52588909,402,'Argentina',3,'Australia'),
	 (52588909,403,'France',2,'Poland'),
	 (52588909,404,'England',2,'Senegal');
INSERT INTO prode.pronosticoqatar2022 (idApostador,idPartido,Equipo1,Pronostico,Equipo2) VALUES
	 (52588909,405,'Japan',3,'Croatia'),
	 (52588909,406,'Brazil',3,'South Korea'),
	 (52588909,407,'Morocco',3,'Spain'),
	 (52588909,408,'Portugal',2,'Switzerland'),
	 (52588909,501,'Croatia',2,'Brazil'),
	 (52588909,502,'Netherlands',1,'Argentina'),
	 (52588909,503,'Morocco',1,'Portugal'),
	 (52588909,504,'England',1,'France'),
	 (52588909,601,'Argentina',3,'Croatia'),
	 (52588909,602,'France',1,'Morocco');
INSERT INTO prode.pronosticoqatar2022 (idApostador,idPartido,Equipo1,Pronostico,Equipo2) VALUES
	 (52588909,701,'Croatia',3,'Morocco'),
	 (52588909,702,'Argentina',1,'France'),
	 (86579607,101,'Qatar',2,'Ecuador'),
	 (86579607,102,'England',2,'Iran'),
	 (86579607,103,'Senegal',3,'Netherlands'),
	 (86579607,104,'USMNT',1,'Wales'),
	 (86579607,105,'Argentina',1,'Saudi Arabia'),
	 (86579607,106,'Denmark',3,'Tunisia'),
	 (86579607,107,'Mexico',1,'Poland'),
	 (86579607,108,'France',3,'Australia');
INSERT INTO prode.pronosticoqatar2022 (idApostador,idPartido,Equipo1,Pronostico,Equipo2) VALUES
	 (86579607,109,'Morocco',1,'Croatia'),
	 (86579607,110,'Germany',2,'Japan'),
	 (86579607,111,'Spain',1,'Costa Rica'),
	 (86579607,112,'Belgium',3,'Canada'),
	 (86579607,113,'Switzerland',1,'Cameroon'),
	 (86579607,114,'Uruguay',1,'South Korea'),
	 (86579607,115,'Portugal',2,'Ghana'),
	 (86579607,116,'Brazil',2,'Serbia'),
	 (86579607,201,'Wales',2,'Iran'),
	 (86579607,202,'Qatar',3,'Senegal');
INSERT INTO prode.pronosticoqatar2022 (idApostador,idPartido,Equipo1,Pronostico,Equipo2) VALUES
	 (86579607,203,'Netherlands',1,'Ecuador'),
	 (86579607,204,'England',2,'USMNT'),
	 (86579607,205,'Tunisia',2,'Australia'),
	 (86579607,206,'Poland',2,'Saudi Arabia'),
	 (86579607,207,'France',3,'Denmark'),
	 (86579607,208,'Argentina',2,'Mexico'),
	 (86579607,209,'Japan',2,'Costa Rica'),
	 (86579607,210,'Belgium',2,'Morocco'),
	 (86579607,211,'Croatia',3,'Canada'),
	 (86579607,212,'Spain',1,'Germany');
INSERT INTO prode.pronosticoqatar2022 (idApostador,idPartido,Equipo1,Pronostico,Equipo2) VALUES
	 (86579607,213,'Cameroon',2,'Serbia'),
	 (86579607,214,'South Korea',1,'Ghana'),
	 (86579607,215,'Brazil',2,'Switzerland'),
	 (86579607,216,'Portugal',1,'Uruguay'),
	 (86579607,301,'Ecuador',2,'Senegal'),
	 (86579607,302,'Netherlands',2,'Qatar'),
	 (86579607,303,'Wales',2,'England'),
	 (86579607,304,'Iran',3,'USMNT'),
	 (86579607,305,'Australia',1,'Denmark'),
	 (86579607,306,'Tunisia',2,'France');
INSERT INTO prode.pronosticoqatar2022 (idApostador,idPartido,Equipo1,Pronostico,Equipo2) VALUES
	 (86579607,307,'Saudi Arabia',2,'Mexico'),
	 (86579607,308,'Poland',3,'Argentina'),
	 (86579607,309,'Croatia',3,'Belgium'),
	 (86579607,310,'Canada',1,'Morocco'),
	 (86579607,311,'Japan',2,'Spain'),
	 (86579607,312,'Costa Rica',3,'Germany'),
	 (86579607,313,'Ghana',2,'Uruguay'),
	 (86579607,314,'South Korea',1,'Portugal'),
	 (86579607,315,'Cameroon',1,'Brazil'),
	 (86579607,316,'Serbia',1,'Switzerland');
INSERT INTO prode.pronosticoqatar2022 (idApostador,idPartido,Equipo1,Pronostico,Equipo2) VALUES
	 (86579607,401,'Netherlands',1,'USMNT'),
	 (86579607,402,'Argentina',2,'Australia'),
	 (86579607,403,'France',2,'Poland'),
	 (86579607,404,'England',3,'Senegal'),
	 (86579607,405,'Japan',1,'Croatia'),
	 (86579607,406,'Brazil',1,'South Korea'),
	 (86579607,407,'Morocco',2,'Spain'),
	 (86579607,408,'Portugal',3,'Switzerland'),
	 (86579607,501,'Croatia',3,'Brazil'),
	 (86579607,502,'Netherlands',3,'Argentina');
INSERT INTO prode.pronosticoqatar2022 (idApostador,idPartido,Equipo1,Pronostico,Equipo2) VALUES
	 (86579607,503,'Morocco',2,'Portugal'),
	 (86579607,504,'England',3,'France'),
	 (86579607,601,'Argentina',2,'Croatia'),
	 (86579607,602,'France',1,'Morocco'),
	 (86579607,701,'Croatia',3,'Morocco'),
	 (86579607,702,'Argentina',2,'France'),
	 (34421168,101,'Qatar',3,'Ecuador'),
	 (34421168,102,'England',2,'Iran'),
	 (34421168,103,'Senegal',3,'Netherlands'),
	 (34421168,104,'USMNT',1,'Wales');
INSERT INTO prode.pronosticoqatar2022 (idApostador,idPartido,Equipo1,Pronostico,Equipo2) VALUES
	 (34421168,105,'Argentina',1,'Saudi Arabia'),
	 (34421168,106,'Denmark',1,'Tunisia'),
	 (34421168,107,'Mexico',1,'Poland'),
	 (34421168,108,'France',3,'Australia'),
	 (34421168,109,'Morocco',3,'Croatia'),
	 (34421168,110,'Germany',1,'Japan'),
	 (34421168,111,'Spain',2,'Costa Rica'),
	 (34421168,112,'Belgium',3,'Canada'),
	 (34421168,113,'Switzerland',2,'Cameroon'),
	 (34421168,114,'Uruguay',2,'South Korea');
INSERT INTO prode.pronosticoqatar2022 (idApostador,idPartido,Equipo1,Pronostico,Equipo2) VALUES
	 (34421168,115,'Portugal',3,'Ghana'),
	 (34421168,116,'Brazil',2,'Serbia'),
	 (34421168,201,'Wales',1,'Iran'),
	 (34421168,202,'Qatar',1,'Senegal'),
	 (34421168,203,'Netherlands',1,'Ecuador'),
	 (34421168,204,'England',2,'USMNT'),
	 (34421168,205,'Tunisia',2,'Australia'),
	 (34421168,206,'Poland',3,'Saudi Arabia'),
	 (34421168,207,'France',2,'Denmark'),
	 (34421168,208,'Argentina',2,'Mexico');
INSERT INTO prode.pronosticoqatar2022 (idApostador,idPartido,Equipo1,Pronostico,Equipo2) VALUES
	 (34421168,209,'Japan',2,'Costa Rica'),
	 (34421168,210,'Belgium',1,'Morocco'),
	 (34421168,211,'Croatia',1,'Canada'),
	 (34421168,212,'Spain',2,'Germany'),
	 (34421168,213,'Cameroon',1,'Serbia'),
	 (34421168,214,'South Korea',1,'Ghana'),
	 (34421168,215,'Brazil',3,'Switzerland'),
	 (34421168,216,'Portugal',3,'Uruguay'),
	 (34421168,301,'Ecuador',3,'Senegal'),
	 (34421168,302,'Netherlands',3,'Qatar');
INSERT INTO prode.pronosticoqatar2022 (idApostador,idPartido,Equipo1,Pronostico,Equipo2) VALUES
	 (34421168,303,'Wales',2,'England'),
	 (34421168,304,'Iran',2,'USMNT'),
	 (34421168,305,'Australia',2,'Denmark'),
	 (34421168,306,'Tunisia',3,'France'),
	 (34421168,307,'Saudi Arabia',1,'Mexico'),
	 (34421168,308,'Poland',3,'Argentina'),
	 (34421168,309,'Croatia',3,'Belgium'),
	 (34421168,310,'Canada',3,'Morocco'),
	 (34421168,311,'Japan',2,'Spain'),
	 (34421168,312,'Costa Rica',2,'Germany');
INSERT INTO prode.pronosticoqatar2022 (idApostador,idPartido,Equipo1,Pronostico,Equipo2) VALUES
	 (34421168,313,'Ghana',2,'Uruguay'),
	 (34421168,314,'South Korea',1,'Portugal'),
	 (34421168,315,'Cameroon',2,'Brazil'),
	 (34421168,316,'Serbia',1,'Switzerland'),
	 (34421168,401,'Netherlands',1,'USMNT'),
	 (34421168,402,'Argentina',1,'Australia'),
	 (34421168,403,'France',1,'Poland'),
	 (34421168,404,'England',3,'Senegal'),
	 (34421168,405,'Japan',3,'Croatia'),
	 (34421168,406,'Brazil',1,'South Korea');
INSERT INTO prode.pronosticoqatar2022 (idApostador,idPartido,Equipo1,Pronostico,Equipo2) VALUES
	 (34421168,407,'Morocco',3,'Spain'),
	 (34421168,408,'Portugal',1,'Switzerland'),
	 (34421168,501,'Croatia',1,'Brazil'),
	 (34421168,502,'Netherlands',1,'Argentina'),
	 (34421168,503,'Morocco',2,'Portugal'),
	 (34421168,504,'England',1,'France'),
	 (34421168,601,'Argentina',1,'Croatia'),
	 (34421168,602,'France',3,'Morocco'),
	 (34421168,701,'Croatia',2,'Morocco'),
	 (34421168,702,'Argentina',2,'France');