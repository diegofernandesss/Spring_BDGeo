package br.com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.locationtech.jts.geom.Geometry;

@Entity
@Table(name = "br_mesorregioes_2020")
public class Mesoregiao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer gid;
    @Column(name = "cd_meso")
    private String codigo;
    @Column(name = "nm_meso")
    private String meso;
    @Column(name = "sigla_uf")
    private String uf;
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
    
    public String getMeso() {
        return meso;
    }

    public void setMeso(String meso) {
        this.meso = meso;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }


    public Geometry getGeometria() {
        return geometria;
    }

    public void setGeometria(Geometry geometria) {
        this.geometria = geometria;
    }

    @Override
    public String toString() {
        return "Mesoregiao{" + "gid=" + gid + ", codigo=" + codigo + "meso=" + meso + ", uf=" + uf + ", geometria=" + geometria + '}';
    }

}