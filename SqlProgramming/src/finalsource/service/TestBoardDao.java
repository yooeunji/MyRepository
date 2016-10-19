package finalsource.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import finalsource.dao.BoardDao;
import finalsource.dto.Board;


public class TestBoardDao {

	public static void main(String[] args) {
		testInsert();
	//	testSelectByBno();
	//	testSelectByBtitle();
	//	testUpdate();
	//	testDeleteByBno();
		
	}

	private static void testDeleteByBno() {
		Connection conn=null;
		try{
			Class.forName("oracle.jdbc.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "tester1", "kosa12345");	
			BoardDao dao=new BoardDao();
			dao.setConn(conn);
			
			int rowNo=dao.deleteByBno(3);
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
			BoardDao dao=new BoardDao();
			dao.setConn(conn);
			
			Board board =new Board();
			board.setBno(3);
			board.setBwriter("은지");
			board.setBcontent("집가고시푸ㅜㅡㅜ");
			board.setBtitle("10월19일");
			
			int rowNo=dao.update(board);
			System.out.println(rowNo+"개 행이 수정됨");
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{conn.close();} catch(SQLException e){}
		}
		
	}

	private static void testSelectByBtitle() {
		Connection conn=null;
		try{
			Class.forName("oracle.jdbc.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "tester1", "kosa12345");	
			BoardDao dao=new BoardDao();
			dao.setConn(conn);
			
			List<Board> list=dao.selectByBTitle("제목");
			
			for(Board board : list){
				System.out.print(board.getBno()+ " | " );
	            System.out.print(board.getBtitle()+ " | " );
	            System.out.print(board.getBwriter()+ " | " );
	            System.out.print(board.getBcontent()+ " | " );
	            System.out.print(board.getBhitcount()+ " | " );
	            System.out.println(board.getBdate()+ " | " );
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{conn.close();} catch(SQLException e){}
		}
		
	}

	private static void testSelectByBno() {
		Connection conn = null;
	      try {
	         Class.forName("oracle.jdbc.OracleDriver");
	         conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "tester1", "kosa12345");

	     	BoardDao dao=new BoardDao();
	         dao.setConn(conn);
	         
	         Board board = dao.selectByBno(3);
	         if ( board != null ) {
	            System.out.print(board.getBno()+ " | " );
	            System.out.print(board.getBtitle()+ " | " );
	            System.out.print(board.getBwriter()+ " | " );
	            System.out.print(board.getBcontent()+ " | " );
	            System.out.print(board.getBhitcount()+ " | " );
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
			BoardDao dao=new BoardDao();
			dao.setConn(conn);
			
			Board board =new Board();
			board.setBwriter("맥주");
			board.setBcontent("꿀맥");
			board.setBtitle("ㅎㅎ");
			board.setBdate(new Date());
			board.setBhitcount(1);
			board.setBno(13);
			
			int rowNo=dao.insert(board);
			System.out.println(rowNo+"개 행이 저장됨");
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{conn.close();} catch(SQLException e){}
		}
	}

}
