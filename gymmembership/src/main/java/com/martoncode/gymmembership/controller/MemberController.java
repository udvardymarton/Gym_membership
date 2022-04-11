package com.martoncode.gymmembership.controller;

import com.martoncode.gymmembership.model.Member;
import com.martoncode.gymmembership.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
