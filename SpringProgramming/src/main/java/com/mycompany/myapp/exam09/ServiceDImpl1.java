package com.mycompany.myapp.exam09;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ServiceDImpl1 implements ServiceD{

private static final Logger logger=LoggerFactory.getLogger(ServiceDImpl1.class);
	
	@Override
	public void method() {
		logger.info("ServiceDImpl1 method 실행");
	}

}
