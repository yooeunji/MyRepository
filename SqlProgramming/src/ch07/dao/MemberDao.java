package ch07.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ch07.dto.Member;

public class MemberDao {

	public Member selectByMid(String mid) {
		Member member=new Member();
		Connection conn=null;
		
		try{
			Class.forName("oracle.jdbc.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","tester1", "kosa12345"); //sql문을 실행하기 위해 connection연결
			String sql = "select * from member where mid=?";
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, mid);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()){
				member.setMname(rs.getString("mname"));
				member.setMage(rs.getInt("mage"));
				member.setMbirth(rs.getDate("mbirth"));
				member.setMid(rs.getString("mid"));
			}
			rs.close();
			pstmt.close();
			conn.close();
						
		}catch(Exception e){
			try{conn.close();}catch(SQLException e2){}
			e.printStackTrace();
		}
		return member;
	}

	public List<Member> selectAll() {
		List<Member> list=new ArrayList<>();
		Connection conn=null;
		try{
			Class.forName("oracle.jdbc.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","tester1", "kosa12345");
			String sql = "select * from member";
			PreparedStatement pstmt=conn.prepareStatement(sql);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()){
				Member member=new Member();
				member.setMname(rs.getString("mname"));
				member.setMage(rs.getInt("mage"));
				member.setMbirth(rs.getDate("mbirth"));
				member.setMid(rs.getString("mid"));
			
				list.add(member);
			}
			rs.close();
			pstmt.close();
			conn.close();
		}catch(Exception e){
			try{conn.close();}catch(SQLException e2){}
			e.printStackTrace();
		}
		return list;
	}
}
