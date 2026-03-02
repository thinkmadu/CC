-- criação das tabelas
CREATE TABLE zona(
    num_zona INT PRIMARY KEY,
    nome_zona VARCHAR(100),
    qtd_eleitores INT
);

CREATE TABLE secao(
    num_secao INT PRIMARY KEY,
    nome_secao VARCHAR(100),
    qtd_eleitores INT,
    fk_zona INT NOT NULL,
    CONSTRAINT fk_zona FOREIGN KEY(fk_zona) REFERENCES zona(num_zona)
);

CREATE TABLE votacao(
    cod_votacao INT PRIMARY KEY,
    qtd_votos INT,
    ano INT,
    UNIQUE (ano)
);

CREATE TABLE cargo(
    cod_cargo INT PRIMARY KEY,
    nome VARCHAR(100),
    ano_eleicao DATE,
    UNIQUE (ano_eleicao)
);

CREATE TABLE partido(
    num_partido INT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    data_criacao DATE
);

CREATE TABLE candidato(
    num_candidato INT PRIMARY KEY,
    nome VARCHAR(100),
    fk_cargo INT NOT NULL,
    fk_partido INT NOT NULL,
    CONSTRAINT fk_cargo FOREIGN KEY(fk_cargo) REFERENCES cargo(cod_cargo),
    CONSTRAINT fk_partido FOREIGN KEY(fk_partido) REFERENCES partido(num_partido)
);

CREATE TABLE candidato_votacao(
    num_candidato INT,
    cod_votacao INT,
    CONSTRAINT candidato_votacao_PK PRIMARY KEY (num_candidato, cod_votacao),
    CONSTRAINT fk_candidato FOREIGN KEY(num_candidato) REFERENCES candidato(num_candidato),
    CONSTRAINT fk_votacao FOREIGN KEY(cod_votacao) REFERENCES votacao(cod_votacao)
);

-- alterar a tabela zona eleitoral para que ela não tenha a quantidade de eleitores
ALTER TABLE zona
DROP COLUMN qtd_eleitores;

-- criar um índice “não-clustered” na tabela Candidato, com os atributos cod_cargo e cod_partido
CREATE INDEX idx_candidato_cod_cargo_cod_partido ON candidato (fk_cargo, fk_partido);

-- Inserir dados na tabela Zona
INSERT INTO zona (num_zona, nome_zona) VALUES 
(1, 'Zona norte'),
(2, 'Zona sul'),
(3, 'Zona leste'),
(4, 'Zona oeste');

-- Inserir dados na tabela Seção
INSERT INTO secao (num_secao, nome_secao, qtd_eleitores, fk_zona) VALUES
(1, 'Seção NA', 100, 1),
(2, 'Seção NB', 250, 1),
(3, 'Seção SA', 1000, 2),
(6, 'Seção SB', 3000, 2),
(4, 'Seção LA', 5000, 3),
(7, 'Seção LB', 20000, 3),
(5, 'Seção OA', 10000, 4),
(8, 'Seção OB', 10000, 4);

-- alterar todos os atributos nome de todas as tabelas que possuam esse atributo, faça-os que sejam obrigatórios e não nulos.
-- alterando tabela zona
ALTER TABLE zona
ADD COLUMN nome_zona_novo VARCHAR(100) NOT NULL DEFAULT '';

UPDATE zona
SET nome_zona_novo = nome_zona;

ALTER TABLE zona
DROP COLUMN nome_zona;

ALTER TABLE zona
RENAME COLUMN nome_zona_novo TO nome_zona;

-- alterando tabela secao
ALTER TABLE secao
ADD COLUMN nome_secao_novo VARCHAR(100) NOT NULL DEFAULT '';

UPDATE secao
SET nome_secao_novo = nome_secao;

ALTER TABLE secao
DROP COLUMN nome_secao;

ALTER TABLE secao
RENAME COLUMN nome_secao_novo TO nome_secao;

-- alterando tabela candidato
ALTER TABLE candidato
ADD COLUMN nome_novo VARCHAR(100) NOT NULL DEFAULT '';

UPDATE candidato
SET nome_novo = nome;

ALTER TABLE candidato
DROP COLUMN nome;

ALTER TABLE candidato
RENAME COLUMN nome_novo TO nome;

-- alterando tabela partido
ALTER TABLE partido
ADD COLUMN nome_novo VARCHAR(100) NOT NULL DEFAULT '';

UPDATE partido
SET nome_novo = nome;

ALTER TABLE partido
DROP COLUMN nome;

