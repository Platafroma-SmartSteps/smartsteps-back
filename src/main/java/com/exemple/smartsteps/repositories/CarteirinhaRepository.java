package com.exemple.smartsteps.repositories;

import com.exemple.smartsteps.models.Carteirinha;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarteirinhaRepository extends JpaRepository<Carteirinha, Long> {

}
