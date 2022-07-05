select * from airport;

select * from country;

select * from employee;

select * from languages;


insert into languages (id_language, code, name) values 
	(1, 13586, "Francés"),
	(2, 34586, "Inglés"),
	(3, 63486, "Español");
    
insert into airport (id_airport, name) values
	(1, "Juan Gualbreto"),
	(2, "Madrid-Barajas"),
	(3, "Domodedovo");

insert into country (id_country, idairport, code, name)values
	(1, 1, 25, "Cuba"),
	(2, 2, 12, "España"),
	(3, 3, 88, "Rusia");
    
insert into employee (id_employee, idcountry, idlanguage, surname, firstname) values
	(1, 1, 1, "Galindo", "Adrián"),
	(2, 2, 2, "Contreras", "Mario"),
	(3, 3, 3, "Camacho", "Mariana");