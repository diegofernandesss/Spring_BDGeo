package br.com.example.controller;

import java.util.List;
import br.com.example.repository.MunicipioRepository;
import br.com.example.model.MunicipioVO;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@OpenAPIDefinition(info = @Info(title = "Municípios API", version = "1.0", description = "Dados de Municípios"))
public class MunicipioController {
    
    @Autowired
    private MunicipioRepository repository;
    
    
    @GetMapping("/municipiosDeMesorregiao/{estado}/{mesorregiao}")
     public List<MunicipioVO> listarMunicipiosDeDeterminadaMesorregiao(@PathVariable String estado, @PathVariable String mesorregiao){
        List<MunicipioVO> result = repository.listarMunicipiosDeDeterminadaMesorregiao(estado, mesorregiao);
        return result;
    }
     
    @GetMapping("/MunicipiosDeMesorregiaoQueFazemFronteiraComOutroEstado/{estadoA}/{mesorregiao}/{estadoB}")
    public List<MunicipioVO> listarMunicipiosDeDeterminadaMesorregiaoQueFazemFronteiraComOutroEstado(@PathVariable String estadoA, @PathVariable String estadoB, @PathVariable String mesorregiao){
        List<MunicipioVO> result = repository.listarMunicipiosDeDeterminadaMesorregiaoQueFazemFronteiraComOutroEstado(estadoA, mesorregiao, estadoB);
        return result;
    }
    
    @GetMapping("/municipiosDeMicrorregiao/{estado}/{microrregiao}")
    public List<MunicipioVO> listarMunicipiosDeDeterminadaMicrorregiao(@PathVariable String estado, @PathVariable String microrregiao){
        List<MunicipioVO> result = repository.listarMunicipiosDeDeterminadaMicrorregiao(estado, microrregiao);
        return result;
    }
    
    @GetMapping("/municipiosComPortoEAeroporto")
    public List<MunicipioVO> listarMunicipiosComPortoEAeroporto(){
        List<MunicipioVO> result = repository.listarMunicipiosComPortoEAeroporto();
        return result;
    }
    
    


}