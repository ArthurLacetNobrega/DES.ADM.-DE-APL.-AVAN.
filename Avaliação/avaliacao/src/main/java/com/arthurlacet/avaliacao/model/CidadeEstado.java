package com.arthurlacet.avaliacao.model;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
public class CidadeEstado {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String cidade;
	private String estado;

}
