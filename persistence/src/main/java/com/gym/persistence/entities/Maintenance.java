package com.gym.persistence.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Maintenance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Equipment equipment;
    private LocalDate date;
    private String description;
    // getters and setters
}
