# AutoMarket
This project is about AutoMarket. The main idea here is collect all data about cars and add new one. Project contains three main packages like, controllers, model and view. We created table in this way:
___________________________________________________________________________
create table cars(
	id int default 1,
	year int,
	brand varchar(90),
	model varchar(90),
	mileage integer,
	volume decimal(10),
	price int,
	location varchar(90)
);

insert into cars (id, year, brand, model, mileage, volume, price, location) values (1, 2006, 'Acura', 'TL', 29, 5, 3782965, 'Krajan Tengah');
insert into cars (id, year, brand, model, mileage, volume, price, location) values (2, 1989, 'Ford', 'LTD Crown Victoria', 35, 2, 2928166, 'Loivos');
insert into cars (id, year, brand, model, mileage, volume, price, location) values (3, 1995, 'Ford', 'F350', 10, 2, 3617857, 'Pangkalan');
insert into cars (id, year, brand, model, mileage, volume, price, location) values (4, 2001, 'Chrysler', 'Prowler', 89, 2, 3354158, 'Khulo');
insert into cars (id, year, brand, model, mileage, volume, price, location) values (5, 2003, 'Mercedes-Benz', 'SLK-Class', 18, 5, 3775806, 'Mbomba');
insert into cars (id, year, brand, model, mileage, volume, price, location) values (6, 2006, 'Audi', 'A6', 48, 4, 4555381, 'Cachoeiro de Itapemirim');
insert into cars (id, year, brand, model, mileage, volume, price, location) values (7, 2010, 'Land Rover', 'Range Rover', 44, 3, 4767336, 'Hekinan');
insert into cars (id, year, brand, model, mileage, volume, price, location) values (8, 2011, 'Chevrolet', 'HHR', 25, 4, 3072863, 'Sanjia');
insert into cars (id, year, brand, model, mileage, volume, price, location) values (9, 1997, 'Lincoln', 'Continental', 47, 3, 3864518, 'Ciasna');
insert into cars (id, year, brand, model, mileage, volume, price, location) values (10, 1985, 'Lincoln', 'Town Car', 39, 4, 2748297, 'Şabyā');
insert into cars (id, year, brand, model, mileage, volume, price, location) values (11, 1991, 'Ford', 'Festiva', 19, 5, 4818551, 'Fukuroi');
insert into cars (id, year, brand, model, mileage, volume, price, location) values (12, 1999, 'Dodge', 'Charger', 18, 3, 2298065, 'Tân Sơn');
insert into cars (id, year, brand, model, mileage, volume, price, location) values (13, 1989, 'Pontiac', 'Safari', 24, 4, 4135039, 'Gagah');
insert into cars (id, year, brand, model, mileage, volume, price, location) values (14, 2001, 'Chevrolet', 'Malibu', 98, 2, 3323214, 'Ogod');
insert into cars (id, year, brand, model, mileage, volume, price, location) values (15, 1994, 'GMC', '2500 Club Coupe', 62, 4, 4780496, 'Sunja');
insert into cars (id, year, brand, model, mileage, volume, price, location) values (16, 2009, 'Cadillac', 'XLR-V', 99, 4, 3050873, 'Puente Nacional');
insert into cars (id, year, brand, model, mileage, volume, price, location) values (17, 2007, 'Pontiac', 'Grand Prix', 37, 4, 4623839, 'Bayan Uula Sumu');
insert into cars (id, year, brand, model, mileage, volume, price, location) values (18, 2006, 'Lexus', 'SC', 71, 3, 3284581, 'Barreiros');
insert into cars (id, year, brand, model, mileage, volume, price, location) values (19, 2003, 'Dodge', 'Ram', 40, 2, 2452360, 'Kangān');
insert into cars (id, year, brand, model, mileage, volume, price, location) values (20, 2009, 'BMW', 'M6', 71, 5, 3633208, 'Paraná');
______________________________________________________________________________________________
Our application can show the list of cars and has functionalities like adding new cars with special characteristics and searching cars by properties.
_______________________________________________________________________________________________
Controller package - contains main commands about controllers of project.
Database package - is about connection between IntellijIdea and PostgreSQL.
Entitities - is about our main SQL table.
AddRepository, IAddRepository, ISearchRepository, SearchRepository are about repositories and interfaces.
On view package you can show the main console application.
