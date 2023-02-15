package com.gym.persistence.entities;

import com.gym.persistence.enums.PaymentMethod;


import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Member member;
    private LocalDate date;
    private BigDecimal amount;
    private PaymentMethod paymentMethod;
    // getters and setters
}
