package com.evergent.fitness.service;



import com.evergent.fitness.bean.Member;
import com.evergent.fitness.dao.MemberDAO;

import java.util.List;

public class FitnessService {
    MemberDAO memberDAO = new MemberDAO();

    public int registerMember(int id, String name, int age, String gender, double weight, double height, String email) {
        Member member = new Member(id, name, age, gender, weight, height, email);
        return memberDAO.createMember(member);
    }

    public List<Member> getAllMembers() {
        return memberDAO.getAllMembers();
    }
}

