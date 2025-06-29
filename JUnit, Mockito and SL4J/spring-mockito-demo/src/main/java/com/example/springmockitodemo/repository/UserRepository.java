package com.example.springmockitodemo.repository;

import com.example.springmockitodemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
