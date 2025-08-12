package com.health.policy_service.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name = "policy_claims")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PolicyClaim {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long claimId;

    private Long policyId;      // Policy se linked

    private Long userId;        // User jisne claim kiya (optional)

    private String claimStatus; // Pending, Approved, Rejected

    private double claimAmount;

    private LocalDate claimDate;

    private String description;  // Claim ke baare me details

}
