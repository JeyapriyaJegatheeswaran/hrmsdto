package com.sgic.leavesystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgic.leavesystem.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
