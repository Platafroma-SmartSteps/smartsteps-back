package com.example.smartstepsback.controllers;

import com.example.smartstepsback.models.Estudante;

import com.example.smartstepsback.repositories.EstudanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/estudante")
public class EstudanteController {
    /*
       CRUD          ->  Create, Read/Retrieve, Update and Delete
       GetMapping    ->  Traz dados do banco
       RequestMapping->  Traz dados do banco
       PostMapping   ->  Envia/cria dados para o banco
       DeleteMapping ->  Apaga dados do banco
       PutMapping    ->  Atualiza dados do banco
    */

    @Autowired
    private EstudanteRepository estudanteRepository;

    @GetMapping("/")
    public List<Estudante> findAllRecords(){
        return estudanteRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Estudante> findById(@PathVariable Long id){
        return estudanteRepository.findEstudanteByidEstudante(id);
    }
}