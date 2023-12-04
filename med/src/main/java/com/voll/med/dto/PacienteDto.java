package com.voll.med.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.voll.med.domain.Endereco;
import com.voll.med.domain.Pacientes;

public class PacienteDto {

    @JsonIgnore
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private String cpf;
    private Endereco endereco;

    public PacienteDto() {
    }

    public PacienteDto(Long id, String nome, String email, String telefone, String cpf, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public PacienteDto(Pacientes pacientes) {
        this.id = pacientes.getId();
        this.nome = pacientes.getNome();
        this.email = pacientes.getEmail();
        this.telefone = pacientes.getTelefone();
        this.cpf = pacientes.getCpf();
        this.endereco = pacientes.getEndereco();
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }
}
