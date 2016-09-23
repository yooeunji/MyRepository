package ch18.exam12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample2 {

	public static void main(String[] args) throws IOException {
		
		
		FileReader fr=new FileReader("src/ch18/exam12/NAVER.html");
		BufferedReader br=new BufferedReader(fr);
		//행단위로 읽다가 더이상 읽을것이없으면 null을 리턴한다.
		
		int count=0;
		while(true){
			String line=br.readLine();
			if(line==null)break;
			System.out.println((++count)+":"+line);
			
		}
	
		
	}

}
