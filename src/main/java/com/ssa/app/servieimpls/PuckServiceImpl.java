package com.ssa.app.servieimpls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssa.app.entities.PuckFamily;
import com.ssa.app.entities.User;
import com.ssa.app.repos.PuckFamilyRepo;
import com.ssa.app.repos.UserRepo;
import com.ssa.app.services.PuckService;

@Service
public class PuckServiceImpl implements PuckService {

	@Autowired
	PuckFamilyRepo puckFamilyRepo;
	
	@Autowired
	UserRepo userRepo;

	@Override
	public List<PuckFamily> getData() {
		return puckFamilyRepo.findAll();
	}

	@Override
	public List<User> getUsers() {
		return userRepo.findAll();

	}

}
