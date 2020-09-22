package com.example.formation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.formation.models.Account;

public interface AccountRepository extends JpaRepository<Account, Integer>{

}
