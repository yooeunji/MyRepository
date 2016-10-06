package com.mycompany.myapp2.exam09;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ServiceA {
	private static final Logger logger=LoggerFactory.getLogger(ServiceA.class);
	
	public ServiceA(){
		logger.info("ServiceA객체 생성");
	}
	public void method(){
		logger.info("ServiceA method 실행");
	}
}
