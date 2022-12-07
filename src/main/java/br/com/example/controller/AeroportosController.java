package br.com.example.controller;

import br.com.example.repository.AeroportosRepository;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import br.com.example.model.AeroportosVO;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@OpenAPIDefinition(info = @Info(title = "Todas as API's", version = "1.0", description = "Todos os Dados"))
public class AeroportosController {
    
    @Autowired
    private AeroportosRepository repository;
     
    @GetMapping("/distanciaEntreAeroportosDeAcordoComMunicipios/{municipioA}/{municipioB}")
    public Double distanciaEntreAeroportosDeAcordoComMunicipios(@PathVariable String municipioA, @PathVariable String municipioB){
        double result = repository.distanciaEntreAeroportosDeAcordoComMunicipios(municipioA, municipioB);
        return result;
    }
     
    @GetMapping("/listarMunicipiosQuePossuemAeroportosNoEstado/{sigla}")
    public List<AeroportosVO> listarMunicipiosQuePossuemAeroportosNoEstado(@PathVariable String sigla){
        List<AeroportosVO> result= repository.listarMunicipiosQuePossuemAeroportosNoEstado(sigla);
        return result;
    }
   
    
}