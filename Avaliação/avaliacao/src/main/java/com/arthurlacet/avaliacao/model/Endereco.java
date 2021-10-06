package com.arthurlacet.avaliacao.model;

import lombok.Data;
import javax.persistence.*;

@Data
@Embeddable
public class Endereco {

    private String rua;
    private String cep;
    
    @ManyToOne
    @JoinColumn(name = "id_cidade_estado")
    private CidadeEstado cidadeestado;
}
