package ch08.service;

import java.sql.Connection;
import java.util.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import ch08.dao.MemberDao;
import ch08.dto.Member;

public class Exam03 {

	public static void main(String[] args) {
		MemberDao dao= new MemberDao();
		
		dao.deleteByMid("user3");
	}
}
