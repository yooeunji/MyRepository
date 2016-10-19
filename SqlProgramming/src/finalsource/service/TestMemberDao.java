package finalsource.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import finalsource.dao.MemberDao;
import finalsource.dto.Member;

public class TestMemberDao {

	public static void main(String[] args) {
		testInsert();
		testSelectByMid();
		testSelectByMname();
		testUpdate();
		testDeleteByMid();
		
	}

	private static void testDeleteByMid() {
		Connection conn=null;
		try{
			Class.forName("oracle.jdbc.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "tester1", "kosa12345");	
			MemberDao dao=new MemberDao();
			dao.setConn(conn);
			
			int rowNo=dao.deleteByMid("user10");
			System.out.println(rowNo+"개 행이 삭제됨");
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{conn.close();} catch(SQLException e){}
		}
		
	}

	private static void testUpdate() {
		Connection conn=null;
		try{
			Class.forName("oracle.jdbc.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "tester1", "kosa12345");	
			MemberDao dao=new MemberDao();
			dao.setConn(conn);
			
			Member member=new Member();
			member.setMid("user10");
			member.setMname("홍길동");
			member.setMage(32);
			member.setMbirth(new Date());
			
			int rowNo=dao.update(member);
			System.out.println(rowNo+"개 행이 수정됨");
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{conn.close();} catch(SQLException e){}
		}
		
	}

	private static void testSelectByMname() {
		Connection conn=null;
		try{
			Class.forName("oracle.jdbc.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "tester1", "kosa12345");	
			MemberDao dao=new MemberDao();
			dao.setConn(conn);
			
			List<Member> list=dao.selectByMname("사용자");
			
			for(Member member : list){
				System.out.print(member.getMid()+"|");
				System.out.print(member.getMname()+"|");
				System.out.print(member.getMage()+"|");
				System.out.println(member.getMbirth()+"|");
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{conn.close();} catch(SQLException e){}
		}
		
	}

	private static void testSelectByMid() {
		Connection conn = null;
	      try {
	         Class.forName("oracle.jdbc.OracleDriver");
	         conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "tester1", "kosa12345");

	         MemberDao dao = new MemberDao();
	         dao.setConn(conn);
	         
	         Member member = dao.selectByMid("user10");
	         if ( member != null ) {
	            System.out.print(member.getMid()+ " | " );
	            System.out.print(member.getMname()+ " | " );
	            System.out.print(member.getMage()+ " | " );
	            System.out.print(member.getMbirth()+ " | " );
	            System.out.println();
	         }
	      } catch (Exception e) {
	         e.printStackTrace();
	      } finally {
	         try { conn.close(); } catch (SQLException e) { }
	      }
	}

	
	
	
	private static void testInsert() {
		Connection conn=null;
		try{
			Class.forName("oracle.jdbc.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "tester1", "kosa12345");	
			MemberDao dao=new MemberDao();
			dao.setConn(conn);
			
			Member member=new Member();
			member.setMid("user10");
			member.setMname("사용자10");
			member.setMage(26);
			member.setMbirth(new Date());
			
			int rowNo=dao.insert(member);
			System.out.println(rowNo+"개 행이 저장됨");
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{conn.close();} catch(SQLException e){}
		}
	}

}
