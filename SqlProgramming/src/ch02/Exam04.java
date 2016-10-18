package ch02;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import oracle.jdbc.OracleDriver;

public class Exam04 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.OracleDriver");
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","tester1", "kosa12345"); //sql문을 실행하기 위해 connection연결
		
		//부서명을 조건으로 해서 부서명 일부분을 입력햇을 때,
		//부서가 존재할 경우, 부서번호, 부서이름을 출력하고
		//부서가 존재하지않을경우에는 "부서가 없음"을 출력하시오
		//매개변수화된 SQL문
		
		String sql ="select deptno, dname from dept where dname like?"; // ?는 매개변수라 생각해, 찾고싶은거 대입하면되니까
		PreparedStatement pstmt=conn.prepareStatement(sql); //sql의 실행준비를 해서 준비가 끝난 객체 pstmt에 넘겨준다 
		pstmt.setString(1, "%개발%");
		ResultSet rs=pstmt.executeQuery();
		
		if(rs.next()){
			do{
			int deptno=rs.getInt("deptno"); //24라인의 순서를따른다.
			String dname=rs.getString("dname");
			System.out.println(deptno+":"+dname);
			}
			while(rs.next());
		}else{
			System.out.println("부서가 없음");
		}
		
		rs.close();
		pstmt.close();
		conn.close();//연결을 붙잡고있지말고 사용다하면 끊어줘
	}
}
