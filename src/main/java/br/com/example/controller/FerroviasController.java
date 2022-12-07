package br.com.example.controller;

import java.util.List;
import br.com.example.repository.FerroviasRepository;
import br.com.example.model.FerroviasVO;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@OpenAPIDefinition(info = @Info(title = "Ferrovias API", version = "1.0", description = "Dados de Ferrovias"))
public class FerroviasController {
    
    @Autowired
    private FerroviasRepository repository;
     
    @GetMapping("/CidadesQueContemFerroviasEmDeterminadoEstado/{UF}")
    public List<FerroviasVO> CidadesQueContemFerroviasEmDeterminadoEstado(@PathVariable String UF){
        List<FerroviasVO> result = repository.CidadesQueContemFerroviasEmDeterminadoEstado(UF);
        return result;
    }
    
    @GetMapping("/ferroviasDaCidade/{estado}/{cidade}")
    public List<FerroviasVO> listarFerroviasCidade(@PathVariable String estado, @PathVariable String cidade){
        List<FerroviasVO> result = repository.listarFerroviasCidade(estado, cidade);
        return result;
    }
  
}