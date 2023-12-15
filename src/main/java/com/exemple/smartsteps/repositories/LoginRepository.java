package com.exemple.smartsteps.repositories;

import com.exemple.smartsteps.models.Login;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepository extends JpaRepository<Login, Long> {

	Login findByLogin(String login);
}
