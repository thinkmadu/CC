-- Database: projetoBD
-- Criação de tabelas 

CREATE TABLE titulo_de_eleitor(
	numero_de_inscricao 	INTEGER NOT NULL,
	regiao 					VARCHAR(50),
	zona					INTEGER,
	PRIMARY KEY(numero_de_inscricao)
);


CREATE TABLE ficha_de_filiacao(
	cod_filiacao 	INTEGER  NOT NULL,
	num_partido		INTEGER UNIQUE NOT NULL,
	nome_partido 	VARCHAR(50),
	PRIMARY KEY (cod_filiacao)
);

CREATE TABLE candidato(
	cpf 	VARCHAR(11) UNIQUE NOT NULL,
	nome	VARCHAR(100),
	identidade INTEGER,
	comprovante_de_residencia BYTEA,
	certificado_de_legalidade BYTEA,
	numero_de_inscricao INTEGER NOT NULL,
	PRIMARY KEY(cpf),
	FOREIGN KEY(numero_de_inscricao) references titulo_de_eleitor(numero_de_inscricao),
	UNIQUE(certificado_de_legalidade)
);

CREATE TABLE candidatura(
	cod_candidatura		INTEGER NOT NULL,
	ano					INTEGER,
	num_partido			INTEGER NOT NULL,
	cpf					VARCHAR(11) UNIQUE NOT NULL,
	PRIMARY KEY (cod_candidatura),
	FOREIGN KEY (num_partido) references ficha_de_filiacao(num_partido),
	FOREIGN KEY (cpf) REFERENCES candidato(cpf)
);

CREATE TABLE declaracao_de_bens(
	cod_declaracao 	INTEGER NOT NULL,
	cod_candidatura INTEGER NOT NULL,
	PRIMARY KEY (cod_declaracao),
	FOREIGN KEY (cod_candidatura) REFERENCES candidatura(cod_candidatura)
);

CREATE TABLE bem(
	id_bem 			INTEGER NOT NULL,
	tipo			VARCHAR(15),
	descricao 		VARCHAR(60),
	valor			DOUBLE PRECISION,
	cod_declaracao 	INTEGER NOT NULL,
	PRIMARY KEY(id_bem),
	FOREIGN KEY(cod_declaracao) references declaracao_de_bens(cod_declaracao)
);

CREATE TABLE doacao_de_campanha(
	id_doacao		INTEGER NOT NULL,
	valor_doacao	DOUBLE PRECISION,
	data_doacao		DATE,
	hora			TIME,
	descricao		VARCHAR(60),
	cod_candidatura	INTEGER NOT NULL,
	PRIMARY KEY (id_doacao),
	FOREIGN KEY (cod_candidatura) references candidatura(cod_candidatura)
);

CREATE TABLE mandato(
	cod_mandato		INTEGER NOT NULL,
	cod_candidatura	INTEGER NOT NULL UNIQUE,
	PRIMARY KEY (cod_mandato),
	FOREIGN KEY (cod_candidatura) references candidatura(cod_candidatura)
);

CREATE TABLE doador(
	cod_doador 	INTEGER NOT NULL,
	PRIMARY KEY (cod_doador)
);


CREATE TABLE pessoa_fisica(
	cod_doador 	INTEGER NOT NULL,
	cpf			VARCHAR(11) UNIQUE NOT NULL,
	nome		VARCHAR(100),
	cep			VARCHAR(9),
	num_residencia VARCHAR(10),
	telefone	VARCHAR(13),
	PRIMARY KEY (cod_doador),
	FOREIGN KEY (cod_doador) references doador(cod_doador)
);

CREATE TABLE verba_publica(
	cod_doador		INTEGER NOT NULL,
	descricao		VARCHAR(60),
	tipo			VARCHAR(25),
	rubrica			VARCHAR(25),
	PRIMARY KEY (cod_doador),
	FOREIGN KEY (cod_doador) references doador(cod_doador)
);

CREATE TABLE gasto(
	cod_gasto		INTEGER NOT NULL,
	descricao		VARCHAR(60),
	fornecedor		VARCHAR(30),
	data_gasto		DATE,
	valor_total		DOUBLE PRECISION,
	valor_liquido	DOUBLE PRECISION,
	categoria		VARCHAR(20),
	cod_mandato		INTEGER NOT NULL,
	PRIMARY KEY (cod_gasto),
	FOREIGN KEY (cod_mandato) REFERENCES mandato(cod_mandato)
);

CREATE TABLE mandato_efetua_gasto(
	cod_mandato	INTEGER NOT NULL,
	cod_gasto	INTEGER NOT NULL,
	PRIMARY KEY (cod_mandato, cod_gasto),
	FOREIGN KEY (cod_mandato) REFERENCES mandato(cod_mandato),
	FOREIGN KEY (cod_gasto) REFERENCES gasto(cod_gasto)
);

CREATE TABLE doador_efetua_doacao(
	cod_doador	INTEGER NOT NULL,
	id_doacao	INTEGER NOT NULL,
	PRIMARY KEY (cod_doador, id_doacao),
	FOREIGN KEY (cod_doador) REFERENCES doador(cod_doador),
	FOREIGN KEY (id_doacao) REFERENCES doacao_de_campanha(id_doacao)
);

CREATE TABLE urna(
	cod_urna	INTEGER NOT NULL,
	votos		INTEGER,
	estado		VARCHAR(30),
	regiao		VARCHAR(20),
	municipio	VARCHAR(50),
	zona		INTEGER,
	PRIMARY KEY (cod_urna)
);

CREATE TABLE votacao(
	cod_votacao		INTEGER NOT NULL,
	resultado		VARCHAR(15) NOT NULL,
	situacao		VARCHAR(15) NOT NULL,
	cod_candidatura	INTEGER NOT NULL,
	PRIMARY KEY(cod_votacao),
	FOREIGN KEY(cod_candidatura) REFERENCES candidatura(cod_candidatura)
);

CREATE TABLE votacao_possui_urna(
	cod_votacao		INTEGER NOT NULL,
	cod_urna		INTEGER NOT NULL,
	ano				INTEGER,
	turno			INTEGER,
	PRIMARY KEY(cod_votacao, cod_urna),
	FOREIGN KEY(cod_votacao) REFERENCES votacao(cod_votacao),
	FOREIGN KEY(cod_urna) REFERENCES urna(cod_urna)
);
