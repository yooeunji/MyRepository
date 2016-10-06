package com.mycompany.myapp.exam09;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ServiceCImpl1 implements ServiceC{

	private static final Logger logger=LoggerFactory.getLogger(ServiceCImpl1.class);
	
	@Override
	public void method() {
		logger.info("Impl1 method 실행");
	}


}
