
BEGIN TRANSACTION;

CREATE TABLE zona(
	num_zona INTEGER PRIMARY KEY,
	nome_zona VARCHAR(100),
	qtd_eleitores INTEGER
);

CREATE TABLE secao(
	num_secao INTEGER PRIMARY KEY,
	nome_secao VARCHAR(100),
	qtd_eleitores INTEGER,
	fk_zona INTEGER NOT NULL,
	CONSTRAINT fk_zona FOREIGN KEY(fk_zona) REFERENCES zona(num_zona)
);

CREATE TABLE votacao(
	cod_votacao INTEGER PRIMARY KEY,
	qtd_votos INTEGER,
	ano INTEGER NOT NULL UNIQUE,
	fk_secao INTEGER NOT NULL,
	FOREIGN KEY(fk_secao) REFERENCES secao(num_secao)
);

CREATE TABLE candidato(
	num_candidato INTEGER PRIMARY KEY,
	nome VARCHAR(100) NOT NULL,
	fk_votacao INTEGER NOT NULL,
	FOREIGN KEY(fk_votacao) REFERENCES votacao(cod_votacao)
);

CREATE TABLE candidato_votacao(
	num_candidato INTEGER,
	cod_votacao INTEGER,
	FOREIGN KEY(num_candidato) REFERENCES candidato(num_candidato),
	FOREIGN KEY(cod_votacao) REFERENCES votacao(cod_votacao)
);

CREATE TABLE cargo(
	cod_cargo INTEGER PRIMARY KEY,
	nome VARCHAR(100),
	ano_eleição VARCHAR(4) NOT NULL UNIQUE,
	fk_candidato INTEGER NOT NULL,
	FOREIGN KEY(fk_candidato) REFERENCES candidato(num_candidato)
);

CREATE TABLE partido(
	num_partido INTEGER PRIMARY KEY,
	nome VARCHAR(100),
	data_criacao VARCHAR (50),
	fk_candidato INTEGER NOT NULL,
	FOREIGN KEY(fk_candidato) REFERENCES candidato(num_candidato)
);

COMMIT;