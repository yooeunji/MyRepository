package ch12.exam09;

public class PrintThread1 extends Thread {
	private boolean stop;

	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	@Override
	public void run() {
		while(!stop){ 
			System.out.println("실행중...");
		}
		System.out.println("자원정리");
		System.out.println("실행정리");
		
	}

}
