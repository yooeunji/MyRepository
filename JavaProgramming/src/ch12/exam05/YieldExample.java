package ch12.exam05;

public class YieldExample {

	public static void main(String[] args) throws InterruptedException {
		ThreadA threadA=new ThreadA();
		ThreadB threadB=new ThreadB();
		
		threadA.start();
		threadB.start();
		
		try{Thread.sleep(3000);} catch(InterruptedException e){}	
		threadA.work=false; //스레드A가 양보를 하게된다.
		
		try{Thread.sleep(3000);} catch(InterruptedException e){}	
		threadA.work=true;
		
		try{Thread.sleep(3000);} catch(InterruptedException e){}	
		threadA.stop=true;
		threadB.stop=true;
	}

}
