package br.com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.locationtech.jts.geom.Geometry;

@Entity
@Table(name = "ferrovias_2014")
public class Ferrovias {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer gid;
    @Column(name = "objectid")
    private String codigo;
    @Column(name = "ferrovia")
    private String ferrovia;
    @Column(name = "operadora")
    private String operadora;
    @Column(name = "codpnvsimp")
    private String codigoPnvSimp;   
    @Column(name = "cod_pnv")
    private String codigoPnv;
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

    public String getFerrovia() {
        return ferrovia;
    }

    public void setFerrovia(String ferrovia) {
        this.ferrovia = ferrovia;
    }

    public String getOperadora() {
        return operadora;
    }

    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }

    public String getCodigoPnvSimp() {
        return codigoPnvSimp;
    }

    public void setCodigoPnvSimp(String codigoPnvSimp) {
        this.codigoPnvSimp = codigoPnvSimp;
    }

    public String getCodigoPnv() {
        return codigoPnv;
    }

    public void setCodigoPnv(String codigoPnv) {
        this.codigoPnv = codigoPnv;
    }

    public Geometry getGeometria() {
        return geometria;
    }

    public void setGeometria(Geometry geometria) {
        this.geometria = geometria;
    }

    @Override
    public String toString() {
        return "Ferrovias{" + "gid=" + gid + ", codigo=" + codigo + ", ferrovia=" + ferrovia + ", operadora=" + operadora + ", codigoPnvSimp=" + codigoPnvSimp + ", codigoPnv=" + codigoPnv + ", geometria=" + geometria + '}';
    }

    
}
