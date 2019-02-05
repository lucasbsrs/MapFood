FROM python:latest AS builder

COPY clientes.csv /clientes.csv
COPY estabelecimento-por-municipio.csv /estabelecimentos.csv
COPY motoboys.csv /entregadores.csv
COPY produtos-por-estabelecimento.csv /produtos.csv

COPY json_parser.py /

RUN python /json_parser.py

FROM mongo:latest

COPY --from=builder /clientes.json /
COPY --from=builder /estabelecimentos.json / 
COPY --from=builder /entregadores.json /

COPY 0-mongodb-setup-codenation.sh /docker-entrypoint-initdb.d/
