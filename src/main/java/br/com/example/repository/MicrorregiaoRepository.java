package br.com.example.repository;

import br.com.example.model.Microrregiao;
import br.com.example.model.MicrorregiaoVO;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MicrorregiaoRepository extends JpaRepository<Microrregiao, Integer>{
    
    @Query(value = "select new br.com.example.model.MicrorregiaoVO(m.codigo,  m.micro) from Microrregiao m, Estado e where within(m.geometria, e.geometria) = true and e.nome = :nome")
    List<MicrorregiaoVO> listarMicrorregioesDoEstado(String nome);
    
    @Query(value = "select new br.com.example.model.MicrorregiaoVO(mi.codigo,  mi.micro) from Microrregiao mi, Mesoregiao me, Estado es "
            + "where within(mi.geometria, me.geometria) = true and within(me.geometria, es.geometria) = true "
            + "and es.nome = :estado and me.meso = :mesorregiao")
    List<MicrorregiaoVO> listarMicrorregioesEmUmaMesorregiao(String estado, String mesorregiao);

}
