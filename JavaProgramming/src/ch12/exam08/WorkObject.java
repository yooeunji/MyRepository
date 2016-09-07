package ch12.exam08;

public class WorkObject {
	public synchronized void methodA(){ //하나의 스레드만 실행할수있도록 보장
		System.out.println("ThreadA의 methodA() 작업 실행");
		notify();
		try {wait();} catch (InterruptedException e) {}
	}
	
	public synchronized void methodB(){
		System.out.println("ThreadB의 methodB() 작업 실행");
		notify();
		try {wait();} catch (InterruptedException e) {}
	}
}
