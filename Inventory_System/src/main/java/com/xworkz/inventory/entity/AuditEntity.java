package com.xworkz.inventory.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name="audit")
public class AuditEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="createdBy",nullable = false)
    private String createdBy;

    @Column(name="updatedBy")
    private String updatedBy;

    @Column(name="createdAt",nullable = false)
    private LocalDateTime createdAt;

    @Column(name="updatedAt")
    private LocalDateTime updatedAt;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="register_id",referencedColumnName="id")
    private RegisterEntity register;
}
