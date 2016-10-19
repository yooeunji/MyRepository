package ch08.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import ch08.dto.Account;

public class AccountDao {
	private Connection conn;
	
	public void setConn(Connection conn){
		this.conn=conn;
	}
	
	public int update(Account account) throws SQLException{    //(1)Dao에서는 절대 try/catch쓰면안된다 ,throw써라  (2)connection 연결하는 코드가 들어가면안된다.
		String sql="update account set abalance =? where ano=?";
		PreparedStatement pstmt=conn.prepareStatement(sql);
		pstmt.setInt(1,  account.getAbalance());
		pstmt.setString(2, account.getAno());
		int rowNo=pstmt.executeUpdate();
		return rowNo;
		
	}
}
