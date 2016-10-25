package finalsource.dao;

import java.sql.Connection;

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
		String sql="insert into board(bno, bcontent, bwriter,  btitle, bhitcount, bdate) values(seq_board_bno.nextval, ?, ?, ?, 0, sysdate)";
		PreparedStatement pstmt=conn.prepareStatement(sql);
	
		pstmt.setString(1, board.getBcontent());
		pstmt.setString(2, board.getBwriter());
		pstmt.setString(3, board.getBtitle());
		
		
		
		int rowNo=pstmt.executeUpdate();
		pstmt.close();
		return rowNo;
	}
	
	public Board selectByBno(int bno) throws SQLException{
		String sql="select bno, bcontent, btitle, bwriter, bhitcount , bdate from board where bno=?";
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
			board.setBdate(rs.getDate("bdate"));
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
		String sql="update board set bwriter=?, bcontent=?, btitle=?, bhitcount=?  where bno=?";
		PreparedStatement pstmt=conn.prepareStatement(sql);
		pstmt.setString(1, board.getBwriter());
		pstmt.setString(2, board.getBcontent());
		pstmt.setString(3, board.getBtitle());
		pstmt.setInt(5, board.getBno());
		pstmt.setInt(4, board.getBhitcount());
		
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
	
	public List<Board> selectByPage(int pageNo, int rowsPerPage) throws SQLException{
		String sql="";
		sql+="select rn, bno, btitle, bcontent, bwriter, bhitcount, bdate ";
		sql+="from( ";
		sql+="select rownum as rn, bno, btitle, bcontent, bwriter, bhitcount, bdate ";
		sql+="from (select bno, btitle, bcontent, bwriter, bhitcount, bdate from board order by bno desc) ";
		sql+="where rownum<=? ";
		sql+=") ";
		sql+="where rn>=? ";
		List<Board> list=new ArrayList<>();
		PreparedStatement pstmt=conn.prepareStatement(sql);
		pstmt.setInt(1, pageNo*rowsPerPage);
		pstmt.setInt(2, (pageNo-1)*rowsPerPage+1);
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
}
