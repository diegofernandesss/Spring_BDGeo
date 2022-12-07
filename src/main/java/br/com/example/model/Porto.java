package br.com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.locationtech.jts.geom.Geometry;

@Entity
@Table(name = "portos_2014")
public class Porto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer gid;
    @Column(name = "codmun")
    private String codigoMun;
    @Column(name = "objectid_1")
    private String objectId;
    @Column(name = "uf")
    private String uf;
    @Column(name = "nome_uf")
    private String nomeUf;
    @Column(name = "nome_regia")
    private String nomeRegia;
    @Column(name = "municipio")
    private String municipio;
    @Column(name = "sum_total")
    private String sumTotal;
    @Column(name = "geom")
    private Geometry geometria;

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getCodigoMun() {
        return codigoMun;
    }

    public void setCodigoMun(String codigoMun) {
        this.codigoMun = codigoMun;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }
    
    public String getTNomeUf() {
        return nomeUf;
    }

    public void setNomeUf(String nomeUf) {
        this.nomeUf = nomeUf;
    }
    
    public String getTNomeRegia() {
        return nomeRegia;
    }

    public void setNomeRefia(String nomeRegia) {
        this.nomeRegia = nomeRegia;
    }
    
    public String getTMunicipo() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }
    
    public String getTSumTotal() {
        return sumTotal;
    }

    public void setSumTotal(String sumTotal) {
        this.sumTotal = sumTotal;
    }

    public Geometry getGeometria() {
        return geometria;
    }

    public void setGeometria(Geometry geometria) {
        this.geometria = geometria;
    }

    @Override
    public String toString() {
        return "Municipio{" + "gid=" + gid + ", codigoMun=" + codigoMun + ", uf=" + uf + ", objectId=" + objectId + ", nomeUf=" + nomeUf + 
                ", nomeRegia=" + nomeRegia + ", municipio=" + municipio + ", sumTotal=" + sumTotal + ", geometria=" + geometria + '}';
    }    
}
