package com.ssa.app.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ssa.app.entities.PuckFamily;
import com.ssa.app.entities.User;

@Service
public interface PuckService {

	List<PuckFamily> getData();

	List<User> getUsers();

}
