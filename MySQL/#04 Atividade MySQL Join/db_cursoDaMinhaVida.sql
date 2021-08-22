create database db_cursoDaMinhaVida;
use db_cursoDaMinhaVida;

create table tb_categoria (
id_cat int primary key auto_increment,
nome_categoria varchar(100),
nome_subcategoria varchar(100)
);

create table tb_produto (
id_curso int primary key auto_increment,
nome varchar(255),
carga_horaria char (4),
avaliacao decimal (3,1),
preco decimal (10,2),
id_categoria int,
foreign key (id_categoria) references tb_categoria(id_cat)
);

insert into tb_categoria (nome_categoria, nome_subcategoria) values
("Programacao","PHP"),
("Front-end","Angular"),
("Data Science","Power BI"),
("DevOps","Apache Kafka"),
("Programacao","Java");

insert into tb_produto (nome, carga_horaria, avaliacao,preco,id_categoria) values
("Introducao ao PHP","6h", 9.5, 300.00, 1),
("Angular: começando com o framework","10h",8.8, 400.00, 2),
("Power BI Desktop","12h", 0.0, 500.00, 3),
("Kafka: produtores, consumidores e streams","8h", 9.3, 700.00, 4),
("Java JRE e JDK","8h", 9.5, 300.0, 5),
("Java OO","8h", 9.6, 3.00, 5),
("Java Polimorfismo","16h", 9.4, 50.00, 5),
("Java Exceções","12h", 9.5, 300.0, 5);

select * from tb_produto where preco > 50.00;

select * from tb_produto where preco >= 3.00 and preco <= 60.00;

select nome_categoria as "Nome Categoria", nome as "Curso" from tb_produto
inner join tb_categoria 
on tb_produto.id_categoria = tb_categoria.id_cat;

select * from tb_produto where nome like "%J%";









