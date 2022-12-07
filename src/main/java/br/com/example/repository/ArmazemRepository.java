/*
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.example.repository;

import br.com.example.model.Armazem;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author diego
 */
public interface ArmazemRepository extends JpaRepository<Armazem, Integer>{
   
    /*Ponto de armazém de acordo com o municipio*/
     
    @Query(value = "select astext(envelope(a.geometria)) from Armazem a where a.municipio = :municipio ")
    public String pointArmazemMunicipio(String municipio);
   
}


