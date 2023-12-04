package com.voll.med.dto;

import com.voll.med.domain.Endereco;
import com.voll.med.domain.Especialidade;
import com.voll.med.domain.Medicos;

public class MedicoDto {

    private Long id;
    private String nome;
    private String crm;
    private Especialidade especialidade;
    private Endereco endereco;
    private String telefone;
    private String email;

    public MedicoDto(Long id, String nome, String crm, Especialidade especialidade, Endereco endereco, String telefone, String email) {
        this.id = id;
        this.nome = nome;
        this.crm = crm;
        this.especialidade = especialidade;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }

    public MedicoDto() {
    }

    public MedicoDto(Medicos medicos) {
        this.id = medicos.getId();
        this.crm = medicos.getCrm();
        this.email = medicos.getEmail();
        this.endereco = medicos.getEndereco();
        this.telefone = medicos.getTelefone();
        this.especialidade = medicos.getEspecialidade();
        this.nome = medicos.getNome();
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

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public Especialidade getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
