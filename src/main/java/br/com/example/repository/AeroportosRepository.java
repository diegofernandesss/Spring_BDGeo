/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.example.repository;

import br.com.example.model.Aeroportos;
import br.com.example.model.AeroportosVO;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author diego
 */
public interface AeroportosRepository extends JpaRepository<Aeroportos, Integer>{
    
    /*Distância entre Aeroportos de acordo com os Municipios*/
    
    @Query(value = "select distance(geography(aer.geometria), geography(aero.geometria)) from Aeroportos aer, Aeroportos aero "
                    + "where aer.municipio = :municipioA and aero.municipio = :municipioB")
    public Double distanciaEntreAeroportosDeAcordoComMunicipios(String municipioA, String municipioB);
    
    /*Listagem de Municipíos que possuem Aeroportos no Estado (UF)*/
    
    @Query(value = "select new br.com.example.model.AeroportosVO(m.codigo, m.nome, m.sigla) from Municipio m, Aeroportos ae "
                   + "where within(ae.geometria, m.geometria) = true and m.sigla = :sigla")
    List<AeroportosVO> listarMunicipiosQuePossuemAeroportosNoEstado(String sigla);
    
}
