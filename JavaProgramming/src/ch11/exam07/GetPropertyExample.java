package ch11.exam07;

import java.util.Properties;  //Ctrl  +  Shift  +  o
import java.util.Set;

public class GetPropertyExample {   //System property의 전체내용을출력해주는코드

	public static void main(String[] args) {
		String osName=System.getProperty("os.name");
		System.out.println(osName);
		
		String userName=System.getProperty("user.name");
		System.out.println(userName);
		
		String userHome=System.getProperty("user.home");
		System.out.println(userHome);
		
		System.out.println("===================");
		
		Properties props=System.getProperties();
		Set keys=props.keySet();
		for(Object objKey : keys){   //keys는 나올때 Object 타입으로 나온다.
			String key=(String) objKey;
			System.out.print(key);
			System.out.print(":");
			String value=System.getProperty(key);
			System.out.println(value);
			
		}
	}

}
