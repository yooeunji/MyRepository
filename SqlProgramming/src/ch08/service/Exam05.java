package ch08.service;

import java.sql.Connection;
import java.util.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import ch08.dao.BoardDao;
import ch08.dto.Board;


public class Exam05 {

	public static void main(String[] args) {
		BoardDao dao= new BoardDao();
		Board board=new Board();
		board.setBno(10);
		board.setBwriter("은지");
		board.setBhitcount(35);
		board.setBcontent("냉무");
		board.setBtitle("제목없음");
		
		dao.insert(board);
	
	}
	

}
