package com.mycompany.myapp.exam02;

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
	
/*	@RequestMapping("/join")
	public String join(String mid, String mname, String mage){
		logger.info("join 요청처리");
		logger.info("mid:"+mid);
		logger.info("mname:"+mname);
		logger.info("mage:"+mage);
		return "exam02/index";
	}*/

	@RequestMapping("/join")   
	public String join(Member member){     //위에꺼랑 비교했을때 일일히 요청파라미터를 넘겨주는것보다 클래스를 선언해서 클래스의 객체(커맨드객체)를 넘겨주는것이 더 편하다.
		logger.info("join 요청처리");
		logger.info("mid:"+member.getMid());
		logger.info("mname:"+member.getMname());
		logger.info("mage:"+member.getMage());
		return "exam02/index";
	}
	
	@RequestMapping("/login")
	public String login(
			@RequestParam(value="id") String mid, 
			@RequestParam("password") String mpassword){//파라미터 이름과 매개변수 이름이 다를 때 연결해주자
		logger.info("join 요청처리");
		logger.info("mid:"+mid);
		logger.info("mpassword:"+mpassword);
		return "exam02/index";
	}


		
	@RequestMapping("/order")
	public String order(String pid, String pname, int pprice, String pcompany){  //<-요청파라미터의 값을 받기위함이다.
		logger.info("order 요청처리");
		logger.info("pid:"+pid);
		logger.info("pname:"+pname);
		logger.info("pprice:"+pprice);
		logger.info("pcompany:"+pcompany);
		return "exam02/index";
	}
	
	@RequestMapping("/write")
	public String write(@RequestParam(defaultValue="1")int bno, String title, String content, @RequestParam(defaultValue="0")int hitcount){
		logger.info("write 요청처리");
		logger.info("bno:"+bno);
		logger.info("title:"+title);
		logger.info("content:"+content);
		logger.info("hitcount:"+hitcount);
		return "exam02/index";
	}

	@RequestMapping("/update")
	public String update(
			@RequestParam(defaultValue="1")int bno, 
			String title, String content, 
			@RequestParam(value="count",defaultValue="0")int hitcount   //<-어노테이션의 변수로 값 하나 말고 다른 속성도 기술되어야할때 value생략하지말고 써주라
			){
		logger.info("write 요청처리");
		logger.info("bno:"+bno);
		logger.info("title:"+title);
		logger.info("content:"+content);
		logger.info("hitcount:"+hitcount);
		return "exam02/index";
	}
	
	@RequestMapping("/send")
	public String send(Board board){
		logger.info("write 요청처리");
		logger.info("bno:"+board.getBno());
		logger.info("title:"+board.getTitle());
		logger.info("content:"+board.getContent());
		logger.info("hitcount:"+board.getHitcount());
		return "exam02/index";
	}
}
