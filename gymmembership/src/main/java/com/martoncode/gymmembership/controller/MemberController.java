package com.martoncode.gymmembership.controller;

import com.martoncode.gymmembership.model.Member;
import com.martoncode.gymmembership.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/member")
public class MemberController {

    @Autowired
    private MemberService memberService;

    @PostMapping("/add")
    public String add(@RequestBody Member member) {
        memberService.saveMember(member);
        return "New member has been added!";
    }

    @GetMapping("/getAll")
    public List<Member> getAllMember() {
        return memberService.getAllMember();
    }
}
