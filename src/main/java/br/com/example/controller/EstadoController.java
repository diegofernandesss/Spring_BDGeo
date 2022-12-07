package br.com.example.controller;


import br.com.example.model.MunicipioVO;
import br.com.example.repository.EstadoRepository;
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
@OpenAPIDefinition(info = @Info(title = "Estado API", version = "1.0", description = "Dados do Estado"))
public class EstadoController {
    
    @Autowired
    private EstadoRepository repository;
    
    @GetMapping("/totalDeMunicipiosNoEstado/{UF}")
    public Double listarMunicipiosDentroDeUmEstado(@PathVariable String UF){
        double result = repository.totalDeMunicipiosNoEstado(UF);
        return result;
    }
    
    
    @GetMapping("/listarMunicipiosDoEstado/{nome}")
    public ResponseEntity<Page<MunicipioVO>> getAll(@PathVariable String nome, @PageableDefault(page = 0, size = 10, sort = "gid", direction = Sort.Direction.ASC)Pageable pageable){
        return new ResponseEntity<>(repository.listarMunicipiosDoEstado(nome, pageable), HttpStatus.OK);
    }
    


}