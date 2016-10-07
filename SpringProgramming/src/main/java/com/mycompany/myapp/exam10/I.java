package com.mycompany.myapp.exam10;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class I {
	private static final Logger logger = LoggerFactory.getLogger(I.class);
	
	private H h;
	
	@Autowired
	public I(H h){
		logger.info("H 객체 생성");
		this.h=h;
	}

	public void method(){
		logger.info("메소드실행");
		
	}
}
