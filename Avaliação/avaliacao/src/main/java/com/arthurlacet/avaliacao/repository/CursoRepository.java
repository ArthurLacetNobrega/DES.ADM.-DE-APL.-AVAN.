package com.arthurlacet.avaliacao.repository;

import com.arthurlacet.avaliacao.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CursoRepository extends JpaRepository<Curso, Long> {

}
