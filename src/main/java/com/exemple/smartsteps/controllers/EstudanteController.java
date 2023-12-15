package com.exemple.smartsteps.controllers;

import com.exemple.smartsteps.models.Estudante;

import com.exemple.smartsteps.repositories.EstudanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/estudante")
public class EstudanteController {

    @Autowired
    private EstudanteRepository estudanteRepository;

    @GetMapping("/list")
    public List<Estudante> findAllRecords(){
        return estudanteRepository.findAll();
    }

    @GetMapping("/list/{id}")
    public Optional<Estudante> findById(@PathVariable Long id){
        return estudanteRepository.findEstudanteByidEstudante(id);
    }
    
    @PostMapping("/registrar")
    public String register(@RequestBody Estudante estudante) {
    	estudanteRepository.save(estudante);
        return "Registrado com sucesso";
    }

    @DeleteMapping("/remover/{id}")
    public String delete(@PathVariable Long id) {
    	estudanteRepository.deleteById(id);
        return "Deletado";
    }
    
    @PutMapping("/atualizar/{id}")
    public String update(@PathVariable Long id, @RequestBody Estudante EstudanteBody) {
    	String msg;
    	
    	Optional<Estudante> estudanteOp = estudanteRepository.findById(id);
    	
    	if (estudanteOp.isPresent()) {
    		var estu = new Estudante();
    		
    		estu.setCidadeEstudante(EstudanteBody.getCidadeEstudante());
    		estu.setCpfEstudante(EstudanteBody.getCpfEstudante());
    		estu.setEmailEstudante(EstudanteBody.getEmailEstudante());
    		estu.setEnderecoEstudante(EstudanteBody.getEnderecoEstudante());
    		estu.setEstadoEstudante(EstudanteBody.getEstadoEstudante());
    		estu.setNomeEstudante(EstudanteBody.getNomeEstudante());
    		estu.setSenhaEstudante(EstudanteBody.getSenhaEstudante());
    		estu.setSobrenomeEstudante(EstudanteBody.getSobrenomeEstudante());
    		estu.setStatusEstudante(EstudanteBody.getStatusEstudante());
    		
    		estudanteRepository.save(estu);
    		
    		msg = "Atualizado com sucesso";
    	}else {
    		msg = "Erro ao atualizar";
    	}
    	
    	return msg;
    }
    
}