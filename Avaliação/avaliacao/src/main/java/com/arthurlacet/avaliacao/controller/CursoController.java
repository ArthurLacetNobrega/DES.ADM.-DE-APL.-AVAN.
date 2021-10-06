package com.arthurlacet.avaliacao.controller;

import com.arthurlacet.avaliacao.model.Curso;
import com.arthurlacet.avaliacao.service.CursoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/curso")
public class CursoController {

    private CursoService service;

    @GetMapping
    public List<Curso> findAll() {
        return this.service.findAll();
    }

    @PostMapping
    public void post(@RequestBody Curso curso) {
        this.service.save(curso);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        this.service.remove(id);
    }

    @PutMapping("/{id}")
    public void put(@RequestBody Curso novoCurso, @PathVariable Long id) {
        this.service.edit(novoCurso, id);
    }
}
