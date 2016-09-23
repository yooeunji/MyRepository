package ch18.exam10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStreamExample {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("src/ch18/exam10/Koala.jpg"); //파일이 꼭 존재를 해야한다
		FileOutputStream fos=new FileOutputStream("src/ch18/exam10/Koala2.jpg");
		
		byte[] values=new byte[1024];
		int byteNum=-1;
		while((byteNum=fis.read(values))!=-1){
			fos.write(values, 0, byteNum);
		}
		fos.flush();
		
		fis.close();
		fos.close();
	}

}
