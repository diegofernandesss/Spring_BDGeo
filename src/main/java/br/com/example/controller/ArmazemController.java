package br.com.example.controller;


import br.com.example.repository.ArmazemRepository;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@OpenAPIDefinition(info = @Info(title = "Armazém API", version = "1.0", description = "Dados de Armazém"))
public class ArmazemController {
    
    @Autowired
    private ArmazemRepository repository;
    
    
    @GetMapping("/pointArmazemMunicipio/{municipio}")
    public String pointArmazemMunicipio(@PathVariable String municipio){
        String result = repository.pointArmazemMunicipio(municipio);
        return result;
    }
  
}