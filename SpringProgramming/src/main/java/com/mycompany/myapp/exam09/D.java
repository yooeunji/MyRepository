package com.mycompany.myapp.exam09;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class D {
	private static final Logger logger=LoggerFactory.getLogger(D.class);

	public D(){
		logger.info("D객체 생성");
	}
	public void method(){
		logger.info("method실행");
	}
}
