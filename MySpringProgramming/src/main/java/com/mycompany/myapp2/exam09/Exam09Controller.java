package com.mycompany.myapp2.exam09;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mycompany.myapp2.exam09.Exam09Controller;

@Controller
@RequestMapping("/exam09")
public class Exam09Controller {
	private static final Logger logger=LoggerFactory.getLogger(Exam09Controller.class);

	
	private B b;
	public void setB(B b) {
		logger.info("setB()실행");
		this.b = b;
	}
	private A a;
	public void setA(A a) {   //이걸통해 외부로부터 A의 객체를 얻자
		logger.info("setA()실행");
		this.a = a;
	}
	
	private ServiceA serviceA;
	public void setServiceA(ServiceA serviceA) {
		logger.info("setServiceA()실행");
		this.serviceA = serviceA;
	}
	private ServiceB serviceB;
	public void setServiceB(ServiceB serviceB) {
		logger.info("setServiceB()실행");
		this.serviceB = serviceB;
	}
	private ServiceC serviceC;
	public void setServiceC(ServiceC serviceC) {
		logger.info("setServiceB()실행");
		this.serviceC = serviceC;
	}
	private ServiceD serviceD;
	public void setServiceD(ServiceD serviceD) {
		logger.info("setServiceD()실행");
		this.serviceD = serviceD;
	}
	
	
	public Exam09Controller(){
		logger.info("Exam09Controller 객체 생성");
	}
	
	@RequestMapping("/index")
	public String index(){
		logger.info("index 처리");
		return "exam09/index";
	}
	
	@RequestMapping("/method1")
	public String method1(){
		logger.info("method1 처리");
		a.method();
		b.method();
		serviceA.method();
		serviceB.method();
		serviceC.method(); //구현객체없이도 컴파일 되긴 한다.
		serviceD.method();
		return "redirect:/exam09/index";
	}
}
