package ch12.exam05;

public class ThreadA extends Thread{ //스레드를 상속받으면 항상 run재정의!
	
	public boolean stop=false;
	public boolean work=true;
	
	
	@Override
	public void run() {
		while(!stop){
			if(work){
				System.out.println("ThreadA 작업 내용");
			}else{
				Thread.yield();
			}
		}
	System.out.println("ThreadA 종료");
	}
	
}
