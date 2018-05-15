create database PilotPersonalCabin;

-- Teachers table
CREATE TABLE teachers(
	id int(30) NOT NULL AUTO_INCREMENT PRIMARY KEY,
	name varchar(100),
	surname varchar(150),
	course int
);

-- test data
insert into teachers(name, surname, course) values ('Jim', 'Henrix', 'Blues');
insert into teachers(name, surname, course) values ('Reign', 'Wolf', 'Blues');
insert into teachers(name, surname, course) values ('Brother', 'Fogger', 'Country');
insert into teachers(name, surname, course) values ('Lil', 'Wayne', 'Crap');

-- Courses table
create table courses(
	id int(30) NOT NULL AUTO_INCREMENT PRIMARY KEY,
	name varchar(150),
	price int(30),
	start_dt date,
	end_dt date,
	description varchar(250)
);

-- test data
insert into courses(name, price, description) values ('Music theory', 1000, 'bla bla bla');
insert into courses(name, price, description) values ('Blues', 111, 'MOOOODY SHMOOOODY');
insert into courses(name, price, description) values ('Metal', 666, 'speedy shmeeedy');
insert into courses(name, price, description) values ('Punk', 1488, 'Oi! Oi!');

-- Students table
create table students(
	id int(30) NOT NULL AUTO_INCREMENT PRIMARY KEY,
	name varchar(150),
	surname varchar(150),
	course int
);

-- test data
insert into students(name, surname, course) values ('Greg', 'Cucumber', 1);
insert into students(name, surname, course) values ('Hoi', 'Park', 4);
insert into students(name, surname, course) values ('Fuzz', 'Electric', 2);
insert into students(name, surname, course) values ('Eric', 'Hueric', 3);
insert into students(name, surname, course) values ('Shon', 'Cornishon', 4);
insert into students(name, surname, course) values ('Anton', 'Ponton', 1);
insert into students(name, surname, course) values ('Vasya', 'Huyassya', 4);
insert into students(name, surname, course) values ('John', 'Blow', 2);