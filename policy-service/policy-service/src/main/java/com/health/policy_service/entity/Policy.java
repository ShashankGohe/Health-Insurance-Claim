package com.health.policy_service.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name = "policies")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Policy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long policyId;

    private String policyName;

    @Column(length = 1000)
    private String description;

    private double premiumAmount;

    private int duration;  // duration in months

    @Column(length = 2000)
    private String terms;

    private String status;

    private LocalDate startDate;

    private LocalDate endDate;

    // ✅ Proper mapping to PolicyType instead of just Long ID
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "policy_type_id", nullable = false)
    private PolicyType policyType;
}
