package com.martoncode.gymmembership.service;

import com.martoncode.gymmembership.model.Member;
import com.martoncode.gymmembership.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MemberServiceImp implements MemberService {

    @Autowired
    private MemberRepository memberRepository;

    @Override
    public Member saveMember(Member member) {
        return memberRepository.save(member);
    }

    @Override
    public List<Member> getAllMember() {
        return memberRepository.findAll();
    }

    @Override
    public void getMemberByName(String name) {
        List<Member> myList = memberRepository.findAll().stream().filter(member -> member.getName().equals(name)).collect(Collectors.toList());
        memberRepository.delete(myList.get(0));
    }
}
