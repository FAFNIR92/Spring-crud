package com.example.Clinica.Repository;

import com.example.Clinica.Model.Medico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface
MedicoRepository extends JpaRepository<Medico, Long> {
}