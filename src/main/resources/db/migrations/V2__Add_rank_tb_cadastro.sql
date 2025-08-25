-- v2: Migration para adiconar a coluna de rank da tabela de cadastro

ALTER TABLE tb_cadastro
ADD COLUMN rank VARCHAR(255);