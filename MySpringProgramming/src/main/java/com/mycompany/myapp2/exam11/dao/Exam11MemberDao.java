package com.mycompany.myapp2.exam11.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.mycompany.myapp2.exam11.controller.Exam11Controller;
import com.mycompany.myapp2.exam11.dto.Member; //딴거하믄안돼

@Component
public class Exam11MemberDao {
	private static final Logger logger=LoggerFactory.getLogger(Exam11MemberDao.class);

	public void insert(Member member){
		logger.info("insert 처리");
	}
	public Member select(String mid){
		logger.info("select 처리");
		return null;
	}
	
}
