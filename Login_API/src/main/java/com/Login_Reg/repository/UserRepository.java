package com.Login_Reg.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Login_Reg.entity.User;

public interface UserRepository extends JpaRepository<User, String>{

	Optional<User> findByEmail(String email);
}
