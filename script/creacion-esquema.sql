-- password is 'somePassword' hashed con http://www.nitrxgen.net/hashgen/ - Ojo que tal vez haya que agregar un '*' adelante
CREATE USER 'jveron'@'localhost' IDENTIFIED BY PASSWORD '*B04E11FAAAE9A5A019BAF695B40F3BF1997EB194'; 

CREATE SCHEMA IF NOT EXISTS `appschema`;

USE `appschema`;

create table usuario (
	id integer AUTO__INCREMENT not null,
	usuario varchar (50) not null,
	contrasenia varchar (50) not null,
	nombre varchar (50) not null,
	apellido varchar (50) not null,
	primary key (id)
);

insert into usuario (usuario, contrasenia, nombre, apellido) values('user1','1234','juan','pppp');
insert into usuario (usuario, contrasenia, nombre, apellido) values('user2','1234','martin','pppp');
insert into usuario (usuario, contrasenia, nombre, apellido) values('user3','1234','esteban','pppp');

create table sala (
	id integer AUTO_INCREMENT not null,
	descripcion varchar (500) not null,
	primary key (id)
);

insert into sala (descripcion) values ('Los corales');
insert into sala (descripcion) values ('Los cardales');
insert into sala (descripcion) values ('Principal');

create table evento (
	id integer AUTO_INCREMENT not null,
	fecha DATETIME not null,
	usuarioId integer not null,
	horaInicio DATETIME not null,
	horaFin  DATETIME not null,
	primary key(id),
	FOREIGN KEY (usuarioId) REFERENCES usuario(id)
);

create table evento_privado  (
	id integer not null,
	direccion varchar(500) not null,
	descripcion varchar(500) not null,
	primary key(id)
);

create table reunion (
	id integer not null,
	tema varchar(500) not null,
	salaId integer not null,
);

create table invitado (
	id integer not null AUTO_INCREMENT,
	reunionId integer not null,
	usuarioId integer not null,
	primary key(id),
	FOREIGN KEY (usuarioId) REFERENCES usuario(id),
	FOREIGN KEY (reunionId) REFERENCES reunion(id)
);

