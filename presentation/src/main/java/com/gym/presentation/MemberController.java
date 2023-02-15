package com.gym.presentation;

import com.gym.business.IMemberService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Member;
import java.util.List;

@Controller
@AllArgsConstructor
@RequestMapping("/members")
public class MemberController {

    private IMemberService memberService;

    @PostMapping("/add")
    public ResponseEntity<Member> addMember(@RequestBody Member member) {
        Member newMember = memberService.save(member);
        return new ResponseEntity<>(newMember, HttpStatus.CREATED);



    }
}
