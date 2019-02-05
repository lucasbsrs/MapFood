FROM mongo:latest

COPY clientes.csv /tmp/data/clientes.csv
COPY estabelecimento-por-municipio.csv /tmp/data/estabelecimentos.csv
COPY motoboys.csv /tmp/data/entregadores.csv
COPY produtos-por-estabelecimento.csv /tmp/data/produtos.csv

COPY pre.sh pre.sh
RUN chmod +x pre.sh
RUN /pre.sh

COPY 0-mongodb-setup-codenation.sh /docker-entrypoint-initdb.d/
