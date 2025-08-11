package com.health.service.service;

import com.health.service.entity.UserEntity;
import com.health.service.repository.UserRepository;
import com.health.service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void createUser(UserEntity user) {
        userRepository.save(user);
    }

    @Override
    public UserEntity getUserById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found with ID: " + id));
    }

    @Override
    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public void updateUser(Long id, UserEntity updatedUser) {

    }

    @Override
    public void deleteUser(Long id) {

    }

    @Override
    public List<UserEntity> searchUsersByName(String name) {
        return List.of();
    }
}
