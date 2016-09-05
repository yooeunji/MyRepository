package ch11.exam10;

import java.io.UnsupportedEncodingException;

//수업내용 : 스트링 클래스 (복습함)
public class ByteToStringExample {  

	public static void main(String[] args) throws UnsupportedEncodingException {
		byte[] bytes={72, 101, 108, 108, 111, 32, 74, 97, 118, 97};  //아스키코드 10개의 값이 배열로 만들어졌다~
		
		String str1=new String(bytes);
		System.out.println(str1);
		String str2=new String(bytes, 0, 5); //바이트의 갯수
		System.out.println(str2);
		
		//------------------------------------------------------------------------------------------------------
		
		String str3="홍길동"; //한글은 아스키코드가없어
		byte[] strBytes3=str3.getBytes();   //6바이트
		
		String str4=new String(strBytes3);  //아스키 코드가 아닌 글자는 글자당 2바이트로 읽고 한문자로 만들려고한다.
		System.out.println(str4);
		
		String str5="홍길동";  
		byte[] strBytes5= str5.getBytes("UTF-8");  //<-인코딩,,한글자를 3바이트로 읽기때문에 총 9바이트 
		String str6=new String(strBytes5, "UTF-8"); //<-디코딩..앞에있는 바이트 배열을 가지고 다시 한글자한글자 만들어라.
		System.out.println(str6);  //EUC-KR은 한글을 2바이트로 읽어, UTF는 한글자를 3바이트로 
		
		String str7=new String(strBytes5,3, 6 , "UTF-8");
		System.out.println(str7);
		
		
	}
	
	

}
