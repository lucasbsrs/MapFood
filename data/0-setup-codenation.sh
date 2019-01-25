#!/bin/bash
set -e

psql -v ON_ERROR_STOP=1 --username "$POSTGRES_USER" <<-EOSQL
    CREATE USER devwarrior WITH SUPERUSER PASSWORD 'postgres';
    CREATE DATABASE codenation;
    GRANT ALL PRIVILEGES ON DATABASE codenation TO devwarrior;
EOSQL

psql -v ON_ERROR_STOP=1 --username devwarrior --dbname codenation <<-EOSQL
    CREATE TABLE cliente(
        id serial PRIMARY KEY,
        cliente VARCHAR(100),
        lon FLOAT,
        lat FLOAT
    );

    CREATE TABLE estabelecimento(
        id serial NOT NULL UNIQUE,
        restaurante_id VARCHAR(70) NOT NULL UNIQUE,
        restaurante VARCHAR(100),
        cidade VARCHAR(50),
        lon FLOAT,
        lat FLOAT,
        cozinha VARCHAR(100),
        PRIMARY KEY(id, restaurante_id)
    );

    CREATE TABLE entregador(
        id serial PRIMARY KEY,
        lon FLOAT,
        lat FLOAT
    );

    CREATE TABLE produto(
        id serial PRIMARY KEY,
        item VARCHAR(300),
        item_id VARCHAR(70) NOT NULL,
        restaurante_id VARCHAR(70) NOT NULL,
        restaurante VARCHAR(100),
        classificacao VARCHAR(100),
        preco NUMERIC,
        cidade VARCHAR(50)
    );
EOSQL

psql -v ON_ERROR_STOP=1 --username devwarrior --dbname codenation <<-EOSQL
    COPY cliente(cliente, lon, lat)
    FROM '/tmp/data/clientes.csv' DELIMITER ',' CSV HEADER;

    COPY estabelecimento(restaurante_id, restaurante, cidade, lon, lat, cozinha)
    FROM '/tmp/data/estabelecimentos.csv' DELIMITER ',' CSV HEADER;

    COPY entregador(id, lon, lat)
    FROM '/tmp/data/entregadores.csv' DELIMITER ',' CSV HEADER;

    COPY produto(item, item_id, restaurante_id, restaurante, classificacao, preco, cidade)
    FROM '/tmp/data/produtos.csv' DELIMITER ',' CSV HEADER;
EOSQL
