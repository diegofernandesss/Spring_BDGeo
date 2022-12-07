package br.com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.locationtech.jts.geom.Geometry;

@Entity
@Table(name = "aeroportos_2014")
public class Aeroportos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer gid;
    @Column(name = "objectid_1")
    private String codigo;
    @Column(name = "municdv")
    private String municdv;
    @Column(name = "uf")
    private String uf;
    @Column(name = "nome_uf")
    private String nome;
    @Column(name = "nome_regia")
    private String regiao;
    @Column(name = "municipio")
    private String municipio;
    @Column(name = "pax2010")
    private String pax2010;
    @Column(name = "internacio")
    private String internacional;    
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

    public String getMunicdv() {
        return municdv;
    }

    public void setMunicdv(String municdv) {
        this.municdv = municdv;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getPax2010() {
        return pax2010;
    }

    public void setPax2010(String pax2010) {
        this.pax2010 = pax2010;
    }

    public String getInternacional() {
        return internacional;
    }

    public void setInternacional(String internacional) {
        this.internacional = internacional;
    }

    public Geometry getGeometria() {
        return geometria;
    }

    public void setGeometria(Geometry geometria) {
        this.geometria = geometria;
    }

    @Override
    public String toString() {
        return "Aeroporto{" + "gid=" + gid + ", codigo=" + codigo + ", municdv=" + municdv + ", uf=" + uf + ", nome=" + nome + ", regiao=" + regiao + ", municipio=" + municipio + ", pax2010=" + pax2010 + ", internacional=" + internacional + ", geometria=" + geometria + '}';
    }

}