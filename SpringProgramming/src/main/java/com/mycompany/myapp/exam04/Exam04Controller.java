package com.mycompany.myapp.exam04;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mycompany.myapp.exam03.Exam03Controller;
import com.mycompany.myapp.exam03.Member;

@Controller
@RequestMapping("/exam04")
public class Exam04Controller {
	private static final Logger logger=LoggerFactory.getLogger(Exam04Controller.class);

	@RequestMapping("/index")
	public String index(){
		logger.info("index 요청처리");
		return "exam04/index";
	}
	
	@RequestMapping(value="/join", method=RequestMethod.GET)
	public String joinForm(){
		logger.info("joinForm 요청처리");
		return "exam04/joinform";
	}
	
	@RequestMapping(value="/join", method=RequestMethod.POST)
	public String join(Member member){
		logger.info("index 요청처리");
		logger.info("mid : " +member.getMid());
		logger.info("mname : "+member.getMname());
		logger.info("mpassword : "+member.getMpassword());
		logger.info("memail : "+member.getMemail());
		logger.info("mtel : "+member.getMtel());
		logger.info("mjob : "+member.getMjob());
		logger.info("mskill : "+Arrays.toString(member.getMskill()));
		logger.info("maddress1 : "+member.getMaddress1());
		logger.info("maddress2 : "+member.getMaddress2());
		logger.info("mbirth : "+member.getMbirth());
		
		return "exam04/index";
	}
	
	@RequestMapping(value="/write", method=RequestMethod.GET)
	public String writeForm(){
		logger.info("writeForm 요청처리");
		return "exam04/writeform";
	}
	
	@RequestMapping(value="/write", method=RequestMethod.POST)
	public String write(String btitle, String bcontent){
		logger.info("writeForm 요청처리");
		logger.info("제목 : "+btitle);
		logger.info("내용 : "+bcontent);
		return "exam04/index";
	}
	
	
	
	
	
}
