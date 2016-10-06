package com.mycompany.myapp.exam08;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mycompany.myapp.exam08.Exam08Controller;

@Controller
@RequestMapping("/exam08")
public class Exam08Controller {
	private static final Logger logger=LoggerFactory.getLogger(Exam08Controller.class);

	@RequestMapping("/index")
	public String index(){
		logger.info("index 처리");
		return "exam08/index";
	}
	
	@RequestMapping("/join")
	public String join(){
		logger.info("join 처리");
		return "redirect:/exam08/index";   // 다시요청할경로
	}
	
	@RequestMapping("/write") //글을 저장하는 목적
	public String write(){
		logger.info("write 처리");
		return "redirect:/exam08/list";   // 요청경로
	}
	
	@RequestMapping("/list")   //리스트를 가져오는 목적
	public String list(){
		logger.info("list 처리");
		return "exam08/list";   // 요청경로
	}
}
