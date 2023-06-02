# project-library

colocar comandos no Workbench e mudar a senha na connectionfactory conforme vc configurou que deve funcionar

CREATE DATABASE db_mylibrary;

USE db_mylibrary;

CREATE TABLE tb_usuarios (
  id INTEGER  NOT NULL   AUTO_INCREMENT,
  cpf VARCHAR(15)  NOT NULL  ,
  nome VARCHAR(45)  NOT NULL  ,
  senha VARCHAR(10)  NOT NULL  ,
  telefone VARCHAR(11)  NOT NULL  ,
  email VARCHAR(45)  NOT NULL  ,
  endereco VARCHAR(50)  NOT NULL  ,
  complemento VARCHAR(15) NOT NULL  ,
  PRIMARY KEY(id));

INSERT INTO tb_usuarios (cpf, nome, senha, telefone, email, endereco, complemento)
VALUES ('admin', 'admin', 'admin', 'admin', 'admin', 'admin', '');

INSERT INTO tb_usuarios (cpf, nome, senha, telefone, email, endereco, complemento)
VALUES ('46474042850', 'Igor Pereira', 'senhateste', '11985212161', 'igor@email.com', 'Rua Inacio, 1000', 'ap 112');

CREATE TABLE tb_livros (
  id INTEGER  NOT NULL   AUTO_INCREMENT,
  titulo VARCHAR(45)  NOT NULL  ,
  autor VARCHAR(45)  NOT NULL  ,
  disponivel BIT(1)  NOT NULL  ,
  reservado BIT(1)  NOT NULL    ,
  emprestado_para VARCHAR(45) NOT NULL  ,
PRIMARY KEY(id));

INSERT INTO tb_livros (titulo, autor, disponivel, reservado, emprestado_para)
VALUES ('UML', 'Autor UML', 1, 0, '');

INSERT INTO tb_livros (titulo, autor, disponivel, reservado, emprestado_para)
VALUES ('Vida', 'Autor Vida', 1, 0, '');

INSERT INTO tb_livros (titulo, autor, disponivel, reservado, emprestado_para)
VALUES ('Livro Legal', 'Autor Firmeza', 1, 0, '');

INSERT INTO tb_livros (titulo, autor, disponivel, reservado, emprestado_para)
VALUES ('Programação', 'Autor que Programa', 1, 0, '');
