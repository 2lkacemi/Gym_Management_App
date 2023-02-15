package com.gym.persistence.daos;

import com.gym.persistence.entities.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentDao extends JpaRepository<Payment, Long> {
}
