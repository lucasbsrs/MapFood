FROM postgres

COPY clientes.csv /tmp/data/clientes.csv
COPY estabelecimento-por-municipio.csv /tmp/data/estabelecimentos.csv
COPY motoboys.csv /tmp/data/entregadores.csv
COPY produtos-por-estabelecimento.csv /tmp/data/produtos.csv

COPY 0-setup-codenation.sh /docker-entrypoint-initdb.d
