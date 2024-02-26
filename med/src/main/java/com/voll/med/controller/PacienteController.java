package com.voll.med.controller;

import com.voll.med.domain.Pacientes;
import com.voll.med.dto.PacienteDto;
import com.voll.med.repository.PacienteRepository;
import org.apache.tomcat.util.digester.ArrayStack;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    @Autowired
    PacienteRepository repository;

    @GetMapping("/listar")
    public ResponseEntity<Page<PacienteDto>> listaPacientes(@PageableDefault(page = 10) Pageable pageable){
        Page page = repository.findAll(pageable).map(PacienteDto::new);
        return ResponseEntity.ok(page);
    }

    @PostMapping("/cadastrar")
    @Transactional
    public ResponseEntity cadastrarPaciente(@RequestBody PacienteDto dto) throws URISyntaxException {
        Pacientes pacientes = repository.save(new Pacientes(dto));
        return ResponseEntity.created(new URI("http://localhost:8080/pacientes/")).body(new PacienteDto(pacientes));
    }

    @PutMapping("/atualizar")
    @Transactional

    @DeleteMapping("/{id}")
    public ResponseEntity deletarPaciente(@PathVariable Long id) {
        repository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
