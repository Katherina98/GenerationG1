use generationg1;

CREATE TABLE registros(
    id int PRIMARY KEY NOT NULL AUTO_INCREMENT,
    codigo_registro varchar(50) NOT NULL,
    rut varchar(50) NOT NULL
);

CREATE TABLE cursos(
    id int PRIMARY KEY NOT NULL AUTO_INCREMENT,
    nombre varchar(30) NOT NULL,
    descripcion varchar(100)
);

CREATE TABLE direcciones(
    id int PRIMARY KEY NOT NULL AUTO_INCREMENT,
    nombre varchar(30) NOT NULL,
    numero int not null,
    ciudad int,
    region int,
    pais int
);



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
FOREIGN KEY (direccion_id) REFERENCES direcciones(id),
ADD CONSTRAINT FK_curso_id -- asignar nombre a la relacion
FOREIGN KEY (curso_id) REFERENCES cursos(id),
ADD CONSTRAINT FK_registro_id -- asignar nombre a la relacion
FOREIGN KEY (registro_id) REFERENCES registros(id)
;

-- creacion de tablas
CREATE TABLE usuarios (
    id int PRIMARY KEY NOT NULL AUTO_INCREMENT,
    nick varchar (20) NOT NULL,
    email varchar (50) NOT NULL,
    password varchar(30) NOT NULL
)

CREATE TABLE grupos (
    id int PRIMARY KEY NOT NULL AUTO_INCREMENT,
    nombre varchar (20) NOT NULL,
)

CREATE TABLE grupos_usuarios (
    id int PRIMARY KEY NOT NULL AUTO_INCREMENT,
    grupos_id int,
    usuarios_id int
)
-- foreing key
ALTER TABLE grupos_usuarios
ADD CONSTRAINT FK_grupos_id
FOREIGN KEY (grupos_id) REFERENCES grupos(id),
ADD CONSTRAINT FK_usuarios_id
FOREIGN KEY (usuarios_id) REFERENCES usuarios(id),
