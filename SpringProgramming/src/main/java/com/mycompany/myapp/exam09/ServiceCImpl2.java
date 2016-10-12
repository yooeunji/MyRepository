package com.mycompany.myapp.exam09;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ServiceCImpl2 implements ServiceC{

	private static final Logger logger=LoggerFactory.getLogger(ServiceCImpl2.class);
	
	@Override
	public void method() {
		logger.info("Impl2 method 실행");
	}


}
