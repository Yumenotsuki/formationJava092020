package com.example.formation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.formation.models.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
