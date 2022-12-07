/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.example.repository;

import br.com.example.model.Estado;
import br.com.example.model.MunicipioVO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author diego
 */
public interface EstadoRepository extends JpaRepository<Estado, Integer>{
    
    /*Total de Municípios dentro do Estado*/
    
    @Query(value = "select count(*) from Municipio m, Estado e where within(m.geometria, e.geometria) = true and e.sigla = :UF")
    public Double totalDeMunicipiosNoEstado(String UF);
    
    /*Listagem de Municípios dentro do Estado utilizando paginação*/
    
    @Query(value = "select new br.com.example.model.MunicipioVO(mb.codigo, mb.nome) from Municipio mb, Estado e "
                    + "where within(mb.geometria, e.geometria) = true and e.nome = :nome")
    Page<MunicipioVO> listarMunicipiosDoEstado(String nome, Pageable pageable);
    
}
