package com.martoncode.gymmembership.service;

import com.martoncode.gymmembership.model.Member;

import java.util.List;

public interface MemberService {
    Member saveMember(Member member);
    List<Member> getAllMember();
}
