package br.com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.locationtech.jts.geom.Geometry;

@Entity
@Table(name = "br_microrregioes_2020")
public class Microrregiao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer gid;
    @Column(name = "cd_micro")
    private String codigo;
    @Column(name = "nm_micro")
    private String micro;
    @Column(name = "sigla_uf")
    private String sigla;
    @Column(name = "geom")
    private Geometry geometria;

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMicro() {
        return micro;
    }

    public void setMicro(String micro) {
        this.micro = micro;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public Geometry getGeometria() {
        return geometria;
    }

    public void setGeometria(Geometry geometria) {
        this.geometria = geometria;
    }

    @Override
    public String toString() {
        return "Microrregiao{" + "gid=" + gid + ", codigo=" + codigo + ", micro=" + micro + ", sigla=" + sigla + ", geometria=" + geometria + '}';
    }    
}
