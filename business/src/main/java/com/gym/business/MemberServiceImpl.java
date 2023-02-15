package com.gym.business;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.lang.reflect.Member;
import java.util.List;

@AllArgsConstructor
@Service
public class MemberServiceImpl implements IMemberService {
    private final IMemberService iMemberService;

    @Override
    public Member save(Member member) {
        return iMemberService.save(member);
        // TODO: add uuid memberCode
    }

    @Override
    public Member update(Member member) {
        return iMemberService.update(member);
    }

    @Override
    public void delete(Long id) {
        iMemberService.delete(id);
    }

    @Override
    public Member findById(Long id) {
        return iMemberService.findById(id);
    }

    @Override
    public List<Member> findAll() {
        return iMemberService.findAll();
    }
}
