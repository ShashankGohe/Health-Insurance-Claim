package com.health.claim.auth.service;

import com.health.claim.auth.dto.LoginRequest;
import com.health.claim.auth.dto.SignupRequest;

public interface AuthService {
    String registerUser(SignupRequest request);

    String loginUser(LoginRequest request);
}
