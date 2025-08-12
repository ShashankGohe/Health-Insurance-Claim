package com.health.policy_service.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name = "policy_payments")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PolicyPayment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long paymentId;

    private Long policyId;      // Policy se linked

    private Long userId;        // Payment karne wala user

    private double amount;

    private LocalDate paymentDate;

    private String paymentStatus;  // e.g. Completed, Pending, Failed

    private String paymentMethod;  // e.g. Credit Card, NetBanking, UPI
}
