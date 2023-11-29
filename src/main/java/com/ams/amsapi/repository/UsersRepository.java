package com.ams.amsapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ams.amsapi.model.Users;

public interface UsersRepository extends JpaRepository<Users, Long> {
	Users findByUsername(String username);
}
