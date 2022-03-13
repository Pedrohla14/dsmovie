package com.devsuperior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmovie.entites.Movie;
import com.devsuperior.dsmovie.entites.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
	User findByEmail(String email);
}
