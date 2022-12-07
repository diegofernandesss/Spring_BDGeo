/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.example.repository;

import br.com.example.model.Municipio;
import br.com.example.model.MunicipioVO;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author diego
 */
public interface MunicipioRepository extends JpaRepository<Municipio, Integer>{
    
    
    @Query(value = "select new br.com.example.model.MunicipioVO(mu.codigo, mu.nome) from Municipio mu, Mesoregiao me, Estado es "
                   + "where within(mu.geometria, me.geometria) = true and within(me.geometria, es.geometria) = true and es.nome = :estado and me.meso = :mesorregiao")
    List<MunicipioVO> listarMunicipiosDeDeterminadaMesorregiao(String estado, String mesorregiao);
    
    @Query(value = "select new br.com.example.model.MunicipioVO(mu.codigo,mu.nome) from Municipio mu, Mesoregiao me, Estado es "
            + "where within(mu.geometria, me.geometria) = true and within(me.geometria, es.geometria) = true and es.nome = :estadoA and me.meso = :mesorregiao "
            + "and touches(mu.geometria, (select geometria from Estado where nome = :estadoB)) = true")
    List<MunicipioVO> listarMunicipiosDeDeterminadaMesorregiaoQueFazemFronteiraComOutroEstado(String estadoA, String mesorregiao, String estadoB);
    
    @Query(value = "select new br.com.example.model.MunicipioVO(mu.codigo, mu.nome) from Municipio mu, Microrregiao mi, Estado es "
            + "where within(mu.geometria, mi.geometria) = true and within(mi.geometria, es.geometria) = true and es.nome = :estado and mi.micro = :microrregiao")
    List<MunicipioVO> listarMunicipiosDeDeterminadaMicrorregiao(String estado, String microrregiao);
    
    @Query(value = "select new br.com.example.model.MunicipioVO(mu.codigo,mu.nome) from Municipio mu, Aeroportos ar, Porto po "
            + "where contains(mu.geometria, ar.geometria) = true and contains(mu.geometria, po.geometria) = true")
    List<MunicipioVO> listarMunicipiosComPortoEAeroporto();
    

}

