package ch08.service;

import java.sql.Connection;
import java.util.Date;

import ch08.dto.Board;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import ch08.dao.BoardDao;
import ch08.dao.MemberDao;
import ch08.dto.Member;

public class Exam04 {

	public static void main(String[] args) {
	
		BoardDao dao= new BoardDao();
		
		Board board=new Board();
		board.setBno(1);
		board.setBcontent("안녕");
		board.setBhitcount(0);
		board.setBtitle("점심시간");
		board.setBwriter("은지");
	
		dao.update(board);
	}
}
