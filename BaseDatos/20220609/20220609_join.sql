
CREATE DATABASE TestJoin;

USE TestJoin;

CREATE TABLE Grupos
(
    Id int PRIMARY KEY NOT NULL,
    Nombre varchar(20)
);

CREATE TABLE Alumnos
(
    Id int PRIMARY KEY NOT NULL AUTO_INCREMENT,
    Nombre varchar(20),
    grupo_id int
);

ALTER TABLE Alumnos 
ADD CONSTRAINT FK_Alumnos_grupo_id
FOREIGN KEY (grupo_id) references Grupos (Id);

INSERT INTO Grupos (Id, Nombre)VALUES(1, 'Grupo1');
INSERT INTO Grupos (Id, Nombre)VALUES(2, 'Grupo2');
INSERT INTO Grupos (Id, Nombre)VALUES(3, 'Grupo3');
INSERT INTO Grupos (Id, Nombre)VALUES(4, 'Grupo4');
INSERT INTO Grupos (Id, Nombre)VALUES(5, 'Grupo5');
INSERT INTO Grupos (Id, Nombre)VALUES(6, 'Grupo6');
INSERT INTO Grupos (Id, Nombre)VALUES(7, 'Grupo7');

INSERT INTO Alumnos (nombre, grupo_id) VALUES('Leonardo Utreras', 1);
INSERT INTO Alumnos (nombre, grupo_id) VALUES('Luis Mejias', 1);
INSERT INTO Alumnos (nombre, grupo_id) VALUES('Francisco Cid', 1);
INSERT INTO Alumnos (nombre, grupo_id) VALUES('Francisco Perez', 1);
INSERT INTO Alumnos (nombre, grupo_id) VALUES('Marysabel Aedo', 1);
INSERT INTO Alumnos (nombre, grupo_id) VALUES('Ignacio Romero', 1);

INSERT INTO alumnos(nombre, grupo_id) VALUES('Nicolas Neira', 2);
INSERT INTO alumnos(nombre, grupo_id) VALUES('Genesis Quezada', 2);
INSERT INTO alumnos(nombre, grupo_id) VALUES('Catalina Castillo', 2);
INSERT INTO alumnos(nombre, grupo_id) VALUES('Carlos Iturra', 2);
INSERT INTO alumnos(nombre, grupo_id) VALUES('Gabriel Guzman', 2);

INSERT INTO Alumnos (nombre, grupo_id) VALUES('Alejandro', 3);
INSERT INTO Alumnos (nombre, grupo_id) VALUES('Luis', 3);
INSERT INTO Alumnos (nombre, grupo_id) VALUES('Cristobal', 3);
INSERT INTO Alumnos (nombre, grupo_id) VALUES('Joao', 3);
INSERT INTO Alumnos (nombre, grupo_id) VALUES('Cristian', 3);

INSERT INTO Alumnos (Nombre, grupo_id) VALUES('Katherina', 4);
INSERT INTO Alumnos (Nombre, grupo_id) VALUES('Catalina', 4);
INSERT INTO Alumnos (Nombre, grupo_id) VALUES('Danko', 4);
INSERT INTO Alumnos (Nombre, grupo_id) VALUES('Wladimir', 4);
INSERT INTO Alumnos (Nombre, grupo_id) VALUES('Esteban', 4);

INSERT INTO Alumnos (nombre, grupo_id) VALUES ('Hector', 5);
INSERT INTO Alumnos (nombre, grupo_id) VALUES ('Constanza', 5);
INSERT INTO Alumnos (nombre, grupo_id) VALUES ('Nicole', 5);
INSERT INTO Alumnos (nombre, grupo_id) VALUES ('Nicolas', 5);
INSERT INTO Alumnos (nombre, grupo_id) VALUES ('Fernando', 5);

INSERT INTO Alumnos (nombre, grupo_id) VALUES('Alondra', 6);
INSERT INTO Alumnos (nombre, grupo_id) VALUES('Diana', 6);
INSERT INTO Alumnos (nombre, grupo_id) VALUES('Matias', 6);
INSERT INTO Alumnos (nombre, grupo_id) VALUES('Michael', 6);
INSERT INTO Alumnos (nombre, grupo_id) VALUES('Paulino', 6);

INSERT INTO Alumnos (nombre, grupo_id) VALUES('Pamela', NULL);
INSERT INTO Alumnos (nombre, grupo_id) VALUES('Israel', NULL);
