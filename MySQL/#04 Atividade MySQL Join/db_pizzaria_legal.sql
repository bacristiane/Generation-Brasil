create database db_pizzaria_legal;

use db_pizzaria_legal; 

create table tb_categoria (
	id int primary key auto_increment,
    nomePizzaiolo varchar (30),
    tipo varchar (30),
    adicional boolean
);

create table tb_pizza(
	id int primary key auto_increment,
	nome varchar (30),
	tamanho varchar (30),
    ingrediente varchar (30),
    preco decimal (6,2),
    borda boolean,
    categoria_id int,
    foreign key(categoria_id) references tb_categoria (id)
);

insert into tb_categoria (nomePizzaiolo, tipo, adicional) values 
("Julio Pizzaiolo", "salgado", true),
("Bá Pizzaiola", "doce", false),
("Alysan Babyzzaiolo", "salgado", false),
("Gabis Pizzazinha", "doce", true),
("Vitor Churros", "doce", false);

select * from tb_categoria;

insert into tb_pizza(nome, tamanho, ingrediente, preco, borda, categoria_id) values 
("Calabresa", "Grande", "mussarela", 39.90, true, 1),
("Brigadeiro", "Broto", "chocolate",20.00, false, 2),
("Frango com Catupiry","Média", "milho", 35.00, true, 3),
("Queijo com goiabada", "Broto", "leite condensado", 19.99, false, 4),
("Banana", "Grande", "canela", 15.99, false, 5),
("Mussarela", "Pequena", "tomate", 20.00, true, 1),
("Carne seca", "Grande", "mussarela", 65.00, true, 3),
("Nutella", "Média", "morango", 40.00, false, 5);

select * from tb_pizza where preco > 45.00;
select * from tb_pizza where preco > 29.00 and preco < 60.00;
select * from tb_pizza where nome like "%C%";

select * from tb_pizza
inner join tb_categoria on tb_categoria.id = tb_pizza.categoria_id;
    
select * from tb_pizza
inner join tb_categoria on tb_categoria.id = tb_pizza.categoria_id
where tipo like "%doce%";