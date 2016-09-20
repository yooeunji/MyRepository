package ch18.exam05;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterExample {

	public static void main(String[] args) throws IOException {
		Writer writer=new FileWriter("src/ch18/exam05/data.txt");
		
		String data="날씨가 지금 같으면 좋겠습니다.";
		
		writer.write(data);
			
		/* 위에꺼랑같음 
		char[] values=data.toCharArray();
		writer.write(values); */
		
		
		writer.flush();
		writer.close();
	}

}
