package ch18.exam07;

import java.io.IOException;
import java.io.InputStream;

public class SystemInExample {

	public static void main(String[] args) throws IOException {
		
		//한개의 키만 읽기
		InputStream is=System.in;
		
		/*System.out.println("한개의 키만 입력 : ");
		int keyCode=is.read();  //한개의 key만 읽을수있다.
		System.out.println(keyCode+":" +(char)keyCode);*/
		
		//한글과 같은 여러키의 조합을 읽기
		System.out.println("여러키를 입력:");
		byte[] values=new byte[100];
		int byteNum=is.read(values); //읽은 문자는 values에 저장되고 읽은 문자수를 리턴한다. Enter때매 +2
		
		String data=new String(values, 0, byteNum-2);
		System.out.println(data);
	}

}
