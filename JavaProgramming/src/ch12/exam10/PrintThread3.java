package ch12.exam10;

public class PrintThread3 extends Thread {
	
	
	@Override
	public void run() {
	
		try{
			while(true){ 
			System.out.println("실행중...");
			if(isInterrupted()){
				break;
			}
		}
		}
		catch(Exception e){
			System.out.println("자원정리");
			System.out.println("실행정리");
		}
		
	}

	
}
