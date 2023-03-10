package com.gym.persistence.entities;

import jakarta.persistence.*;

@Entity
public class FaceData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Member member;
    private byte[] faceEncoding;
    // getters and setters
}
