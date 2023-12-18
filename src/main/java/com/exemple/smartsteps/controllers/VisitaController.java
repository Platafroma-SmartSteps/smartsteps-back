package com.exemple.smartsteps.controllers;

import com.exemple.smartsteps.models.EstudanteVisita;
import com.exemple.smartsteps.models.Visita;
import com.exemple.smartsteps.repositories.EstudanteVisitaRepository;
import com.exemple.smartsteps.repositories.VisitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/visita")
public class VisitaController {
    @Autowired
    private VisitaRepository visitaRepository;

    @Autowired
    private EstudanteVisitaRepository estudanteVisitaRepository;

    @GetMapping("/list")
    public List<Visita> findAll(){
        return visitaRepository.findAll();
    }

    @GetMapping("/list/{id}")
    public Optional<Visita> listId(@PathVariable Long id){
        return visitaRepository.findById(id);
    }

    @PostMapping("/registrar")
    public String register(@RequestBody Visita visita){
        visitaRepository.save(visita);
        return "Registrado com sucesso";
    }

    @DeleteMapping("/remover/{id}")
    public String delete(@PathVariable long id){
        visitaRepository.deleteById(id);
        return "Deletado";
    }

    @PostMapping("/inscrever")
    public String inscrever(@RequestBody EstudanteVisita estudanteVisita){
        estudanteVisitaRepository.save(estudanteVisita);
        return "Inscrição realizada";
    }
}
