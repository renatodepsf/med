package com.voll.med.controller;

import com.voll.med.domain.Medicos;
import com.voll.med.dto.MedicoAtualizacaoDto;
import com.voll.med.dto.MedicoDto;
import com.voll.med.repository.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    MedicoRepository repository;

    @GetMapping("/listar")
    public Page<MedicoDto> listaMedicos(Pageable pageable){
        return repository.findAll(pageable).map(MedicoDto::new);
    }

    @PostMapping("/cadastrar")
    public void cadastrarMedico(@RequestBody MedicoDto medicoDto){
        repository.save(new Medicos(medicoDto));
    }

    @Transactional
    @PutMapping("/atualizar")
    public void atualizarMedico(@RequestBody @Valid MedicoAtualizacaoDto dto) {
        Medicos medico = repository.getReferenceById(dto.getId());
        medico.atualizarInformacoes(dto);
    }
}
