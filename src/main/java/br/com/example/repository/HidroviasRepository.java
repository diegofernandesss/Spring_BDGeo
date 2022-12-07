/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.example.repository;

import br.com.example.model.Hidrovias;
import br.com.example.model.HidroviasVO;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author diego
 */
public interface HidroviasRepository extends JpaRepository<Hidrovias, Integer>{
    
    /*Rios que se tocam um no outro pelo ID*/
    
    @Query(value = "select new br.com.example.model.HidroviasVO(hb.objeto) from Hidrovias ha, Hidrovias hb "
                   + "where touches(ha.geometria, hb.geometria) = true and ha.gid = :gid")
    List<HidroviasVO> riosQueTocamUmNoOutroPeloId(Integer gid);
}