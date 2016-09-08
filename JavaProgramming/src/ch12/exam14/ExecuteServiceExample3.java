package ch12.exam14;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExecuteServiceExample3 {

	public static void main(String[] args) {
		//ThreadPool 생성
		ExecutorService executorService = Executors.newFixedThreadPool(5); //최대 5개의 스레드를 쓰겠다.
		
		//작업 생성 ->항상 run() 을 재정의해줘야한다
		for(int i=0; i<1000; i++){
			int count=i;
		    Runnable task=new Runnable(){
		    	
		    	@Override
		    	public void run() {
		    		ThreadPoolExecutor threadPoolExecutor=(ThreadPoolExecutor)executorService;
		    		System.out.println("스레드 총수 : "+threadPoolExecutor.getPoolSize());
		    		System.out.println("실행("+count+"):"+Thread.currentThread().getName());
		    		//int value=Integer.parseInt("aa");  //NumberFormatException 발생
		    	}
		    };
		//작업큐에 작업 넣기
		executorService.execute(task);
		}		
		//스레드풀 종료
		executorService.shutdown();
	}
}
