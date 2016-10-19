package ch08.service;

import java.sql.Connection;
import java.util.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import ch08.dao.BoardDao;
import ch08.dao.MemberDao;
import ch08.dto.Member;

public class Exam06 {

	public static void main(String[] args) {
		BoardDao dao= new BoardDao();
		
		dao.deleteBybno(6);
	}
}
