package ch12.exam01;

import java.awt.Toolkit;

public class BeepPrintExample4 {

	public static void main(String[] args)  {
		Toolkit toolkit=Toolkit.getDefaultToolkit();
		
		Thread thread=new SoundThread();
		thread.start();//스레드 상속  메인스레드는 익명객체가있으면 별도의 클래스로 만들어놓고 실행하지않고 그냥 자기할일한다. 
				
	
		
		for(int i=0; i<5; i++){
			System.out.println("딩");
			System.out.println("출력: "+ Thread.currentThread().getName());
			try{Thread.sleep(500);} catch(Exception e){}
		}
	}
}
