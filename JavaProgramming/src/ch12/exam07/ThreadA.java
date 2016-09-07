package ch12.exam07;

public class ThreadA extends Thread{ //스레드를 상속받으면 항상 run재정의!
	
	public boolean stop=false;
	public Work work=Work.CONTINUE;
	
	
	@Override
	public void run() {
		while(!stop){
			if(work==Work.CONTINUE){
				System.out.println("ThreadA 작업 내용");
			}else if(work==Work.PAUSE){
				Thread.yield();
			}
		}
	System.out.println("ThreadA 종료");
	}
	
}
