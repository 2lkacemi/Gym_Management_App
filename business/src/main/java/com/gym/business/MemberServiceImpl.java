package com.gym.business;

import com.gym.persistence.entities.Member;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;


@AllArgsConstructor
@Service
public class MemberServiceImpl implements IMemberService {
    private final IMemberService iMemberService;

    @Override
    public Member save(Member member) {
        member.setMemberCode(UUID.randomUUID().toString());
        return iMemberService.save(member);
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
