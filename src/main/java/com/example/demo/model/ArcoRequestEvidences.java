package com.example.demo.model;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
public class ArcoRequestEvidences {
    @Id
    @GeneratedValue
    private UUID id;
    
    @Column(name = "arco_request_id", nullable = false)
    private UUID arcoRequestId; 
    
    @Column(name = "uploaded_by_user_id", nullable = false)
    private UUID uploadedByUserId;

    @Column(name = "evidence_type", nullable = false) //enum
    private String evidenceType;

    @Column(name = "file_name", nullable = false)
    private String fileName;

    @Column(name = "file_url", nullable = false)
    private String fileUrl;

    @Column(name = "file_type", nullable = false) //enum
    private String fileType;

    @Column(name = "notas", nullable = false)
    private String notes;

    @UpdateTimestamp
    @Column(name = "uploaded_at", nullable = false)
    private LocalDateTime uploadedAt;
}
