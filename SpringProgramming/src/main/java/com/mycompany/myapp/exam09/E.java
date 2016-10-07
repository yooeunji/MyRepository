package com.mycompany.myapp.exam09;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class E {
	private static final Logger logger=LoggerFactory.getLogger(E.class);

	private B b;
	private D d;
	
	public E(B b, D d){
		logger.info("E객체 생성");
	    this.b=b;
	    this.d=d;
	}
	
	public void method(){
		logger.info("method실행");
		b.method();
		d.method();
	}
}
