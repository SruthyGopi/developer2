DROP TABLE IF EXISTS DEVELOPER;

create table DEVELOPER (
                         id identity not null,
                         firstname varchar (255) not null,
                         lastname varchar (255) not null,
                         email varchar (255) not null,
                         skills varchar (255) not null
);

INSERT into DEVELOPER(id, firstname, lastname, email,skills)
VALUES ('10','Sruthy','PG','sr@gmail.com','Java');


INSERT into DEVELOPER(id, firstname, lastname, email,skills)
VALUES ('12','Sarath','Ps','sarath@gmail.com','Python');

INSERT into DEVELOPER(id, firstname, lastname, email,skills)
VALUES ('13','Renjith','kr','renjith@gmail.com','Microservice');

INSERT into DEVELOPER(id, firstname, lastname, email,skills)
VALUES ('14','Swathy','Sa','swathy@gmail.com','c');
