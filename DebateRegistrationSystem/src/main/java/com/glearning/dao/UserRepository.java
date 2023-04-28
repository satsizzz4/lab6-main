package com.glearning.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.glearning.dto.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	public User findByUsername(String username);
}
