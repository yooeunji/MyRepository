package ch12.exam01;

import java.awt.Toolkit;

public class BeepPrintExample3 {

	public static void main(String[] args)  {
		Toolkit toolkit=Toolkit.getDefaultToolkit();
		
		Thread thread=new Thread(){	 //스레드 상속  메인스레드는 익명객체가있으면 별도의 클래스로 만들어놓고 실행하지않고 그냥 자기할일한다. 
				
			@Override
			public void run() {
				for(int i=0; i<5; i++){
					toolkit.beep();
					System.out.println("소리: "+Thread.currentThread().getName());
					try{Thread.sleep(500);} catch(Exception e){}
				}	
			}
		}; 
		thread.setName("SoundThread");  //스레드 이름을 바꾸고싶으면 thread.start시작 전에 setName!
		thread.start(); //main스레드가 아래를 실행할때 새로운 스레드가 run을 실행한다.
		
		for(int i=0; i<5; i++){
			System.out.println("딩");
			System.out.println("출력: "+ Thread.currentThread().getName());
			try{Thread.sleep(500);} catch(Exception e){}
		}
	}
}
