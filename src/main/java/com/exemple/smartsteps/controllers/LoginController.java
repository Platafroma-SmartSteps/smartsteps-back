package com.exemple.smartsteps.controllers;

import java.util.List;

import com.exemple.smartsteps.models.Login;
import com.exemple.smartsteps.repositories.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin
@RestController
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	private LoginRepository login;
	
	@GetMapping("/list")
	public List<Login> findAll(){
		return login.findAll();
	}
	
	@PostMapping("/register")
	public Login UserRegister(@RequestBody Login body){
		
		var user = new Login();
		
		user.setId(body.getId());
		user.setLogin(body.getLogin());
		user.setPassword(body.getPassword());
		user.setEmail(body.getEmail());
		user.setFullName(body.getFullName());
		
		return login.save(user);
	}
}
