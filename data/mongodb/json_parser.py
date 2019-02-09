#!/usr/bin/env python3.6

import csv
import json
import random

from collections import defaultdict


CLIENTES_CSV = "clientes.csv"
ESTABELECIMENTOS_CSV = "estabelecimentos.csv"
ENTREGADORES_CSV = "entregadores.csv"
PRODUTOS_CSV = "produtos.csv"

CLIENTES_JSON = "clientes.json"
ESTABELECIMENTOS_JSON = "estabelecimentos.json"
ENTREGADORES_JSON = "entregadores.json"
PRODUTOS_JSON = "produtos.json"


random.seed(42)


def cliente_dict(fields):
    return (
        {
            "cliente_id": fields[0],
            "localizacao": {
                "type": "Point",
                "coordinates": [float(fields[1]), float(fields[2])]
            }
        }
    )


def estabelecimento_dict(fields, produtos):
    return (
        {
            "estabelecimento_id": fields[0],
            "estabelecimento": fields[1],
            "cidade": fields[2],
            "localizacao": {
                "type": "Point",
                "coordinates": [float(fields[3]), float(fields[4])]
            },
            "culinaria": fields[5],
            "produtos": produtos
        }
    )


def entregador_dict(fields):
    return (
        {
            "entregador_id": fields[0],
            "localizacao": {
                "type": "Point",
                "coordinates": [float(fields[1]), float(fields[2])]
            },
            "capacidade_disponivel": random.randint(3, 5)
        }
    )


def produto_dict(fields):
    return (
        {
            "descricao": fields[0],
            "produto_id": fields[1],
            "estabelecimento_id": fields[2],
            "estabelecimento": fields[3],
            "classificacao": fields[4],
            "preco_unitario": float(fields[5]),
            "cidade": fields[6]
        }
    )


def cria_json(arquivo_csv, arquivo_json, modelo):
    itens = []

    with open(arquivo_csv, "r", newline='') as f:
        reader = csv.reader(f)

        next(reader, None)

        for fields in reader:
            item = modelo(fields)

            itens.append(item)

    with open(arquivo_json, "w") as f:
        f.write(json.dumps(itens, indent=4))


def cria_estabelecimentos_json(arquivo_csv, arquivo_json, modelo, estabelecimentos_produtos):
    itens = []

    with open(arquivo_csv, "r", newline='') as f:
        reader = csv.reader(f)

        next(reader, None)

        for fields in reader:
            estabelecimento_id = fields[0]
            item = modelo(fields, estabelecimentos_produtos.get(estabelecimento_id, []))

            itens.append(item)

    with open(arquivo_json, "w", encoding="utf-8") as f:
        f.write(json.dumps(itens, indent=4, ensure_ascii=False))


def cria_dict_estabelecimento_produto(produtos_csv, modelo_produtos):
    estabelecimentos_produtos = defaultdict()

    with open(produtos_csv, "r", newline='', encoding="utf-8") as f:
        reader = csv.reader(f)

        next(reader, None)

        for fields in reader:
            item = modelo_produtos(fields)
            estabelecimento_id = item["estabelecimento_id"]

            produtos = estabelecimentos_produtos.get(estabelecimento_id, [])
            produtos.append(item)
            estabelecimentos_produtos[estabelecimento_id] = produtos

    return estabelecimentos_produtos


def main():
    cria_json(CLIENTES_CSV, CLIENTES_JSON, cliente_dict)
    cria_json(ENTREGADORES_CSV, ENTREGADORES_JSON, entregador_dict)
    estabelecimentos_produtos = cria_dict_estabelecimento_produto(PRODUTOS_CSV, produto_dict)
    cria_estabelecimentos_json(ESTABELECIMENTOS_CSV, ESTABELECIMENTOS_JSON, estabelecimento_dict, estabelecimentos_produtos)


if __name__ == "__main__":
    main()
