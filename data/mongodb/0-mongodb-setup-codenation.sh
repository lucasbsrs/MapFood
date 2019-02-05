mongoimport --authenticationDatabase admin --db codenation --username devwarrior --password mongodb --host localhost --port 27017 -c clientes --type json --file clientes.json --jsonArray
mongoimport --authenticationDatabase admin --db codenation --username devwarrior --password mongodb --host localhost --port 27017 -c estabelecimentos --type json --file estabelecimentos.json --jsonArray
mongoimport --authenticationDatabase admin --db codenation --username devwarrior --password mongodb --host localhost --port 27017 -c entregadores --type json --file entregadores.json --jsonArray

mongo codenation --authenticationDatabase admin --username devwarrior --password mongodb --host localhost --port 27017 -eval 'db.clientes.createIndex({localizacao: "2dsphere"})'
mongo codenation --authenticationDatabase admin --username devwarrior --password mongodb --host localhost --port 27017 -eval 'db.estabelecimentos.createIndex({localizacao: "2dsphere"})'
mongo codenation --authenticationDatabase admin --username devwarrior --password mongodb --host localhost --port 27017 -eval 'db.entregadores.createIndex({localizacao: "2dsphere"})'