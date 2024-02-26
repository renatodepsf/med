package com.voll.med.controller;

import com.voll.med.domain.Medicos;
import com.voll.med.domain.Pacientes;
import com.voll.med.dto.MedicoAtualizacaoDto;
import com.voll.med.dto.MedicoDto;
import com.voll.med.dto.PacienteDto;
import com.voll.med.repository.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    MedicoRepository repository;

    @GetMapping("/listar")
    public ResponseEntity<Page<MedicoDto>> listaMedicos(Pageable pageable){
        Page MedicoDto = repository.findAll(pageable).map(MedicoDto::new);
        return ResponseEntity.ok(MedicoDto);
    }

    @PostMapping("/cadastrar")
    public ResponseEntity cadastrarMedico(@RequestBody MedicoDto medicoDto){
        repository.save(new Medicos(medicoDto));
        return ResponseEntity.ok().build();
    }


    @PutMapping("/atualizar")
    @Transactional
    public ResponseEntity atualizarMedico(@RequestBody @Valid MedicoAtualizacaoDto dto) {
        Medicos medico = repository.getReferenceById(dto.getId());
        medico.atualizarInformacoes(dto);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("{id}")
    public ResponseEntity deletarMedico(@PathVariable Long id) {
        repository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
