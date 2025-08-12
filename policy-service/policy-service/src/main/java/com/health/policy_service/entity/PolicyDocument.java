package com.health.policy_service.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name = "policy_documents")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PolicyDocument {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long documentId;

    private Long policyId;     // Policy se linked

    private Long userId;       // Owner user

    private String documentName;

    private String documentType;   // e.g. PDF, JPEG

    private String documentUrl;    // Location of uploaded document (could be S3 or file server)

    private LocalDate uploadDate;
}
