package com.example.Watchstore.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.example.Watchstore.Entity.Login;
import com.example.Watchstore.Service.LoginService;

@RestController
public class LoginController {

	@Autowired
	LoginService loginservice;

	@GetMapping("/login")
	public Login login(@RequestHeader String email, @RequestHeader String password) {

		return loginservice.login(email, password);
	}

}
