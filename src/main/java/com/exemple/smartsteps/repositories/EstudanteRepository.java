package com.exemple.smartsteps.repositories;

import com.exemple.smartsteps.models.Estudante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EstudanteRepository extends JpaRepository<Estudante, Long> {
    Optional<Estudante> findEstudanteByidEstudante(Long id);
}