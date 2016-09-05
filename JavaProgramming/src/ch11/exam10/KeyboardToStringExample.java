package ch11.exam10;

import java.io.IOException;

public class KeyboardToStringExample {

	public static void main(String[] args) throws IOException {
		byte[] bytes= new byte[100];
		
		System.out.println("입력");
		int readByteNo=System.in.read(bytes);  //매개값을 안주면 키 하나만 읽는다. bytes를 매개값으로주면 읽은 값을 bytes변수에 저장한다. 한글입력이면 50글자 입력 
		//입력된 readByteNo은 입력된 글자수+2바이트(앤터값때매)
	
		//String str=new String(bytes);
		String str=new String(bytes, 0, readByteNo-2);
		System.out.println(str);
	}

}
