/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.example.repository;

import br.com.example.model.MesoregiaoVO;
import br.com.example.model.Mesoregiao;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author diego
 */
public interface MesoRegiaoRepository extends JpaRepository<Mesoregiao, Integer>{
    
    /*Listagem das Mesorregião do Estado*/
    
    @Query(value = "select new br.com.example.model.MesoregiaoVO(m.codigo, m.meso) from Mesoregiao m, Estado e "
                    + "where within(m.geometria, e.geometria) = true and e.nome = :nome")
    List<MesoregiaoVO> listarMesoregiaoDoEstado(String nome);
    
    @Query(value = "select new br.com.example.model.MesoregiaoVO(me.codigo, me.meso) from Mesoregiao me, Estado es, Porto po "
                    + "where within(me.geometria, es.geometria) = true and contains(me.geometria, po.geometria) = true and es.sigla = :estado")
    List<MesoregiaoVO> listarMesorregioesDoEstadoQueTemPorto(String estado);
    
}