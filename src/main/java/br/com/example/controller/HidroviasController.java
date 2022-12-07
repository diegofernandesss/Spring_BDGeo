package br.com.example.controller;

import br.com.example.repository.HidroviasRepository;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import java.util.List;
import br.com.example.model.HidroviasVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@OpenAPIDefinition(info = @Info(title = "Hidrovias API", version = "1.0", description = "Dados de Hidrovias"))
public class HidroviasController {
    
    @Autowired
    private HidroviasRepository repository;
    
    @GetMapping("/riosQueTocamUmNoOutroPeloId/{gid}")
    public List<HidroviasVO> riosQueTocamUmNoOutroPeloId(@PathVariable Integer gid){
        List<HidroviasVO> result= repository.riosQueTocamUmNoOutroPeloId(gid);
        return result;
    }
}