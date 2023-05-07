package com.microservice.recommendationservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservice.recommendationservice.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
