package com.voll.med.domain;

import com.voll.med.dto.MedicoAtualizacaoDto;
import com.voll.med.dto.MedicoDto;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Entity
@EqualsAndHashCode(of = "id")
public class Medicos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    private Especialidade especialidade;
    @Embedded
    private Endereco endereco;
    private String nome;
    private String crm;
    private String telefone;
    private String email;

    public Medicos() {
    }

    public Medicos(String nome, String crm, Especialidade especialidade, Endereco endereco, String telefone, String email) {
        this.nome = nome;
        this.crm = crm;
        this.especialidade = especialidade;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }

    public Medicos(Medicos medicos) {
        this.crm = medicos.getCrm();
        this.email = medicos.getEmail();
        this.endereco = medicos.getEndereco();
        this.especialidade = medicos.getEspecialidade();
        this.nome = medicos.getNome();
        this.telefone = medicos.getTelefone();
    }

    public Medicos(MedicoDto medicoDto) {
        this.crm = medicoDto.getCrm();
        this.email = medicoDto.getEmail();
        this.endereco = medicoDto.getEndereco();
        this.especialidade = medicoDto.getEspecialidade();
        this.nome = medicoDto.getNome();
        this.telefone = medicoDto.getTelefone();
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

    public Long getId() {
        return this.id;
    }

    public void atualizarInformacoes(MedicoAtualizacaoDto dto) {
        if (dto.getNome() != null)
            this.nome = dto.getNome();
        if (dto.getTelefone() != null)
            this.telefone = dto.getTelefone();
        if (dto.getTelefone() != null)
            this.endereco.atualizarEndereco(dto.getEndereco());
    }
}
