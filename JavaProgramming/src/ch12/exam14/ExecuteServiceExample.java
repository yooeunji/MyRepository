package ch12.exam14;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuteServiceExample {

	public static void main(String[] args) {
		//ThreadPool 생성
		ExecutorService executorService = Executors.newFixedThreadPool(5); //최대 5개의 스레드를 쓰겠다.
		
		//작업 생성 ->항상 run() 을 재정의해줘야한다.
		
		    Runnable task=new Runnable(){
		    	@Override
		    	public void run() {
		    		for(int i=0; i<10; i++){
		    			System.out.println("실행중..."+Thread.currentThread().getName());
		    		}
		    	}
			
		    };
		
		//작업큐에 작업 넣기
		executorService.submit(task);
		
		//스레드풀 종료
				executorService.shutdown();
		}
	
	}

