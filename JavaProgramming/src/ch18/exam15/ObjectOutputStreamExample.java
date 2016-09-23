package ch18.exam15;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamExample {

	public static void main(String[] args) throws IOException, ClassNotFoundException  {
		FileOutputStream fos=new FileOutputStream("src/ch18/exam15/data.obj");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		Member member=new Member("angel","김천사", "12345", 26);
	
		oos.writeObject(member);
	
		oos.flush();
		oos.close();
		fos.close();
		
		
		System.out.println(member.getMid());
		System.out.println(member.getMname());
		System.out.println(member.getMnation());
		System.out.println(member.getMpassword());
		System.out.println(member.getMage());
		
		//member와 member2는 다른객체다. 복원이라고하는것음 없는상태에서도 만들수가있어야해
		//필드만 가져다가 setting해주는것!
		
	}
}
