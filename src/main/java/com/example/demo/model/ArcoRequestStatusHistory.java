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
public class ArcoRequestStatusHistory {
    @Id
    @GeneratedValue
    private UUID id;

    @Column(name = "arco_request_id", nullable = false)
    private UUID arcoRequestId;

    @Column(name = "change_by_user_id", nullable = false)
    private UUID changeByUserId;

    @Column(name="previous_status",nullable= false) //enum
    private String previousStatus;

    @Column(name="new_status",nullable= false) //enum
    private String newStatus;

    @UpdateTimestamp
    @Column(name="change_at",nullable= false)
    private LocalDateTime changeAt;

    @Column(name="comment",nullable= false)
    private String comment;
}
