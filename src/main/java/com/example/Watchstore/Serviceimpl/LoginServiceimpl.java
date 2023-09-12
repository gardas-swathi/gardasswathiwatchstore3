package com.example.Watchstore.Serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Watchstore.Entity.Login;
import com.example.Watchstore.Exception.ResourceNotFoundException;
import com.example.Watchstore.Repository.LoginRepo;
import com.example.Watchstore.Service.LoginService;

@Service
public class LoginServiceimpl implements LoginService{

	@Autowired
	LoginRepo loginrepo;
	@Override
	public Login login(String email, String password) {
		// TODO Auto-generated method stub
		Login s = loginrepo.findByEmail(email);

		if (s != null) {
			if (s.getPassword().equals(password)) {
				return s;
			} else {
				throw new ResourceNotFoundException();
			}
		} else {
			throw new ResourceNotFoundException();
		}

	}

}
