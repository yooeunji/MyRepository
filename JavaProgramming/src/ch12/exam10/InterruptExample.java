package ch12.exam10;

public class InterruptExample {

	public static void main(String[] args) {
		PrintThread3 pt=new PrintThread3(); 
		pt.start();
		
		try{Thread.sleep(3000);}catch(InterruptedException e){}
		
		pt.interrupt();
		
	}

}
//인터럽트는 예외를 발생시키는데 일시정시가 될때 발생된다