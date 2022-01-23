# DesafioApCoders
Repositório destiano ao desefio AP Coders
________________________________________________________________________________________________________________________________________________________________________________

Trata-se da implementação de um sistema de gestão de condomínios.
________________________________________________________________________________________________________________________________________________________________________________

Ferramentas utilizadas.
IDE: Netbeans 12.6.
Banco de dados: MySQL (XAMPP 8.1).
Versão do servidor: 10.4.22-MariaDB - mariadb.org binary distribution.
________________________________________________________________________________________________________________________________________________________________________________

Bibliotecas:
mysql-conector-java-8.0.27
JDK 17 (Default)
________________________________________________________________________________________________________________________________________________________________________________

Credenciais do banco de dados:
Host: Localhost.
Usuário: root.
Senha:
Nome do banco de dados: desafioap.
________________________________________________________________________________________________________________________________________________________________________________

Script para criação do banco de dados:

CREATE DATABASE desafioap;

USE desafioap;

CREATE TABLE `despesas` (
  `id` int(11) NOT NULL,
  `descricao` varchar(200) NOT NULL,
  `tipoDespesa` varchar(50) NOT NULL,
  `valor` float NOT NULL,
  `vencimentoFatura` date NOT NULL,
  `statusPAgamento` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `inquilinos` (
  `id` int(11) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `idade` int(11) NOT NULL,
  `sexo` varchar(20) NOT NULL,
  `email` varchar(50) NOT NULL,
  `telefone` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `proprietarios` (
  `ID` int(11) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `CPF_CNPJ` varchar(20) NOT NULL,
  `idade` int(11) NOT NULL,
  `sexo` varchar(20) NOT NULL,
  `imovel` int(11) NOT NULL,
  `email` varchar(50) NOT NULL,
  `telefone` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

________________________________________________________________________________________________________________________________________________________________________________
