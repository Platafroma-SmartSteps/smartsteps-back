package com.example.smartstepsback.repositories;

import com.example.smartstepsback.models.Carteirinha;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarteirinhaRepository extends JpaRepository<Carteirinha, Long> {

}
