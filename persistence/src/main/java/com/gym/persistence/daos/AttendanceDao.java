package com.gym.persistence.daos;

import com.gym.persistence.entities.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttendanceDao extends JpaRepository<Attendance, Long> {
}
