package com.arthurlacet.avaliacao.model;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
}
