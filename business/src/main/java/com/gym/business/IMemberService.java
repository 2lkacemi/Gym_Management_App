package com.gym.business;


import com.gym.persistence.daos.MemberDao;
import com.gym.persistence.entities.Member;

import java.util.List;

public interface IMemberService {
    Member save(Member member);
    Member update(Member member);
    void delete(Long id);
    Member findById(Long id);
    List<Member> findAll();
}
