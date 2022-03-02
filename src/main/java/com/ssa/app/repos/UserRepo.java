package com.ssa.app.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ssa.app.entities.User;

public interface UserRepo extends JpaRepository<User, Long> {

}
