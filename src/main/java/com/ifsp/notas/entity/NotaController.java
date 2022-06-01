package com.ifsp.notas.entity;

import com.ifsp.notas.exception.NotaNotFoundException;
import com.ifsp.notas.repository.NotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/nota")
public class NotaController {

    private NotaRepository repository;

    @Autowired
    public NotaController(NotaRepository repository){
        this.repository = repository;
    }

    @PostMapping
    public String create(@RequestBody Nota nota){
        this.repository.save(nota);
        return "Sucesso";
    }

    @GetMapping("/{id}")
    public Nota find(@PathVariable Long id) throws NotaNotFoundException {
        Nota nota = this.repository.findById(id).orElseThrow(() -> new NotaNotFoundException() );
        return nota;
    }
}
