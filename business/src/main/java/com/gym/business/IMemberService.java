package com.gym.business;

import java.lang.reflect.Member;
import java.util.List;

public interface IMemberService {
    Member save(Member member);
    Member update(Member member);
    void delete(Long id);
    Member findById(Long id);
    List<Member> findAll();
}
