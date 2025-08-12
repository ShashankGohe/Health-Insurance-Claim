package com.health.policy_service.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@Table(name = "policy_types")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PolicyType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long policyTypeId;

    private String typeName;    // e.g., "Health", "Life", "Travel", "Vehicle"

    private String description; // Optional description of policy type

    // ✅ Optional: Bidirectional mapping
    @OneToMany(mappedBy = "policyType", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Policy> policies;
}
