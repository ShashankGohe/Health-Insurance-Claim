package com.health.service.service;

import com.health.service.entity.UserEntity;

import java.util.List;

public interface UserService {
    // Example method
    void createUser(UserEntity user);

    UserEntity getUserById(Long id);

    List<UserEntity> getAllUsers();

    void updateUser(Long id, UserEntity updatedUser);

    void deleteUser(Long id);

    List<UserEntity> searchUsersByName(String name);
}
