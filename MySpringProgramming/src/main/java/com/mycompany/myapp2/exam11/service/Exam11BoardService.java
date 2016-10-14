package com.mycompany.myapp2.exam11.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mycompany.myapp2.exam11.controller.Exam11Controller;
import com.mycompany.myapp2.exam11.dao.Exam11BoardDao;
import com.mycompany.myapp2.exam11.dto.Board;

@Component
public class Exam11BoardService {
	private static final Logger logger=LoggerFactory.getLogger(Exam11BoardService.class);
	
	@Autowired
	private Exam11BoardDao boardDao;

	public void write(Board board){
		logger.info("write처리");
		boardDao.insert(board);
	}
	
	public List<Board> getList(){
		logger.info("getList 처리");
		List<Board> list=boardDao.selectList();
		return list;
	}
	public Board getBoard(int bno){
		logger.info("getBoard 처리");
		Board board=boardDao.selectBoard(bno);
		return board;	
	}
	
	public void updateBoard(Board board){
		logger.info("updateBoard 처리");
		boardDao.update(board);
	}

	public void deleteBoard(int bno) {
		logger.info("deleteBoard 처리");
		boardDao.delete(bno);
		
	}
}
