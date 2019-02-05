sed -i "1s/.*/cliente_id,lon,lat/" /tmp/data/clientes.csv
sed -i "1s/.*/estabelecimento_id,estabelecimento,cidade,lon,lat,culinaria/" /tmp/data/estabelecimentos.csv
sed -i "1s/.*/entregador_id,lon,lat/" /tmp/data/entregadores.csv
sed -i "1s/.*/descricao,produto_id,estabelecimento_id,estabelecimento,classificacao,preco_unitario,cidade/" /tmp/data/produtos.csv
