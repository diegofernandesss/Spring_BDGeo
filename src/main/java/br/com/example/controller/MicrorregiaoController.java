package br.com.example.controller;

import java.util.List;
import br.com.example.repository.MicrorregiaoRepository;
import br.com.example.model.MicrorregiaoVO;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@OpenAPIDefinition(info = @Info(title = "Consultas API", version = "1.0", description = "Dados das Consultas"))
public class MicrorregiaoController {

    @Autowired
    private MicrorregiaoRepository repository;
    
    @GetMapping("/microrregioesDoEstado/{nome}")
    public List<MicrorregiaoVO> listarMicrorregioesDoEstado(@PathVariable String nome){
        List<MicrorregiaoVO> result = repository.listarMicrorregioesDoEstado(nome);
        return result;
    }
    
    @GetMapping("/microrregioesDeMesorregiao/{estado}/{mesorregiao}")
    public List<MicrorregiaoVO> listarMicrorregioesEmUmaMesorregiao(@PathVariable String estado, @PathVariable String mesorregiao){
        List<MicrorregiaoVO> result = repository.listarMicrorregioesEmUmaMesorregiao(estado, mesorregiao);
        return result;
    }
}
