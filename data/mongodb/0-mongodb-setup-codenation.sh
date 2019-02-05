mongoimport -d codenation -c clientes --type csv --file /tmp/data/clientes.csv --headerline
mongoimport -d codenation -c estabelecimentos --type csv --file /tmp/data/estabelecimentos.csv --headerline
mongoimport -d codenation -c entregadores --type csv --file /tmp/data/entregadores.csv --headerline
mongoimport -d codenation -c produtos --type csv --file /tmp/data/produtos.csv --headerline
