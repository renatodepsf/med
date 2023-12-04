package com.voll.med.dto;

import com.voll.med.domain.Endereco;

import javax.validation.constraints.NotNull;

public class MedicoAtualizacaoDto {

    @NotNull
    private Long id;
    private String nome;
    private String telefone;
    private Endereco endereco;

    public MedicoAtualizacaoDto() {
    }

    public MedicoAtualizacaoDto(Long id, String nome, String telefone, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
