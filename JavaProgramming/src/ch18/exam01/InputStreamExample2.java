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
		byte[] value=new byte[3];  //value�迭�� ���� �����͸� �����Ҳ���
		while(true){
			int byteNum=is.read(value);
			if(byteNum==-1)break;
			System.out.println(byteNum+":"+Arrays.toString(value));
			count++;
		}
		System.out.println("����Ƚ��:"+count);
		is.close();
		
		
		//////
		
		 
		count=0;
		is=new FileInputStream(filePath);
		value=new byte[3];  //value�迭�� ���� �����͸� �����Ҳ���
		int byteNum=-1;
		while((byteNum = is.read(value))!=-1){
		
			System.out.println(byteNum+":"+Arrays.toString(value));
			count++;
		}
		System.out.println("����Ƚ��:"+count);
		is.close();
		
		
	}

}
