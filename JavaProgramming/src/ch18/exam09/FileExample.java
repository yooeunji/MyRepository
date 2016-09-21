package ch18.exam09;

import java.io.File;

public class FileExample {

	public static void main(String[] args) {
		File file=new File("C:/Temp/aa.txt");
		
		if(file.exists()){
			
			if(file.isDirectory()){
				System.out.println("디렉토리가존재합니다");
			}
			else{
			System.out.println("파일존재합니다");}
	
		}else{System.out.println("파일존재안해요");}
		
		File dir=new File("C:/Temp/dir1/dir2/dir3");
		dir.mkdirs();
		
	}
}
