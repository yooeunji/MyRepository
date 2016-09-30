package com.mycompany.myapp2.board;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mycompany.myapp2.board.Member;


@Controller
@RequestMapping("/board")
public class boardController {
	private static final Logger logger=LoggerFactory.getLogger(boardController.class);
	@RequestMapping("/index")
	public String index(){
		logger.info("index 요청처리");
		return "board/index";
	}

	@RequestMapping(value="/write", method=RequestMethod.GET)
	public String writeForm(){
		logger.info("writeForm 요청처리");
		return "board/writeform";
	}
	
	@RequestMapping(value="/write", method=RequestMethod.POST)
	public String write(Member member){
		logger.info("index 요청처리");
		logger.info("mname : "+member.getMname());
		logger.info("mcontent : "+member.getMcontent());
		
		return "board/index";
	}
}
