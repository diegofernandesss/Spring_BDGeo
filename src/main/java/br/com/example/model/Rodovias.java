package br.com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.locationtech.jts.geom.Geometry;

@Entity
@Table(name = "rodovia_2014")
public class Rodovias {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer gid;
    @Column(name = "objectid")
    private String codigo;
    @Column(name = "descseg")
    private String rodovia;
    @Column(name = "tipopnv")
    private String tipo;
    @Column(name = "codigo")
    private String codigoRodovia;    
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

    public String getRodovia() {
        return rodovia;
    }

    public void setRodovia(String rodovia) {
        this.rodovia = rodovia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCodigoRodovia() {
        return codigoRodovia;
    }

    public void setCodigoRodovia(String codigoRodovia) {
        this.codigoRodovia = codigoRodovia;
    }

    public Geometry getGeometria() {
        return geometria;
    }

    public void setGeometria(Geometry geometria) {
        this.geometria = geometria;
    }

    @Override
    public String toString() {
        return "Rodovias{" + "gid=" + gid + ", codigo=" + codigo + ", rodovia=" + rodovia + ", tipo=" + tipo + ", codigoRodovia=" + codigoRodovia + ", geometria=" + geometria + '}';
    }

   
}