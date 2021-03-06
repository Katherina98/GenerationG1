use generationg1;

-- crear tabla curso
create table  cursos  ( 
id int primary key Auto_increment,
nombre varchar(10) Not null,
descripcion varchar(50)
);

-- crear tabla registro
create table  registros  ( 
id int primary key Auto_increment,
codigo varchar(30) Not null,
rut varchar(10) Not null
);

-- crear tabla direcciones1
create table  direcciones1  ( 
id int primary key Auto_increment,
nombre varchar(10) Not null,
numero varchar(10),
ciudad varchar(10),
region Integer,
pais Integer
);

-- crear tabla alumnos
CREATE TABLE alumnos(
    id int PRIMARY KEY NOT NULL AUTO_INCREMENT,
    nombre varchar(50) NOT NULL,
    apellido varchar(50) NOT NULL,
    edad int,
    curso_id int,
    direccion_id int,
    registro_id int
);

-- FOREING KEY
ALTER TABLE alumnos
ADD CONSTRAINT FK_direccion_id -- asignar nombre a la relacion
FOREIGN KEY (direccion_id) REFERENCES direcciones1(id)

ALTER TABLE alumnos
ADD CONSTRAINT FK_curso_id -- asignar nombre a la relacion
FOREIGN KEY (curso_id) REFERENCES cursos(id)

ALTER TABLE alumnos
ADD CONSTRAINT FK_registro_id -- asignar nombre a la relacion
FOREIGN KEY (registro_id) REFERENCES registros(id)


-- insertar datos para cursos
insert into cursos (id, nombre, descripcion) values (1, 'alfa', 'los mas aplicados');
insert into cursos (id, nombre, descripcion) values (2, 'beta', 'los mas inteligentes');
insert into cursos (id, nombre, descripcion) values (3, 'gamma', 'los mas astutos');

-- insertar datos para registros
insert into registros (id, codigo, rut) values (1, 'ABE22315', '12345678-9');
insert into registros (id, codigo, rut) values (2, 'TLP112235', '98765432-1');
insert into registros (codigo, rut) values ('TLP112236', '12312345-6');

-- insertar datos para direcciones
INSERT INTO direcciones1 (nombre, numero, ciudad, region, pais) VALUES('hipodromo', '1640', 'santiago', 13, 1);
INSERT INTO direcciones1 (nombre, numero, ciudad, region, pais) VALUES('brown norte', '290', 'santiago', 13, 1);
INSERT INTO direcciones1 (nombre, numero, ciudad, region, pais) VALUES('blest gana', '1720-A', 'santiago', 13, 1);

-- insertar datos para alumnos
INSERT INTO alumno (nombre, apellido, edad, curso_id, registro_id, direcciones_id) VALUES('Zoe', 'Morales', 3, 1, 1, 1);
INSERT INTO alumno (nombre, apellido, edad, curso_id, registro_id, direcciones_id) VALUES('Ana', 'Lopez', 4, 1, 2, 2);
INSERT INTO alumno (nombre, apellido, edad, curso_id, registro_id, direcciones_id) VALUES('Ivan', 'Fuentes', 3, 2, 3, 3);

