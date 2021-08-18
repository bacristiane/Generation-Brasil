create database db_ecommerce;
use db_ecommerce;
create table tb_produtos (
id int primary key auto_increment,
nome varchar(50),
preco decimal (10,2)
);

insert into tb_produtos (nome,preco) values
("suco", 8.00),
("macarrao", 10.00),
("feijao", 12.00),
("refrigerante", 8.00),
("arroz", 12.00),
("farinha", 14.00),
("manga", 8.00),
("cafe", 6.00);

select * from  tb_produtos;
update tb_produtos set preco = 501 where id = 6;
select * from  tb_produtos where preco > 500;
select * from  tb_produtos where preco < 500;



