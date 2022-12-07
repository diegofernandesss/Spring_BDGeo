package br.com.example.controller;

import java.util.List;
import br.com.example.repository.MesoRegiaoRepository;
import br.com.example.model.MesoregiaoVO;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@OpenAPIDefinition(info = @Info(title = "Mesoregiao API", version = "1.0", description = "Dados da Mesoregiao"))
public class MesoregiaoController {
    
    @Autowired
    private MesoRegiaoRepository repository;
     
    @GetMapping("/listarMesoregiaoDoEstado/{nome}")
    public List<MesoregiaoVO> listarMesoregiaoDoEstado(@PathVariable String nome){
        List<MesoregiaoVO> result = repository.listarMesoregiaoDoEstado(nome);
        return result;
    }
    
    @GetMapping("/mesorregioesDoEstadoQueTemPorto/{estado}")
    public List<MesoregiaoVO> listarMesorregioesDoEstadoQueTemPorto(@PathVariable String estado){
        List<MesoregiaoVO> result = repository.listarMesorregioesDoEstadoQueTemPorto(estado);
        return result;
    }
}