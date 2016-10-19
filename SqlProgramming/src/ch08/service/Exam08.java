package ch08.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import ch08.dao.AccountDao;
import ch08.dto.Account;

public class Exam08 {

	public static void main(String[] args) {
		Connection conn=null;
		try{
			Class.forName("oracle.jdbc.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "tester1", "kosa12345");
			
			conn.setAutoCommit(false);  //이게 들어가면 커밋을 내가 직접하겠다. 트랜잭션 작업을 스스로 시작하겠다는 뜻
			
			AccountDao accountDao=new AccountDao();
			accountDao.setConn(conn);
			
			//출금작업
			Account account1=new Account();
			account1.setAno("111-111");
			account1.setAbalance(500000);
			int rowNo1=accountDao.update(account1);
			
			//입금작업
			Account account2=new Account();
			account2.setAno("111-113");
			account2.setAbalance(200000);
			int rowNo2=accountDao.update(account2);
			
			if(rowNo1==1 && rowNo2==1){
				conn.commit();
				System.out.println("계좌이제 성공");
			}else{
				conn.rollback();
				System.out.println("계좌가 존재않아서 계좌이체 할수 없음");
			}
		}
		
		catch(Exception e){
			try {conn.rollback();} catch (SQLException e1) {}
			System.out.println("예외가 발생하여 계좌이체 실패함");
			}finally{
			try{
			conn.setAutoCommit(true);
			conn.close();
			} catch(SQLException e){}
		}
	}
}
