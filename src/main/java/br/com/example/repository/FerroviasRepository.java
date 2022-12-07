/*
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.example.repository;

import br.com.example.model.Ferrovias;
import br.com.example.model.FerroviasVO;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author diego
 */
public interface FerroviasRepository extends JpaRepository<Ferrovias, Integer> {
    
    /*Cidades que contém ferrovias em um determinado Estado*/

    @Query(value = "select new br.com.example.model.FerroviasVO(m.codigo, m.nome) "
                    + "from Municipio m, Ferrovias f where within(m.geometria, (select geometria from Estado where sigla = :UF )) = true "
                    + "and contains(m.geometria, f.geometria) = true")
    List<FerroviasVO> CidadesQueContemFerroviasEmDeterminadoEstado(String UF);
    
    @Query(value = "select new br.com.example.model.FerroviasVO(fe.codigo, fe.ferrovia) from Ferrovias fe, Municipio mu, Estado es "
                    + "where within(fe.geometria, mu.geometria) = true and within(mu.geometria, es.geometria) = true "
                    + "and es.nome = :estado and mu.nome = :cidade")
    List<FerroviasVO> listarFerroviasCidade(String estado, String cidade);

}
