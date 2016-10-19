package ch08.service;

import java.sql.Connection;
import java.util.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import ch08.dao.MemberDao;
import ch08.dto.Member;

public class Exam02 {

	public static void main(String[] args) {
		MemberDao dao= new MemberDao();
		
		Member member=new Member();
		member.setMid("user7");
		member.setMname("사용자 7");
		
		member.setMage(35);  
		member.setMbirth(new Date(1996, 2, 17));
		
		dao.insert(member);
	
	}
	

}
