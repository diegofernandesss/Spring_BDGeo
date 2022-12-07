/*
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.example.repository;

import br.com.example.model.Rodovias;
import br.com.example.model.RodoviasVO;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author caian
 */
public interface RodoviasRepository extends JpaRepository<Rodovias, Integer>{
    
    /*Listar Rodovias que cruzam o Estado*/
    
    @Query(value = "select new br.com.example.model.RodoviasVO(r.codigo, r.rodovia) from Rodovias r, Estado e "
                   + "where crosses(r.geometria, e.geometria) = true and e.sigla = :sigla")
    List<RodoviasVO> listarRodoviasQueCruzamOEstado(String sigla);
    
    /*Listar Municipios com pavimentação, planejadas, entres outros no Municipio*/

    @Query(value = "select new br.com.example.model.RodoviasVO(r.codigo, m.nome) from Municipio m, Rodovias r "
                   + "where within(r.geometria, m.geometria) = true and r.tipo = :tipo")
    Page<RodoviasVO> municipiosComPavimentacaoEntreOutros(String tipo, Pageable pageable);
    
    
    @Query(value = "select new br.com.example.model.RodoviasVO(ro.codigo, ro.rodovia) from Rodovias ro, Microrregiao mi, Estado es "
            + "where within(ro.geometria, mi.geometria) = true and within(mi.geometria, es.geometria) = true "
            + "and es.nome = :estado and mi.micro = :microrregiao")
    List<RodoviasVO> listarRodoviasDeMicrorregiao(String estado, String microrregiao);
}
