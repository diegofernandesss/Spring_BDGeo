package br.com.example.repository;

import br.com.example.model.Porto;
import br.com.example.model.PortoVO;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PortoRepository extends JpaRepository<Porto, Integer>{

    @Query(value = "select new br.com.example.model.PortoVO(po.codigoMun, po.municipio) from Porto po, Estado es "
            + "where within(po.geometria, es.geometria) = true and es.nome = :estado")
    List<PortoVO> listarPortosDoEstado(String estado);
}
