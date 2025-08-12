package com.health.policy_service.controller;

import com.health.policy_service.entity.Policy;
import com.health.policy_service.service.PolicyService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * REST Controller for managing policies.
 * Base URL: /api/policies
 */
@RestController
@RequestMapping("/api/policies")
public class PolicyController {

    private final PolicyService policyService;

    // Constructor injection (preferred over field injection)
    public PolicyController(PolicyService policyService) {
        this.policyService = policyService;
    }

    /**
     * Create a new policy.
     * Endpoint: POST /api/policies/create
     *
     * @param policy The policy object to create.
     * @return The created policy with HTTP status 201.
     */
    @PostMapping("/create")
    public ResponseEntity<Policy> createPolicy(@Valid @RequestBody Policy policy) {
        Policy savedPolicy = policyService.createPolicy(policy);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedPolicy);
    }
}
