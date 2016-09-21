package ch18.exam09;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileExample2 {

	public static void main(String[] args) throws IOException {
		File file=new File("C:/Temp/dir1/dir2/data.txt");
		File parentDir=file.getParentFile(); 
		parentDir.mkdirs();//data.txt파일의 상위 디렉토리를 만들어주라
		file.createNewFile();
		
		System.out.println(new Date(file.lastModified()));
	}

}
