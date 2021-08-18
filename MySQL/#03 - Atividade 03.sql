create database db_escola;
use db_escola;
create table tb_alunes (
id int primary key auto_increment,
nome varchar(50),
nota decimal (4,2)
);

insert into tb_alunes (nome,nota) values
("aly", 8.00),
("ju", 7.00),
("ba", 5.00),
("vito", 10.00),
("day", 6.00),
("jubs", 10.00),
("bia", 8.00),
("leo", 6.00);

select * from  tb_alunes;
update tb_alunes set nota = 6 where id = 6;
select * from  tb_alunes where nota > 7;
select * from  tb_alunes where nota < 7;




