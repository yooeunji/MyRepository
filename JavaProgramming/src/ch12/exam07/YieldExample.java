package ch12.exam07;

public class YieldExample {

	public static void main(String[] args) throws InterruptedException {
		ThreadA threadA=new ThreadA();
		ThreadB threadB=new ThreadB();
		
		threadA.start();
		threadB.start();
		
		try{Thread.sleep(3000);} catch(InterruptedException e){}	
		threadA.work=Work.PAUSE; //스레드A가 양보를 하게된다.
		
		try{Thread.sleep(3000);} catch(InterruptedException e){}	
		threadA.work=Work.CONTINUE;
		
		try{Thread.sleep(3000);} catch(InterruptedException e){}	
		threadA.stop=true;
		threadB.stop=true;
	}

}
