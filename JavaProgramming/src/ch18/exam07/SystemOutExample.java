package ch18.exam07;

import java.io.IOException;
import java.io.OutputStream;

public class SystemOutExample {

	public static void main(String[] args) throws IOException {
		System.out.println("콘솔에 출력합니다.");
		
		OutputStream os= System.out;
		String data="콘솔에 출력합니다.";
		byte[] values=data.getBytes();
		os.write(values);
		os.flush();
		os.close();
		
		System.err.println("콘솔에 출력합니다.");
		
	}

}
