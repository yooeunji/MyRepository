package ch18.exam11;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReaderExample {

	public static void main(String[] args) throws IOException {
		
		//보조스트림 이용할때
		
		InputStream is=System.in;	//콘솔로부터 입력받기위해서 InputStream을 얻어놨다
		
		Reader reader=new InputStreamReader(is); //바이트스트림을 문자로 만들어준다
		
		char data=(char)reader.read();
		System.out.println(data);
		
		
		//하던대로 할때
	/*	InputStream is=System.in;
		int byteNum=is.read(values);
		String data=new String(values, 0, byteNum-2);
		System.out.println(data);*/
		
		
	}

}