ALTER TABLE partido
RENAME COLUMN nome_novo TO nome;-- criação das tabelas
CREATE TABLE zona(
    num_zona INT PRIMARY KEY,
    nome_zona VARCHAR(100),
    qtd_eleitores INT
);

CREATE TABLE secao(
    num_secao INT PRIMARY KEY,
    nome_secao VARCHAR(100),
    qtd_eleitores INT,
    fk_zona INT NOT NULL,
    CONSTRAINT fk_zona FOREIGN KEY(fk_zona) REFERENCES zona(num_zona)
);

CREATE TABLE votacao(
    cod_votacao INT PRIMARY KEY,
    qtd_votos INT,
    ano INT,
    UNIQUE (ano)
);

CREATE TABLE cargo(
    cod_cargo INT PRIMARY KEY,
    nome VARCHAR(100),
    ano_eleicao DATE,
    UNIQUE (ano_eleicao)
);

CREATE TABLE partido(
    num_partido INT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    data_criacao DATE
);

CREATE TABLE candidato(
    num_candidato INT PRIMARY KEY,
    nome VARCHAR(100),
    fk_cargo INT NOT NULL,
    fk_partido INT NOT NULL,
    CONSTRAINT fk_cargo FOREIGN KEY(fk_cargo) REFERENCES cargo(cod_cargo),
    CONSTRAINT fk_partido FOREIGN KEY(fk_partido) REFERENCES partido(num_partido)
);

CREATE TABLE candidato_votacao(
    num_candidato INT,
    cod_votacao INT,
    CONSTRAINT candidato_votacao_PK PRIMARY KEY (num_candidato, cod_votacao),
    CONSTRAINT fk_candidato FOREIGN KEY(num_candidato) REFERENCES candidato(num_candidato),
    CONSTRAINT fk_votacao FOREIGN KEY(cod_votacao) REFERENCES votacao(cod_votacao)
);

-- alterar a tabela zona eleitoral para que ela não tenha a quantidade de eleitores
ALTER TABLE zona
DROP COLUMN qtd_eleitores;

-- criar um índice “não-clustered” na tabela Candidato, com os atributos cod_cargo e cod_partido
CREATE INDEX idx_candidato_cod_cargo_cod_partido ON candidato (fk_cargo, fk_partido);

-- Inserir dados na tabela Zona
INSERT INTO zona (num_zona, nome_zona) VALUES 
(1, 'Zona norte'),
(2, 'Zona sul'),
(3, 'Zona leste'),
(4, 'Zona oeste');

-- Inserir dados na tabela Seção
INSERT INTO secao (num_secao, nome_secao, qtd_eleitores, fk_zona) VALUES
(1, 'Seção NA', 100, 1),
(2, 'Seção NB', 250, 1),
(3, 'Seção SA', 1000, 2),
(6, 'Seção SB', 3000, 2),
(4, 'Seção LA', 5000, 3),
(7, 'Seção LB', 20000, 3),
(5, 'Seção OA', 10000, 4),
(8, 'Seção OB', 10000, 4);

-- alterar todos os atributos nome de todas as tabelas que possuam esse atributo, faça-os que sejam obrigatórios e não nulos.
-- alterando tabela zona
ALTER TABLE zona
ADD COLUMN nome_zona_novo VARCHAR(100) NOT NULL DEFAULT '';

UPDATE zona
SET nome_zona_novo = nome_zona;

ALTER TABLE zona
DROP COLUMN nome_zona;

ALTER TABLE zona
RENAME COLUMN nome_zona_novo TO nome_zona;

-- alterando tabela secao
ALTER TABLE secao
ADD COLUMN nome_secao_novo VARCHAR(100) NOT NULL DEFAULT '';

UPDATE secao
SET nome_secao_novo = nome_secao;

ALTER TABLE secao
DROP COLUMN nome_secao;

ALTER TABLE secao
RENAME COLUMN nome_secao_novo TO nome_secao;

-- alterando tabela candidato
ALTER TABLE candidato
ADD COLUMN nome_novo VARCHAR(100) NOT NULL DEFAULT '';

UPDATE candidato
SET nome_novo = nome;

ALTER TABLE candidato
DROP COLUMN nome;

ALTER TABLE candidato
RENAME COLUMN nome_novo TO nome;

-- alterando tabela partido
ALTER TABLE partido
ADD COLUMN nome_novo VARCHAR(100) NOT NULL DEFAULT '';

UPDATE partido
SET nome_novo = nome;

ALTER TABLE partido
DROP COLUMN nome;

ALTER TABLE partido
RENAME COLUMN nome_novo TO nome;