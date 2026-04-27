package com.example.demo.model;

import java.time.LocalDateTime;
import java.util.UUID;

import com.example.demo.enums.arcoRequest.ArcoIdentityVerificationStatus;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.example.demo.enums.arcoRequest.ArcoRequestType;
import com.example.demo.enums.arcoRequest.ArcoStatus;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ArcoRequest {
    @Id
    @GeneratedValue
    private UUID id;
    @Column(name="organization_id", nullable = false)
    private UUID organizationId;
    @Column(name="data_subject_id", nullable = false)
    private UUID dataSubjectId;
  
    @Column(name ="assigned_to_user_id" , nullable = false)
    private UUID assignedToUserId;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "request_type", nullable = false)
    private ArcoRequestType requestType; //pasar a enum, LISTO
    
    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private ArcoStatus status; //pasar a enum, Listo
    
    @Column(name = "identity_verification_status", nullable = false) // enum
    private ArcoIdentityVerificationStatus identityVerificationStatus;
    
    @Column(name = "request_channel", nullable = false) // enum
    private String requestChannel;
    
    @Column(name = "submitted_at", nullable = false)
    private LocalDateTime submittedAt;
    
    @Column(name = "due_date", nullable = false)
    private LocalDateTime dueDate;
    
    @Column(name = "description", nullable = false)
    private String description;
    
    @Column(name = "resolution_summary" , nullable = false)
    private String resolutionSummary;
    
    @Column(name = "resolved_at", nullable = false)
    private LocalDateTime resolvedAt;
    
    @CreationTimestamp
    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;
    
    @UpdateTimestamp
    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt;


}
