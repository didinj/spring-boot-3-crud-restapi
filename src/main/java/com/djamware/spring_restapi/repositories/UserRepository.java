package com.djamware.spring_restapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.djamware.spring_restapi.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
