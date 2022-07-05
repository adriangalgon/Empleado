drop database if exists db_aeropuerto;

create database db_aeropuerto;

use db_aeropuerto;

drop table if exists employee;

drop table if exists country;

drop table if exists languages;

drop table if exists airport;

-- ================= CREAR TABLAS ==============

create table employee(
	id_employee int auto_increment primary key,
    idcountry int not null,
    idlanguage int not null,
	surname varchar(20) not null,
	firstname varchar(20) not null
);

create table languages(
	id_language int auto_increment primary key,
	code int not null,
	name varchar(30) not null
);

create table country(
	id_country int auto_increment primary key,
    idairport int not null,
	code int not null,
	name varchar(30) not null
);

create table airport(
	id_airport int auto_increment primary key,
	name varchar(30) not null
);


-- ================= CREAR FORANEA ==============

alter table employee 
	add constraint FK_country
    foreign key(idcountry)
   	references country(id_country);

alter table employee 
	add constraint FK_language
    foreign key(idlanguage)
   	references languages(id_language);
    
alter table country
	add constraint FK_airport
	foreign key(idairport)
	references airport(id_airport);