package com.mycompany.myapp.exam05;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mycompany.myapp.exam03.Exam03Controller;
import com.mycompany.myapp.exam03.Member;

@Controller
@RequestMapping("/exam05")
public class Exam05Controller {
	private static final Logger logger=LoggerFactory.getLogger(Exam05Controller.class);

	@RequestMapping("/index")
	public String index(){
		logger.info("index 요청처리");
		return "exam05/index";
	}
	
	@RequestMapping("/index2")
	public ModelAndView index2(){
		logger.info("index2 요청처리");
		ModelAndView mav=new ModelAndView();
		mav.setViewName("exam05/index");
		return mav;
	}
	
	@RequestMapping("/index3")
	public void index3(HttpServletRequest request, HttpServletResponse response) throws IOException{
		logger.info("index2 요청처리");
		response.setContentType("image/jpeg");
		
		String filePath=request.getServletContext().getRealPath("/WEB-INF/image/photo1.jpg");
		InputStream is=new FileInputStream(filePath); 
		OutputStream os=response.getOutputStream();  
		
		byte[] values=new byte[1024];
		int byteNum=-1;
		while((byteNum=is.read(values))!=-1){
			os.write(values, 0, byteNum);
		}
		os.flush();
		is.close();
		
	}   //뷰 이름을 리턴하지않으면 컨트롤러가/index3앞의 http://localhost:8080/myapp/exam05/index3에 자동으로 .jsp를 붙혀서 리턴한다. 그럼 안되니깐
	//요청처리메소드안에서는 WEB-INF안의 이미지파일에 접근가능, url로 접근 못할뿐
	
}
