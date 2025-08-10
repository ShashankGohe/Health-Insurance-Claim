package com.health.service.repository;


import com.health.service.entity.UserEnity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEnity, Long> {
}
