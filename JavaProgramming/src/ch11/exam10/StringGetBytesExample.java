package ch11.exam10;

import java.io.UnsupportedEncodingException;

public class StringGetBytesExample {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String str="안녕하세요";
		
		byte[] bytes1=str.getBytes();
		System.out.println("bytes1.length: " +bytes1.length);
		
		byte[] bytes2=str.getBytes("EUC-KR");
		System.out.println("bytes2.length: " +bytes2.length);
		
		byte[] bytes3=str.getBytes("UTF-8");
		System.out.println("bytes3.length: " +bytes3.length);

		String str1=new String(bytes1);
		System.out.println("str1:"+str1);
		
		String str2=new String(bytes2);
		System.out.println("str2:"+str2);
	}

}
