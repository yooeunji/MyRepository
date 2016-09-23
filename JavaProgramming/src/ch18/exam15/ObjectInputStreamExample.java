package ch18.exam15;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream
;

public class ObjectInputStreamExample {

	public static void main(String[] args) throws IOException, ClassNotFoundException  {
		
		
		FileInputStream fis=new FileInputStream("src/ch18/exam15/data.obj");
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		Member member2=(Member)ois.readObject();
		
		fis.close();
		ois.close();
		
		System.out.println(member2.getMid());
		System.out.println(member2.getMname());
		System.out.println(member2.getMnation());
		System.out.println(member2.getMpassword());
		System.out.println(member2.getMage());
		
		//member와 member2는 다른객체다. 복원이라고하는것음 없는상태에서도 만들수가있어야해
		//필드만 가져다가 setting해주는것!
		
	}
}
