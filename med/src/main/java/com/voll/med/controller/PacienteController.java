package com.voll.med.controller;

import com.voll.med.domain.Pacientes;
import com.voll.med.dto.PacienteDto;
import com.voll.med.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    @Autowired
    PacienteRepository repository;

    @GetMapping("/listar")
    public Page<PacienteDto> listaPacientes(@PageableDefault(page = 10, sort = {"nome"}) Pageable pageable){
        return repository.findAll(pageable).map(PacienteDto::new);
    }

    @Transactional
    @PostMapping("/cadastrar")
    public void cadastrarPaciente(@RequestBody PacienteDto dto) {
        repository.save(new Pacientes(dto));
    }
}
