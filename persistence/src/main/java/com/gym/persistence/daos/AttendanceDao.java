package com.gym.persistence.daos;

import com.gym.persistence.entities.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttendanceDao extends JpaRepository<Attendance, Long> {
}
