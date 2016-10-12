package com.mycompany.myapp2.exam10;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
//컴포넌트 어노테이션을 붙히면 생성자를이용해서 객체를 만들어 관리를 한다.
public class G {
	private static final Logger logger=LoggerFactory.getLogger(G.class);
	
	public G(){
		logger.info("G객체 생성");
	}
	
	public void method(){
		logger.info("method 생성");
	}
}
