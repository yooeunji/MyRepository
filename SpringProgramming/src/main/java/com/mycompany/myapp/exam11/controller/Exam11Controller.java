package com.mycompany.myapp.exam11.controller;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mycompany.myapp.exam10.Exam10Controller;
import com.mycompany.myapp.exam11.dto.Board;
import com.mycompany.myapp.exam11.dto.Member;
import com.mycompany.myapp.exam11.service.Exam11BoardService;
import com.mycompany.myapp.exam11.service.Exam11MemberService;

//의존객체가되냐안되냐 , 다른 객체에 주입을 해야할때, 메소드의 매개변수로 쓰일때는 , 
@Controller()
@RequestMapping("/exam11")
public class Exam11Controller {//등록이름의 첫글자가 소문자로 바껴서 등록된다.
	private static final Logger logger=LoggerFactory.getLogger(Exam11Controller.class);

	@Autowired
	private Exam11MemberService memberService;
	
	@Autowired
	private Exam11BoardService boardService;

	
	@RequestMapping("/index")
	public String index(){
		logger.info("index처리");
		return "exam11/index";
	}
	
	@RequestMapping(value="/memberJoin", method=RequestMethod.GET)
	public String memberJoinForm(){
		logger.info("memberJoin(GET)처리");
		return "exam11/memberJoinForm";
	}
	
	@RequestMapping(value="/memberJoin", method=RequestMethod.POST)
	public String memberJoin(Member member){
		logger.info("memberJoin(POST)처리");
	
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
		
		memberService.join(member);
		return "redirect:/exam11/memberLogin";
	} 
	
	@RequestMapping(value="/memberLogin", method=RequestMethod.GET)
	public String memberLoginForm(){
		logger.info("memberLogin(GET)처리");
		
		return "exam11/memberLoginForm";
	}
	
	@RequestMapping(value="/memberLogin", method=RequestMethod.POST)
	public String memberLogin(String mid, String mpassword){
		logger.info("memberLogin(POST)처리");
		logger.info("mid : " +mid);
		logger.info("mpassword : "+mpassword);
		
		int result=memberService.login(mid, mpassword);
		
		if(result==Exam11MemberService.LOGIN_SUCCESS){
			return "redirect:/exam11/index";
		}else if(result==Exam11MemberService.LOGIN_FAIL_MID){
			return "redirect:/exam11/memberLogin";
		}else{
			return "redirect:/exam11/memberLogin";
		}
		
	}
	
	@RequestMapping("/memberLogout")
	public String memberLogout(){
		logger.info("memberLogout 처리");
		return "redirect:/exam11/index";
	}
	
	@RequestMapping(value="/boardWrite", method=RequestMethod.GET)
	public String boardWriteForm(){
		logger.info("boardWriteForm 처리");
		return "exam11/boardWriteForm";
	}
	
	@RequestMapping(value="/boardWrite", method=RequestMethod.POST)
	public String boardWrite(Board board){
		logger.info("boardWrite 처리");
		boardService.write(board);
		return "redirect:/exam11/index";
	}
	
	@RequestMapping("/boardList")
	public String boardList(Model model){
		logger.info("boardList 처리");
		List<Board> list=boardService.getList();
		model.addAttribute("boardlist", list);
		return "exam11/boardList";
	}
	
	@RequestMapping("/boardView")
	public String boardView(int bno, Model model){
		logger.info("boardView 처리");
		Board board=boardService.getBoard(bno);
		model.addAttribute("board", board);
		return "exam11/boardView";
	}
	
	@RequestMapping(value="/boardUpdate", method=RequestMethod.GET)
	public String boardUpdateForm(int bno, Model model){
		logger.info("boardView 처리");
		Board board=boardService.getBoard(bno);
		model.addAttribute("board", board);
		return "exam11/boardUpdateForm";
	}
	
	@RequestMapping(value="/boardUpdate", method=RequestMethod.POST)
	public String boardUpdate(Board board){
		logger.info("boardUpdate 처리");
		boardService.updateBoard(board);
		return "redirect:/exam11/boardList";
	}
	
	@RequestMapping(value="/boardDelete")
	public String boardDelete(int bno){
		logger.info("boardDelete 처리");
		boardService.deleteBoard(bno);
		return "redirect:/exam11/boardList";
	}
	
}
