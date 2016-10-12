package com.mycompany.myapp2.exam10;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class K {
	private static final Logger logger = LoggerFactory.getLogger(K.class);
	
	@Autowired
	private G g;
	@Autowired
	private H h;
	
	
	public K(){
		logger.info("K 객체 생성");
	}
	
	public void method(){
		logger.info("메소드실행");
		g.method();
		h.method();
		
	}

}
