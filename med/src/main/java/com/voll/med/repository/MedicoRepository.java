package com.voll.med.repository;

import com.voll.med.domain.Medicos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicoRepository extends JpaRepository<Medicos, Long> {
}
