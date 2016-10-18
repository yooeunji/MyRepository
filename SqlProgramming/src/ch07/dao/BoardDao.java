package ch07.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ch07.dto.Board;
import ch07.dto.Member;


public class BoardDao {

	public Board selectByBno(int bno){
		Board board=new Board();
		Connection conn=null;
		try{
			Class.forName("oracle.jdbc.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","tester1", "kosa12345"); //sql문을 실행하기 위해 connection연결
			String sql = "select * from board where bno=?";
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, bno);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()){
				board.setBno(rs.getInt("bno"));
				board.setBtitle(rs.getString("btitle"));
				board.setBdate(rs.getDate("bdate"));
				board.setBhitcount(rs.getInt("bhitcount"));
				board.setBwriter(rs.getString("bwriter"));
				board.setBcontent(rs.getString("bcontent"));
			}
			rs.close();
			pstmt.close();
			conn.close();
						
		}catch(Exception e){
			try{conn.close();}catch(SQLException e2){}
			e.printStackTrace();
		}
		return board;
	}

	public List<Board> selectAll() {
		List<Board> list=new ArrayList<>();
		Connection conn=null;
		try{
			Class.forName("oracle.jdbc.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","tester1", "kosa12345");
			String sql = "select * from board";
			PreparedStatement pstmt=conn.prepareStatement(sql);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()){
				Board board=new Board();
				board.setBno(rs.getInt("bno"));
				board.setBtitle(rs.getString("btitle"));
				board.setBdate(rs.getDate("bdate"));
				board.setBhitcount(rs.getInt("bhitcount"));
				board.setBwriter(rs.getString("bwriter"));
				board.setBcontent(rs.getString("bcontent"));
			
				list.add(board);
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
