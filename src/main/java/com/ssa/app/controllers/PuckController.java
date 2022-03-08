package com.ssa.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssa.app.entities.PuckFamily;
import com.ssa.app.entities.User;
import com.ssa.app.repos.PuckDataRepo;
import com.ssa.app.services.PuckService;

@RestController
public class PuckController {

	@Autowired
	PuckService puckService;
	
	@Autowired
	PuckDataRepo puckDataRepo;
	
	@GetMapping("test")
	public String test() {
		return "working";
	}
	
	@GetMapping("getData")
	public List<PuckFamily> getData() {
		return puckService.getData();
	}
	
	@GetMapping("getUsers")
	public List<User> getUsers() {
		return puckService.getUsers();
	}
	
	@GetMapping("getPucks")
	public List<PuckData>  getPucks() {
		return puckDataRepo.doSomeQuery();
	}
}
