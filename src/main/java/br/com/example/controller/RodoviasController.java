package br.com.example.controller;

import java.util.List;
import br.com.example.repository.RodoviasRepository;
import br.com.example.model.RodoviasVO;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


@RestController
@CrossOrigin(origins = "*")
@OpenAPIDefinition(info = @Info(title = "Rodovias API", version = "1.0", description = "Dados de Rodovias"))
public class RodoviasController {
    
    @Autowired
    private RodoviasRepository repository;
     
    @GetMapping("/listarRodoviasQueCruzamOEstado/{sigla}")
    public List<RodoviasVO> listarRodoviasQueCruzamOEstado(@PathVariable String sigla){
        List<RodoviasVO> result = repository.listarRodoviasQueCruzamOEstado(sigla);
        return result;
    }
    
    @GetMapping("/municipiosComPavimentacaoEntreOutros/{tipo}")
    public ResponseEntity<Page<RodoviasVO>> getAll(@PathVariable String tipo, @PageableDefault(page = 0, size = 10, sort = "gid", direction = Sort.Direction.ASC)Pageable pageable){
        return new ResponseEntity<>(repository.municipiosComPavimentacaoEntreOutros(tipo, pageable), HttpStatus.OK);
    }
    
    @GetMapping("/rodoviasDeMicrorregiao/{estado}/{microrregiao}")
    public List<RodoviasVO> listarRodoviasDeMicrorregiao(@PathVariable String estado, @PathVariable String microrregiao){
        List<RodoviasVO> result = repository.listarRodoviasDeMicrorregiao(estado, microrregiao);
        return result;
    }
}