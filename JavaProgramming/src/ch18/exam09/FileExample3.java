package ch18.exam09;

import java.io.File;

public class FileExample3 {

	public static void main(String[] args) {
		File root=new File("C:/"); //C디렉토리안에있는 정보를 얻을순없을까?
		File[] contents=root.listFiles();
		
		for(File file:contents){{
			if(file.isDirectory()){
				System.out.print("<DIR>");
			}
			else{
				System.out.print("\t");
				System.out.print(file.length());
			}
		}
			System.out.print("\t");
			System.out.println(file.getName());
		}
	}
}
