package ch03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Exam06 {

	public static void main(String[] args) {
		Employee emp=getEmployee(1001); //1001에 해당하는 사원의 객체를 employee객체로 받자
		System.out.println(emp.getEmpno()+":"+emp.getEname()+":"+emp.getSal());
     	List<Department> result=getDepartment("개발");  
		for(Department dept : result){
			System.out.println(dept.getDeptno()+":"+dept.getDname()+":"+dept.getLoc());
		}
	}
	
	private static List<Department> getDepartment(String searchDname) {
		List<Department> list=new ArrayList<>();
		Connection conn=null;
		try{
			Class.forName("oracle.jdbc.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","tester1", "kosa12345"); //sql문을 실행하기 위해 connection연결
			String sql = "select * from dept where dname like ?";
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, "%"+searchDname+"%");
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()){
				Department dep=new Department();
				dep.setDeptno(rs.getInt("deptno"));
				dep.setDname(rs.getString("dname"));
				dep.setLoc(rs.getString("loc"));

				list.add(dep);
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
		

	private static Employee getEmployee(int searchEmpno) {
		Employee emp=new Employee();
		Connection conn=null;
		try{
			Class.forName("oracle.jdbc.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","tester1", "kosa12345"); //sql문을 실행하기 위해 connection연결
			String sql = "select * from emp where empno=?";
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, searchEmpno);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()){
				emp.setEmpno(rs.getInt("empno"));
				emp.setEname(rs.getString("ename"));
				emp.setJob(rs.getString("job"));
				emp.setMgr(rs.getInt("Mgr"));
				emp.setHiredate(rs.getDate("hiredate"));
				emp.setSal(rs.getDouble("sal"));
				emp.setDeptno(rs.getInt("deptno"));
				emp.setComm(rs.getInt("comm"));	
			}
			rs.close();
			pstmt.close();
			conn.close();
						
		}catch(Exception e){
			try{conn.close();}catch(SQLException e2){}
			e.printStackTrace();
		}
		return emp;
	}
	
}
