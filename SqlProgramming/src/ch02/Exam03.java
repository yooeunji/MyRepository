package ch02;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import oracle.jdbc.OracleDriver;

public class Exam03 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.OracleDriver");
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","tester1", "kosa12345"); //sql문을 실행하기 위해 connection연결
		
		
		/*Driver OracleDriver=new OracleDriver();
		 DriverManager.registerDriver(OracleDriver);
		 Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521;orcl","tester1", "kosa12345");*/
	
		//매개변수화된 SQL문
		String sql ="select empno, ename, (sal*12+nvl(comm,0)) as yearsal from emp";
			sql+=	" where sal>? and deptno=?";
			sql+=	" order by yearsal desc"; // ?는 매개변수라 생각해, 찾고싶은거 대입하면되니까
		PreparedStatement pstmt=conn.prepareStatement(sql); //sql의 실행준비를 해서 준비가 끝난 객체 pstmt에 넘겨준다 
		pstmt.setInt(1, 400);
		pstmt.setInt(2, 30);
		
		ResultSet rs=pstmt.executeQuery();
		
		while(rs.next()){
			int empno=rs.getInt("empno"); //24라인의 순서를따른다.
			String ename=rs.getString("ename");
			int yearsal=rs.getInt("yearsal");
			System.out.println(empno+":"+ename+":"+yearsal);
		}
		
		rs.close();
		pstmt.close();
		conn.close();//연결을 붙잡고있지말고 사용다하면 끊어줘
		
	}
	

}
