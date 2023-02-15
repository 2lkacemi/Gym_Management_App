package com.gym.persistence.entities;


import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Attendance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private GymClass gymClass;
    @ManyToOne
    private Member member;
    private LocalDate date;
    // getters and setters
}
