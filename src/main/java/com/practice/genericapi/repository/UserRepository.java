package com.practice.genericapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice.genericapi.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
