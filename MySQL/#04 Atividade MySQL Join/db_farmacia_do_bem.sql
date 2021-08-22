create database db_farmacia_do_bem;

use db_farmacia_do_bem;

create table tb_categoria(
	id int primary key auto_increment,
	funcionario varchar (30),
	rede varchar (30),
	categoria varchar (30)
);

create table tb_produto (
	id int primary key auto_increment,
    nome varchar (30),
    preco decimal (6,2),
    tamanho varchar (30),
    validade varchar (30),
    lote varchar (30),
    categoria_id int,
    foreign key(categoria_id) references tb_categoria (id)
);

insert into tb_categoria (funcionario, rede, categoria) values
("Amanda", "Drogasil 2", "Cosmético"),
("André", "Drogasil 1", "Medicamento"),
("Camila", "Drogasil 3", "Cosmético"),
("Danilo", "Drogasil 4", "Medicamento"),
("Felix", "Drogasil 5", "Medicamento");

insert into tb_produto (nome, preco, tamanho, validade, lote, categoria_id) values
("Base Vult", 25.99, "355g", "11/22", "F4R56", 1),
("Dipirona", 16.00, "400g", "12/23", "F3344", 3),
("Buscopan", 55.00, "999g", "12/24", "EGR3553", 5),
("Rímel Eudora", 60.00, "350g", "06/23", "HH3456", 3),
("Omeprazol", 25.50, "400g", "03/22", "GR44432", 4),
("Batom Vult", 39.90, "90g", "07/23", "BN4589", 1),
("Tylenol", 23.00, "89g", "12/23", "USHA7343", 2),
("Voltaren", 46.00, "340g", "11/22", "UHS5646", 5);

select * from tb_produto where preco > 50.00;
select * from tb_produto where preco > 3.00 and preco < 60.00;
select * from tb_produto where nome like "%B%";

select * from tb_produto
    inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id;
    
select * from tb_produto
    inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id
    where categoria like "%Cosmético%";