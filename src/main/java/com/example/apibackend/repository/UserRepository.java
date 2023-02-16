package com.example.apibackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.apibackend.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
