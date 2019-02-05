mongoimport -d codenation -c clientes --type csv --file /tmp/data/clientes.csv --headerline
mongoimport -d codenation -c estabelecimentos --type csv --file /tmp/data/estabelecimentos.csv --headerline
mongoimport -d codenation -c entregadores --type csv --file /tmp/data/entregadores.csv --headerline
mongoimport -d codenation -c produtos --type csv --file /tmp/data/produtos.csv --headerline

mongoimport --authenticationDatabase admin --db codenation --username devwarrior --password mongodb --host localhost --port 27017 -c clientesjson --type json --file clientes.json
