package com.voll.med.domain;

import javax.persistence.Embeddable;

@Embeddable
public class Endereco {

    String logradouro;
    String numero;
    String complemento;
    String cidade;
    String uf;
    String cep;
    String bairro;

    public Endereco() {
    }

    public Endereco(String logradouro, String numero, String complemento, String cidade, String uf, String cep, String bairro) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.cidade = cidade;
        this.uf = uf;
        this.cep = cep;
        this.bairro = bairro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void atualizarEndereco(Endereco endereco) {
        if (endereco.getBairro() != null)
            this.bairro = endereco.getBairro();
        if (endereco.getCep() != null)
            this.cep = endereco.getCep();
        if (endereco.getCidade() != null)
            this.cidade = endereco.getCidade();
        if (endereco.getComplemento() != null)
            this.complemento = endereco.getComplemento();
        if (endereco.getLogradouro() != null)
            this.logradouro = endereco.getLogradouro();
        if (endereco.getNumero() != null)
            this.numero = endereco.getNumero();
        if (endereco.getUf() != null)
            this.uf = endereco.getUf();
    }
}
