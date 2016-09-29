package com.mycompany.myapp2.exam02;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/exam02")
public class Exam02Controller {
	private static final Logger logger=LoggerFactory.getLogger(Exam02Controller.class);
	@RequestMapping("/index")
	public String index(){
		logger.info("index 요청처리");
		return "exam02/index";
	}
	
	@RequestMapping("/login")
	public String login(
		@RequestParam(value="id") String mid,
		@RequestParam("password") String mpassword){
		logger.info("로그인 요청처리");
		logger.info("mid :"+ mid);
		logger.info("mpassword :"+ mpassword);
		return "exam02/index";
	}
	@RequestMapping("/join")
	public String join(String mid, String mname, String mage){
		logger.info("join 요청처리");
		logger.info("mid:"+mid);
		logger.info("mname:"+mname);
		logger.info("mage:"+mage);
		return "exam02/index";
	}
	@RequestMapping("/order")
	public String order(String pid, String pname, int pprice, String pcompany){
		logger.info("order 요청처리");
		logger.info("pid : "+pid);
		logger.info("pprice : "+pprice);
		logger.info("pname : "+pname);
		logger.info("pcompany : "+pcompany);
		return "exam02/index";
	}
	
	@RequestMapping("/write")
	public String write(@RequestParam(defaultValue="1")int bno, String title, String content, @RequestParam(defaultValue="10")int hitcount){
		logger.info("write 요청처리");
		logger.info("bno : "+bno);
		logger.info("content : "+content);
		logger.info("title : "+title);
		logger.info("hitcount : "+hitcount);
		return "exam02/index";
	}
	
	@RequestMapping("/update")
	public String update(@RequestParam(defaultValue="1")int bno, 
			String title, String content, 
			@RequestParam(value="count",defaultValue="10")int hitcount){
		logger.info("글 수정 요청처리");
		logger.info("bno : "+bno);
		logger.info("content : "+content);
		logger.info("title : "+title);
		logger.info("hitcount : "+hitcount);
		return "exam02/index";
	}
	
	//커맨드객체
	@RequestMapping("/send")
	public String send(Board board){
		logger.info("send 요청처리");
		logger.info("bno : "+board.getBno());
		logger.info("content : "+board.getContent());
		logger.info("title : "+board.getTitle());
		logger.info("hitcount : "+board.getHitcount());
		return "exam02/index";
	}
	
}
