package com.gym.persistence.daos;

import com.gym.persistence.entities.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberDao extends JpaRepository<Member, Long> {
}
