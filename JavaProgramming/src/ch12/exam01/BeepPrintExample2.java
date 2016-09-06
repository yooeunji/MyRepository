package ch12.exam01;

import java.awt.Toolkit;

public class BeepPrintExample2 {

	public static void main(String[] args)  {
		Toolkit toolkit=Toolkit.getDefaultToolkit();
		
		Thread thread=new Thread(new Runnable(){	//스레드만듬
				
			@Override
			public void run() {
				for(int i=0; i<5; i++){
					toolkit.beep();
					System.out.println("소리: "+Thread.currentThread().getName());  //현재 실행하는 스레드의 이름을 얻을수있다.
					try{Thread.sleep(500);} catch(Exception e){}
				}	
			}
		});
		
		thread.start(); //main스레드가 아래를 실행할때 새로운 스레드가 run을 실행한다.
		
		for(int i=0; i<5; i++){
			System.out.println("딩");
			System.out.println("출력: "+ Thread.currentThread().getName());  //현재 실행하는 스레드의 이름을 얻을수있다.
			try{Thread.sleep(500);} catch(Exception e){}
		}
	}
}
