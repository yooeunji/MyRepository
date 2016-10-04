package com.mycompany.myapp2.exam06;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mycompany.myapp2.exam06.Exam06Controller;
import com.mycompany.myapp2.exam06.Member;

@Controller
@RequestMapping("/exam06")
public class Exam06Controller {  //큰 주제는 매개변수에 뭐가 들어갈수있느냐
	private static final Logger logger=LoggerFactory.getLogger(Exam06Controller.class);

	@RequestMapping("/index")
	public String index(){
		logger.info("index 요청처리");
		return "exam06/index";
	}
	
	@RequestMapping("/method1")
	public String method1(HttpServletRequest request){
		logger.info("method1 요청처리");
		//클라이언트의 IP얻기
		logger.info("WebClient IP:"+request.getRemoteAddr());
		//클라이언트의 브라우저 종류 얻기
		logger.info("WebClient 종류:"+request.getHeader("User-Agent"));
		if(request.getHeader("User-Agent").contains("Chrome")){
			logger.info("브라우저 종류 : 크롬");
		}else if(request.getHeader("User-Agent").contains("Trident/7.0")){
			logger.info("브라우저 종류 : 인터넷 익스플로러 11");
		}else if(request.getHeader("User-Agent").contains("MSIE")){
			logger.info("브라우저 종류 : 인터넷 익스플로러 10 이하");
		}
		//요청 파라미터 얻기
		logger.info("mid: "+request.getParameter("mid"));
		logger.info("mname: "+request.getParameter("mname"));
		//쿼리 문자열 얻기
		logger.info("쿼리 문자열 : "+request.getQueryString());
		logger.info("요청 URI : "+ request.getRequestURI());
		logger.info("요청 URL : "+ request.getRequestURL());
		logger.info("요청 방식 : "+ request.getMethod());
		logger.info("시스템 파일 경로 : "+request.getServletContext().getRealPath("/WEB-INF/image/photo1.jpg"));
		return "exam06/index";
		}
	
		
		@RequestMapping("/method2")
		public void method2(HttpServletRequest request,HttpServletResponse response) throws IOException{
	/*		response.setContentType("application/json; charset=UTF-8");
			PrintWriter pw=response.getWriter();
			pw.println("{mid:'fall', mname:'한가을}"); 
			pw.flush();  
			pw.close();*/
			
			response.setContentType("image/jpeg");
			String fileName="사진2.jpg";
			fileName=URLEncoder.encode(fileName,"UTF-8"); //파일네임을 UTF-8로 인코딩!  한글->%30%60 %43%32 이런식으로 16진수로 변환
			response.setHeader("Content-Disposition", "attachment; filename=\""+fileName+"\"");  //response에 새로운 해더 추가/ 첨부파일, 보여주지말고 그냥 다운로드해라 라는뜻
		
			OutputStream os=response.getOutputStream();
			
			String filePath=request.getServletContext().getRealPath("/WEB-INF/image/사진2.jpg");
			FileInputStream is=new FileInputStream(filePath);
			
			byte[] values=new byte[1024];
			int byteNum=-1;
			while((byteNum=is.read(values))!=-1){
				os.write(values, 0, byteNum);
			}
			os.flush();
			is.close();
			os.close();
		}
		
		@RequestMapping("/method3")
		public String method3(@RequestHeader("User-Agent") String userAgent){ //User-Agent에서 헤더값을읽어서 대입
			if(userAgent.contains("Chrome")){
				logger.info("브라우저 종류 : 크롬");
			}else if(userAgent.contains("Trident/7.0")){
				logger.info("브라우저 종류 : 인터넷 익스플로러 11");
			}else if(userAgent.contains("MSIE")){
				logger.info("브라우저 종류 : 인터넷 익스플로러 10 이하");
			}
			return "exam06/index";
		}
		
		@RequestMapping("/method4CreateCookie")
		public String method4(HttpServletResponse response) throws UnsupportedEncodingException{
			//쿠키생성
			Cookie cookie1=new Cookie("mid", "fall");
			
			String name="홍길동";
			name=URLEncoder.encode(name,"UTF-8");
			Cookie cookie2=new Cookie("mname",name);
			cookie2.setMaxAge(60);
			
			
			//쿠키 보내기(저장)
			response.addCookie(cookie1); //쿠키를 클라이언트로!
			response.addCookie(cookie2);
			
			
			return "exam06/index";
		}
		
		
		
		@RequestMapping("/method4ReceiveCookieHow1")
		public String method4ReceiveCookieHow1(HttpServletRequest request) throws UnsupportedEncodingException{
			//쿠키받기->요청헤더의 쿠키정보를 읽기
			Cookie[] cookies=request.getCookies();
			if(cookies!=null){
				for(Cookie cookie:cookies){
					String name=cookie.getName();
					String value=null;
					if(name.equals("mname")){
						value=URLDecoder.decode(cookie.getValue(),"UTF-8");
					}else{
						value=cookie.getValue();
					}
					System.out.println(name+":"+value); //최소한두개이상의 쿠키가 날라오겟지??
				}
			}
			return "exam06/index";
		}
		@RequestMapping("/method4ReceiveCookieHow2")
		public String method4ReceiveCookieHow2(@CookieValue(defaultValue="") String mid, @CookieValue(defaultValue="") String mname){
			System.out.println("mid:"+mid);
			System.out.println("mname:"+mname);
			return "exam06/index";
		}
		
		@RequestMapping("/method4DeleteCookie")
		public String method4DeleteCookie(HttpServletResponse response){
			Cookie cookie1=new Cookie("mid","");
			cookie1.setMaxAge(0);
			Cookie cookie2=new Cookie("mname","");
			cookie2.setMaxAge(0);
		
			response.addCookie(cookie1);
			response.addCookie(cookie2);
			
			return "exam06/index";
		}
		
		@RequestMapping("/method5SetObject")
		public String method5SetObject(HttpSession session){
			//객체생성
			Member member=new Member("fall","한가을");
			
			//HttpSession에 객체저장
			session.setAttribute("member", member); //키(아무렇게나), 객체
			
			return "exam06/index";
		}
		
		@RequestMapping("/method5GetObject")
		public String method5GetObject(HttpSession session){
			//객체얻기
			Member member=(Member)session.getAttribute("member"); //member라는 키를가진 객체
			if(member!=null){
				System.out.println("mid:"+member.getMid());
				System.out.println("mname:"+member.getMname());
			}else{
				System.out.println("member라는 객체 엄성");
			}
			return "exam06/index";
		}
		
		@RequestMapping("/method5RemoveObject")
		public String method5RemoveObject(HttpSession session){
			session.removeAttribute("member");//키이름이 Member인 객체를 가진 세션이 있으면 세션에서 객체 삭제하라
			return "exam06/index";
		}
		
}
