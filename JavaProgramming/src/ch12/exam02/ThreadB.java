package ch12.exam02;

public class ThreadB extends Thread{
	@Override
	public void run() {
		for(int i=1; i<=100000000; i++){
			
		}
		System.out.println("ThreadB 종료");
	}
}
