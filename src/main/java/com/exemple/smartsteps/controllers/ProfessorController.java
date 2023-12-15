package com.exemple.smartsteps.controllers;

import java.util.List;
import java.util.Optional;


import com.exemple.smartsteps.repositories.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exemple.smartsteps.models.Professor;

@CrossOrigin
@RestController
@RequestMapping("/professor")
public class ProfessorController {
	
	@Autowired
	private ProfessorRepository profRepo;
	
	 @GetMapping("/list")
	    public List<Professor> findAllRecords(){
	        return profRepo.findAll();
	    }
	 
	 @PostMapping("/registrar")
	    public String register(@RequestBody Professor professor) {
		 profRepo.save(professor);
	        return "Registrado com sucesso";
	    }
	 
	 @DeleteMapping("/remover/{id}")
	    public String delete(@PathVariable Long id) {
		 	profRepo.deleteById(id);
	        return "Deletado";
	    }
	 
	 @PutMapping("/atualizar/{id}")
	 public String update(@PathVariable Long id, @RequestBody Professor professor) {
		 String msg;
		 
		 Optional<Professor> prof = profRepo.findById(id);
		 
		 if(prof.isPresent()) {
			 var obj = new Professor();
			 
			 obj.setCarterinhaProfessor(professor.getCarterinhaProfessor());
			 obj.setCidadeProfessor(professor.getCidadeProfessor());
			 obj.setCpfProfessor(professor.getCpfProfessor());
			 obj.setEmailProfessor(professor.getEmailProfessor());
			 obj.setEnderecoProfessor(professor.getEnderecoProfessor());
			 obj.setEstadoProfessor(professor.getEstadoProfessor());
			 obj.setIdProfessor(professor.getIdProfessor());
			 obj.setMateriaDada(professor.getMateriaDada());
			 obj.setNascimentoProfessor(professor.getNascimentoProfessor());
			 obj.setNomeProfessor(professor.getNomeProfessor());
			 obj.setRgProfessor(professor.getRgProfessor());
			 obj.setSenhaProfessor(professor.getSenhaProfessor());
			 obj.setSobrenomeProfessor(professor.getSobrenomeProfessor());
			 obj.setStatusProfessor(professor.getStatusProfessor());
			 
			 profRepo.save(obj);
			 
			 msg = "Atualizado com sucesso";
		 }else {
			 msg = "Erro ao atualizar";
		 }
		 return msg;

	 }
}
