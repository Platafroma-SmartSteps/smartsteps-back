package com.example.smartstepsback.controllers;

import com.example.smartstepsback.models.Carterinha;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/carterinha")
public class CarterinhaController {
    @GetMapping("/")
    public List<Carterinha> findAllRecords(){
        return
    }
}
