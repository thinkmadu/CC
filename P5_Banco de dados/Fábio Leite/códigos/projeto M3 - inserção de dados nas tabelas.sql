-- Inserindo dados fictícios na tabela titulo_de_eleitor
INSERT INTO titulo_de_eleitor (numero_de_inscricao, regiao, zona) VALUES
(12345678, 'Sul', 101),
(23456789, 'Norte', 102),
(34567891, 'Leste', 103); -- Alterado para evitar duplicação

-- Inserindo dados fictícios na tabela ficha_de_filiacao
INSERT INTO ficha_de_filiacao (cod_filiacao, num_partido, nome_partido) VALUES
(1, 45, 'Partido Natureba'),
(2, 23, 'Partido Barbatanas'),
(3, 11, 'Partido Cupim');

-- Inserindo dados fictícios na tabela candidato
INSERT INTO candidato (cpf, nome, identidade, comprovante_de_residencia, certificado_de_legalidade, numero_de_inscricao) VALUES
('12345678901', 'Maria Silva', 1234567, '0xDEADBEEF', '0xCAFEBABE01', 12345678),
('23456789012', 'Lívia Nascimento', 2345678, '0xDEADBEEF', '0xCAFEBABE02', 23456789),
('34567890123', 'Mel Brito', 3456789, '0xDEADBEEF', '0xCAFEBABE03', 34567891); -- Alterado para corresponder ao novo numero_de_inscricao

-- Inserindo dados fictícios na tabela candidatura
INSERT INTO candidatura (cod_candidatura, ano, num_partido, cpf) VALUES
(1, 2024, 45, '12345678901'),
(2, 2024, 23, '23456789012'),
(3, 2024, 11, '34567890123');

-- Inserindo dados fictícios na tabela declaracao_de_bens
INSERT INTO declaracao_de_bens (cod_declaracao, cod_candidatura) VALUES
(1, 1),
(2, 2),
(3, 3);

-- Inserindo dados fictícios na tabela bem
INSERT INTO bem (id_bem, tipo, descricao, valor, cod_declaracao) VALUES
(1, 'Imóvel', 'Apartamento', 500000.00, 1),
(2, 'Veículo', 'Troller T4 2021', 30000.00, 2),
(3, 'Terreno', 'Terreno na cidade', 200000.00, 3);

-- Inserindo dados fictícios na tabela doacao_de_campanha
INSERT INTO doacao_de_campanha (id_doacao, valor_doacao, data_doacao, hora, descricao, cod_candidatura) VALUES
(1, 10000.00, '2024-05-01', '12:30:00', 'Doação de campanha', 1),
(2, 20000.00, '2024-06-15', '14:00:00', 'Doação de campanha', 2),
(3, 15000.00, '2024-07-10', '09:45:00', 'Doação de campanha', 3);

-- Inserindo dados fictícios na tabela mandato
INSERT INTO mandato (cod_mandato, cod_candidatura) VALUES
(1, 1),
(2, 2),
(3, 3);

-- Inserindo dados fictícios na tabela doador
INSERT INTO doador (cod_doador) VALUES
(1),
(2),
(3);

-- Inserindo dados fictícios na tabela pessoa_fisica
INSERT INTO pessoa_fisica (cod_doador, cpf, nome, cep, num_residencia, telefone) VALUES
(1, '98765432100', 'Marcus Rogério', '12345-678', '100', '11987654321'),
(2, '87654321009', 'Joana Dark', '98765-432', '200', '11876543210'),
(3, '76543210987', 'Johnatan Rodrigues', '54321-987', '300', '11765432109');

-- Inserindo dados fictícios na tabela verba_publica
INSERT INTO verba_publica (cod_doador, descricao, tipo, rubrica) VALUES
(1, 'Verba de Campanha', 'Federal', '100200'),
(2, 'Fundo Partidário', 'Estadual', '200300'),
(3, 'Verba de Projeto', 'Municipal', '300400');

-- Inserindo dados fictícios na tabela gasto
INSERT INTO gasto (cod_gasto, descricao, fornecedor, data_gasto, valor_total, valor_liquido, categoria, cod_mandato) VALUES
(1, 'Material de Campanha', 'Fornecedor A', '2024-05-05', 5000.00, 4500.00, 'Marketing', 1),
(2, 'Aluguel de Espaço', 'Fornecedor B', '2024-06-10', 3000.00, 2800.00, 'Logística', 2),
(3, 'Produção de Vídeo', 'Fornecedor C', '2024-07-15', 7000.00, 6500.00, 'Mídia', 3);

-- Inserindo dados fictícios na tabela mandato_efetua_gasto
INSERT INTO mandato_efetua_gasto (cod_mandato, cod_gasto) VALUES
(1, 1),
(2, 2),
(3, 3);

-- Inserindo dados fictícios na tabela doador_efetua_doacao
INSERT INTO doador_efetua_doacao (cod_doador, id_doacao) VALUES
(1, 1),
(2, 2),
(3, 3);

-- Inserindo dados fictícios na tabela urna
INSERT INTO urna (cod_urna, votos, estado, regiao, municipio, zona) VALUES
(1, 1000, 'PB', 'Nordeste', 'João Pessoa', 101),
(2, 1500, 'CE', 'Nordeste', 'Fortaleza', 102),
(3, 1200, 'MG', 'Sudeste', 'Belo Horizonte', 103);

-- Inserindo dados fictícios na tabela votacao
INSERT INTO votacao (cod_votacao, resultado, situacao, cod_candidatura) VALUES
(1, 'Eleito', 'Ativo', 1),
(2, 'Não Eleito', 'Inativo', 2),
(3, 'Eleito', 'Ativo', 3);

-- Inserindo dados fictícios na tabela votacao_possui_urna
INSERT INTO votacao_possui_urna (cod_votacao, cod_urna, ano, turno) VALUES
(1, 1, 2024, 1),
(2, 2, 2024, 1),
(3, 3, 2024, 1);
