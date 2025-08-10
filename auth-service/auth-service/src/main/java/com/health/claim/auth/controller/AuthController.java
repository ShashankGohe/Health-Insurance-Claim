package com.health.claim.auth.controller;

import com.health.claim.auth.dto.LoginRequest;
import com.health.claim.auth.dto.SignupRequest;
import com.health.claim.auth.service.AuthService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor

public class AuthController {

    private final AuthService authService;

    // ✅ Signup Endpoint

    // localhost:8081/api/auth/signup

    @PostMapping("/signup")
    public ResponseEntity<String> signup(@Valid @RequestBody SignupRequest request) {
        String response = authService.registerUser(request);
        return ResponseEntity.ok(response);
    }

    // ✅ Login Endpoint

    // localhost:8081/api/auth/login

    @PostMapping("/login")
    public ResponseEntity<String> login(@Valid @RequestBody LoginRequest request) {
        String jwtToken = authService.loginUser(request);
        return ResponseEntity.ok(jwtToken);
    }
}
