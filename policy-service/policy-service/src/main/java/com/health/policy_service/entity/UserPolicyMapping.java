package com.health.policy_service.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name = "user_policy_mapping")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserPolicyMapping {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userPolicyId;

    private Long userId;      // Reference to user (from user-service)

    private Long policyId;    // Reference to policy

    private LocalDate assignedDate;

    private LocalDate expiryDate;

    private String status;    // Active, Expired, Cancelled, etc.
}
