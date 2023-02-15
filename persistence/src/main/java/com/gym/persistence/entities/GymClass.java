package com.gym.persistence.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class GymClass {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String schedule;
    private int capacity;
    @ManyToOne
    private Staff instructor;
    @OneToMany(mappedBy = "gymClass")
    private List<Attendance> attendances;
    // getters and setters
}
