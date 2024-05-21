create table users(username varchar(20),fullname varchar(60),pwd varchar(20),email varchar(100),mobile bigint,status char(2));

insert into users values('sreedhar','Sreedhar Kosaraju','abc1234$','sreedhar@nkxgen.com',9000923366,'AC');
insert into users values('samba','Samba','abc1234$','samba@nkxgen.com',9642923366,'AC');
insert into users values('mahesh','Mahesh Surapaneni','abc1234$','mahesh@nkxgen.com',9642523366,'AC');

create table products(prod_id int,pname varchar(50),pdesc varchar(200),price numeric,stock int,pfile varchar(255),status char(2));

insert into products values(101,'NESCAFE','NESCAFFE',120,50,'media/images/nescaffe.jpg','AC');
insert into products values(102,'Sunrise','Sunrise',190,40,'media/images/sunrise.jpg','AC');
insert into products values(103,'BRU Instant','BRU',170,55,'media/images/bru.jpg','AC');
insert into products values(104,'Red Label Tea','Red Label Tea',320,50,'media/images/redlabel.jpg','AC');
insert into products values(105,'Taj Mahal Tea','Taj Mahal Tea',220,70,'media/images/tajmahal.jpg','AC');
insert into products values(106,'Three Roses','Three Roses',120,50,'media/images/3roses.jpg','AC');
insert into products values(107,'Horlicks','Horlics',220,150,'media/images/horlicks.jpg','AC');




