package br.com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.locationtech.jts.geom.Geometry;

@Entity
@Table(name = "hidrovias_linha_2014")
public class Hidrovias {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer gid;
    @Column(name = "objectid_1")
    private Integer objeto;
    @Column(name = "geom")
    private Geometry geometria;

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public Integer getObjeto() {
        return objeto;
    }

    public void setObjeto(Integer objeto) {
        this.objeto = objeto;
    }

    public Geometry getGeometria() {
        return geometria;
    }

    public void setGeometria(Geometry geometria) {
        this.geometria = geometria;
    }

    @Override
    public String toString() {
        return "Hidrovias{" + "gid=" + gid + ", objeto=" + objeto +", geometria=" + geometria + '}';
    }  
}
