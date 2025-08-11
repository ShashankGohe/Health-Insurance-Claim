package com.health.service.controller;

import com.health.service.entity.UserEntity;
import com.health.service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users") // Base URL: http://localhost:8082/api/users
public class UserController {

    @Autowired
    private UserService userService;

    // 1. Create User (Registration)
    // URL: POST http://localhost:8082/api/users/registration
    @PostMapping("/registration")
    public String createUser(@RequestBody UserEntity user) {
        userService.createUser(user);
        return "User created successfully!";
    }

    // 2. Get User by ID
    // URL: GET http://localhost:8082/api/users/{id}
    @GetMapping("/{id}")
    public UserEntity getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    // 3. Get All Users
    // URL: GET http://localhost:8082/api/users
    @GetMapping
    public List<UserEntity> getAllUsers() {
        return userService.getAllUsers();
    }

    // 4. Update User
    // URL: PUT http://localhost:8082/api/users/{id}
    @PutMapping("/{id}")
    public String updateUser(@PathVariable Long id, @RequestBody UserEntity updatedUser) {
        userService.updateUser(id, updatedUser);
        return "User updated successfully!";
    }

    // 5. Delete User
    // URL: DELETE http://localhost:8082/api/users/{id}
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return "User deleted successfully!";
    }

    // 6. Search Users by Name
    // URL: GET http://localhost:8082/api/users/search?name=John
    @GetMapping("/search")
    public List<UserEntity> searchUsersByName(@RequestParam String name) {
        return userService.searchUsersByName(name);
    }
}
