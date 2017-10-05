package com.guilherme.playground.convencealonso.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table
public class Endereco {

    @Id
    private Integer seq;
    @ManyToOne
    @JoinColumn(name = "SERHUMANO_ID")
    @JsonIgnore
    private SerHumano serhumanoId;
    private String rua;
    private Integer numero;
    private String bairro;
    private String cidade;
    private String estado;
    private Long cep;
    private String complemento;

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public SerHumano getSerhumanoId() {
        return serhumanoId;
    }

    public void setSerhumanoId(SerHumano serhumanoId) {
        this.serhumanoId = serhumanoId;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Long getCep() {
        return cep;
    }

    public void setCep(Long cep) {
        this.cep = cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
}
