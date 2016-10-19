package finalsource.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import finalsource.dto.Board;
import finalsource.dto.Member;

public class BoardDao {
	
	private Connection conn;
	 
	public void setConn(Connection conn) {
		this.conn = conn;
	}
	
	public int insert(Board board) throws SQLException{ //1아니면 예외발생
		String sql="insert into board(bno, bcontent, bwriter, bhitcount, btitle, bdate) values(?, ?, ?, ?, ?, ?)";
		PreparedStatement pstmt=conn.prepareStatement(sql);
		pstmt.setInt(1,  board.getBno());
		pstmt.setString(2, board.getBcontent());
		pstmt.setString(3, board.getBwriter());
		pstmt.setInt(4,  board.getBhitcount());
		pstmt.setString(5, board.getBtitle());
		pstmt.setDate(6, new Date(board.getBdate().getTime()));
		int rowNo=pstmt.executeUpdate();
		pstmt.close();
		return rowNo;
	}
	
	public Board selectByBno(int bno) throws SQLException{
		String sql="select bno, bcontent, btitle, bwriter, bhitcount from board where bno=?";
		Board board=null;		
		PreparedStatement pstmt=conn.prepareStatement(sql);
		pstmt.setInt(1, bno);
		ResultSet rs=pstmt.executeQuery();
		
		if(rs.next()){
			board=new Board();
			board.setBno(rs.getInt("bno"));
			board.setBcontent(rs.getString("bcontent"));
			board.setBtitle(rs.getString("btitle"));
			board.setBwriter(rs.getString("bwriter"));
			board.setBhitcount(rs.getInt("bhitcount"));
			
		}
		rs.close();
		pstmt.close();
		return board;
	}
	
	public List<Board> selectByBTitle(String btitle) throws SQLException{
		String sql="select bno, btitle, bwriter, bhitcount, bdate, bcontent from board where btitle like ?";
		List<Board> list=new ArrayList<>();
		PreparedStatement pstmt=conn.prepareStatement(sql);
		pstmt.setString(1, "%"+btitle+"%");
		ResultSet rs=pstmt.executeQuery();
		
		while(rs.next()){
			Board board =new Board();
			board.setBwriter(rs.getString("bwriter"));
			board.setBdate(rs.getDate("bdate"));
			board.setBhitcount(rs.getInt("bhitcount"));
			board.setBno(rs.getInt("bno"));
			board.setBtitle(rs.getString("btitle"));
			board.setBwriter(rs.getString("bwriter"));
			list.add(board);
		}
		rs.close();
		pstmt.close();
		return list;
	}
	
	public int update(Board board) throws SQLException{
		String sql="update board set bwriter=?, bcontent=?, btitle=? where bno=?";
		PreparedStatement pstmt=conn.prepareStatement(sql);
		pstmt.setString(1, board.getBwriter());
		pstmt.setString(2, board.getBcontent());
		pstmt.setString(3, board.getBtitle());
		pstmt.setInt(4, board.getBno());
		int rowNo=pstmt.executeUpdate();
		pstmt.close();
		return rowNo;
	}
	
	public int deleteByBno(int bno) throws SQLException{
		String sql="delete board where bno=?";
		PreparedStatement pstmt=conn.prepareStatement(sql);
		pstmt.setInt(1, bno);
		int rowNo=pstmt.executeUpdate();
		pstmt.close();
		return rowNo;
	}
}
