package ch02;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import oracle.jdbc.OracleDriver;

public class Exam05 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		while(true){
		Class.forName("oracle.jdbc.OracleDriver");
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr", "kosa12345"); //sql문을 실행하기 위해 connection연결
		
		
		System.out.print("검색할 이름 : ");
		Scanner scanner=new Scanner(System.in);
		String name=scanner.nextLine();
		
		
		String sql = "select first_name, employee_id from employees where lower(first_name) like ?";
		PreparedStatement pstmt=conn.prepareStatement(sql);
		pstmt.setString(1, "%"+name+"%");
		ResultSet rs=pstmt.executeQuery();
		
		while(rs.next()){
			String empName=rs.getString(1);
			String empID=rs.getString(2); //24라인의 순서를따른다.
			System.out.println(empID+":"+empName);
		}
		
		rs.close();
		pstmt.close();
		conn.close();//연결을 붙잡고있지말고 사용다하면 끊어줘
		}
	}
}
