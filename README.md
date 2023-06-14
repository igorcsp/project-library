# project-library

colocar comandos no Workbench e mudar a senha na connectionfactory conforme vc configurou que deve funcionar

create database db_library;
use db_library;

CREATE TABLE tb_usuariosA (
  id INTEGER  NOT NULL   AUTO_INCREMENT,
  cpf VARCHAR(15)  NOT NULL  ,
  nome VARCHAR(45)  NOT NULL  ,
  senha VARCHAR(10)  NOT NULL  ,
  telefone VARCHAR(11)  NOT NULL  ,
  email VARCHAR(45)  NOT NULL  ,
  endereco VARCHAR(50)  NOT NULL  ,
  complemento VARCHAR(15)  NOT NULL    ,
PRIMARY KEY(id));

INSERT INTO tb_usuariosA (cpf, nome, senha, telefone, email, endereco, complemento)
VALUES ('admin', 'admin', 'admin', 'admin', 'admin', 'admin', '');

CREATE TABLE tb_livrosDeInteresseA (
  id INTEGER  NOT NULL   AUTO_INCREMENT,
  usuario_id INTEGER  NOT NULL  ,
  titulo VARCHAR(60)  NOT NULL  ,
  autor VARCHAR(45) NOT NULL  ,
PRIMARY KEY(id),
FOREIGN KEY(usuario_id) REFERENCES tb_usuariosA(id)  
);

CREATE TABLE tb_livrosA (
  id INTEGER  NOT NULL   AUTO_INCREMENT,
  titulo VARCHAR(60)  NOT NULL  ,
  autor VARCHAR(45) NOT NULL  ,
  disponivel BIT(1)  NULL  ,
  reservado BIT(1)  NULL  ,
  emprestado_para VARCHAR(45) NOT NULL    ,
PRIMARY KEY(id));

CREATE TABLE tb_historico (
  id INTEGER  NOT NULL   AUTO_INCREMENT,
  usuario_id INTEGER  NOT NULL  ,
  titulo VARCHAR(60)  NOT NULL  ,
  autor VARCHAR(45) NOT NULL  ,
PRIMARY KEY(id),
FOREIGN KEY(usuario_id) REFERENCES tb_usuariosA(id)  
);


INSERT INTO tb_livrosA (titulo, autor, disponivel, reservado, emprestado_para)
VALUES ('UML', 'Autor UML', 1, 0, '');

INSERT INTO tb_livrosA (titulo, autor, disponivel, reservado, emprestado_para)
VALUES ('Vida', 'Autor Vida', 1, 0, '');

INSERT INTO tb_livrosA (titulo, autor, disponivel, reservado, emprestado_para)
VALUES ('Livro Legal', 'Autor Firmeza', 1, 0, '');

INSERT INTO tb_livrosA (titulo, autor, disponivel, reservado, emprestado_para)
VALUES ('Programação', 'Autor que Programa', 1, 0, '');

INSERT INTO tb_livrosA (titulo, autor, disponivel, reservado, emprestado_para)
VALUES ('ACMA - Sistema de monitoramento e inventário', 'Adriano Urbano', 1, 0, '');

INSERT INTO tb_livrosA (titulo, autor, disponivel, reservado, emprestado_para)
VALUES ('Administração de trabalhos de graduação', 'Adriana Petrin', 1, 0, '');

INSERT INTO tb_livrosA (titulo, autor, disponivel, reservado, emprestado_para)
VALUES (' Administração dos sistemas de operações', 'Francielle Cristina', 1, 0, '');

INSERT INTO tb_livrosA (titulo, autor, disponivel, reservado, emprestado_para)
VALUES ('A Flor do Lado de Lá', 'ROGER MELLO', 1, 0, '');

INSERT INTO tb_livrosA (titulo, autor, disponivel, reservado, emprestado_para)
VALUES ('Agile estimating and planning', 'COHN, Mike', 1, 0, '');

INSERT INTO tb_livrosA (titulo, autor, disponivel, reservado, emprestado_para)
VALUES ('Ainda moderno', 'Lauro Pereira', 1, 0, '');

INSERT INTO tb_livrosA (titulo, autor, disponivel, reservado, emprestado_para)
VALUES ('Visual J++ Java programming', 'FLYNN, Jeff', 1, 0, '');

INSERT INTO tb_livrosA (titulo, autor, disponivel, reservado, emprestado_para)
VALUES ('Use a cabeça', 'FREEMAN, Eric', 1, 0, '');

INSERT INTO tb_livrosA (titulo, autor, disponivel, reservado, emprestado_para)
VALUES ('Transfer', 'André Luiz', 1, 0, '');

INSERT INTO tb_livrosA (titulo, autor, disponivel, reservado, emprestado_para)
VALUES ('Técnicas de programação', 'Walter Luiz Caram', 1, 0, '');

INSERT INTO tb_livrosA (titulo, autor, disponivel, reservado, emprestado_para)
VALUES ('Soluções práticas', 'SERPA, Artur', 1, 0, '');

INSERT INTO tb_livrosA (titulo, autor, disponivel, reservado, emprestado_para)
VALUES ('Sistema livraria virtua', 'Marcos André', 1, 0, '');
