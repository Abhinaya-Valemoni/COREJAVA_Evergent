package com.evergent.fitness.dao;

import com.evergent.fitness.bean.Member;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MemberDAO {
    Connection con = null;
    PreparedStatement pstmt = null;

    public int createMember(Member member) {
        try {
            con = DBConnection.getConnection();
            String query = "INSERT INTO members (id, name, age, gender, weight, height, email) VALUES (?, ?, ?, ?, ?, ?, ?)";
            pstmt = con.prepareStatement(query);
            pstmt.setInt(1, member.getMemberId());
            pstmt.setString(2, member.getName());
            pstmt.setInt(3, member.getAge());
            pstmt.setString(4, member.getGender());
            pstmt.setDouble(5, member.getWeight());
            pstmt.setDouble(6, member.getHeight());
            pstmt.setString(7, member.getEmail());

            int result = pstmt.executeUpdate();
            con.close();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public List<Member> getAllMembers() {
        List<Member> members = new ArrayList<>();
        try {
            con = DBConnection.getConnection();
            String query = "SELECT * FROM members";
            pstmt = con.prepareStatement(query);
            ResultSet rs = pstmt.executeQuery();
            
            while (rs.next()) {
                Member member = new Member();
                member.setMemberId(rs.getInt("id"));
                member.setName(rs.getString("name"));
                member.setAge(rs.getInt("age"));
                member.setGender(rs.getString("gender"));
                member.setWeight(rs.getDouble("weight"));
                member.setHeight(rs.getDouble("height"));
                member.setEmail(rs.getString("email"));
                members.add(member);
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return members;
    }
}

