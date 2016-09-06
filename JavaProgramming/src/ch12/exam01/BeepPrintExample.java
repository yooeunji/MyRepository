package ch12.exam01;

import java.awt.Toolkit;

public class BeepPrintExample {

	public static void main(String[] args) throws InterruptedException {
		Toolkit toolkit=Toolkit.getDefaultToolkit();
		
		for(int i=0; i<5; i++){
			toolkit.beep();
			System.out.println(Thread.currentThread().getName());  //현재 실행하는 스레드의 이름을 얻을수있다.
			Thread.sleep(500);
		}
	

		for(int i=0; i<5; i++){
			System.out.println("딩");
			System.out.println(Thread.currentThread().getName());  //현재 실행하는 스레드의 이름을 얻을수있다.
			Thread.sleep(500);
		}
	}
}
