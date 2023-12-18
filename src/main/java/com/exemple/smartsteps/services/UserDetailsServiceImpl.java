package com.exemple.smartsteps.services;

import com.exemple.smartsteps.models.Estudante;
import com.exemple.smartsteps.repositories.EstudanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private EstudanteRepository estudanteRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Estudante estudante = estudanteRepository.findEstudanteByEmailEstudante(email);

        if(estudante == null) {
            throw  new UsernameNotFoundException("Usuário não existe");
        }

        return  User.builder().username(estudante.getEmailEstudante()).password(estudante.getSenhaEstudante()).roles("STUDENT").build();
    }

}
