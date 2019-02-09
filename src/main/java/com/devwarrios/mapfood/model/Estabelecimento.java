package com.devwarrios.mapfood.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;
import org.springframework.data.mongodb.core.index.GeoSpatialIndexType;
import org.springframework.data.mongodb.core.index.GeoSpatialIndexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.stereotype.Component;

import java.util.List;

@Document(collection = "estabelecimentos")
@Getter
@Setter

public class Estabelecimento {

    @Id
    private String id;

    @Field("estabelecimento_id")
    private String estabelecimentoId;

    @Field("estabelecimento")
    private String estabelecimento;

    @Field("cidade")
    private String cidade;

    @GeoSpatialIndexed(type = GeoSpatialIndexType.GEO_2DSPHERE)
    private GeoJsonPoint localizacao;

    @Field("culinaria")
    private String culinaria;

    @Field("produtos")
    private List<Produto> produtos;

    public Estabelecimento() {
    }

    public Estabelecimento(String id, String estabelecimentoId, String estabelecimento, String cidade,
                           GeoJsonPoint localizacao, String culinaria, List produtos
                           ) {
        this.estabelecimentoId = estabelecimentoId;
        this.estabelecimento = estabelecimento;
        this.cidade = cidade;
        this.localizacao = localizacao;
        this.culinaria = culinaria;
        this.produtos = produtos;
    }
}