package com.example.smartstepsback.controllers;

import com.example.smartstepsback.models.Carteirinha;
import com.example.smartstepsback.repositories.CarteirinhaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@CrossOrigin
@RestController
@RequestMapping("/carteirinha")
public class CarteirinhaController {

    @Autowired
    CarteirinhaRepository carteirinhaRepo;

    @GetMapping("/list")
    public List<Carteirinha> findAllRecords(){
        return carteirinhaRepo.findAll();
    }

    @GetMapping("/list/{id}")
    public Optional<Carteirinha> findById(@PathVariable Long id) {
        return carteirinhaRepo.findById(id);
    }

    @PostMapping("/registrar")
    public String register(@RequestBody Carteirinha carteirinha) {
        carteirinhaRepo.save(carteirinha);
        return "Registrado com sucesso";
    }

    @DeleteMapping("/remover/{id}")
    public String delete(@PathVariable Long id) {
        carteirinhaRepo.deleteById(id);
        return "Deletado";
    }


    @PutMapping("/atualizar/{id}")
    public String update(@RequestBody Carteirinha carteirinha, @PathVariable Long id) {
        String msg;

        Optional<Carteirinha> cart = carteirinhaRepo.findById(id);

        if(cart.isPresent()) {

            Carteirinha cartei = new Carteirinha();

            cartei.setCertificadoFaculdade(carteirinha.getCertificadoFaculdade());
            cartei.setCpfCarterinha(carteirinha.getCpfCarterinha());
            cartei.setDataEmissao(carteirinha.getDataEmissao());
            cartei.setIdCarterinha(carteirinha.getIdCarterinha());
            cartei.setNomeInstituicao(carteirinha.getNomeInstituicao());
            cartei.setStatusCarteirinha(carteirinha.getStatusCarteirinha());

            carteirinhaRepo.save(cartei);
            msg = "Upload com sucesso";
        }else {
            msg = "Não encontrado";
        }
        return msg;
    }
}
