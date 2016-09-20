package ch18.exam01;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;



public class InputStreamExample2 {

	public static void main(String[] args) throws IOException {
		
		String filePath=InputStreamExample2.class.getResource("data.txt").getPath();
		
		int count=0;
		InputStream is=new FileInputStream(filePath);
		byte[] value=new byte[3];  //value배열에 읽은 데이터를 저장할끄야
		while(true){
			int byteNum=is.read(value);
			if(byteNum==-1)break;
			System.out.println(byteNum+":"+Arrays.toString(value));
			count++;
		}
		System.out.println("읽은횟수:"+count);
		is.close();
		
		
		//////
		
		 
		count=0;
		is=new FileInputStream(filePath);
		value=new byte[3];  //value배열에 읽은 데이터를 저장할끄야
		int byteNum=-1;
		while((byteNum = is.read(value))!=-1){
		
			System.out.println(byteNum+":"+Arrays.toString(value));
			count++;
		}
		System.out.println("읽은횟수:"+count);
		is.close();
		
		
	}

}
