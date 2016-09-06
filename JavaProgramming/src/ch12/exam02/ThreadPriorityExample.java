package ch12.exam02;

public class ThreadPriorityExample {

	public static void main(String[] args) {
		Thread thread=null;
		for(int i=1; i<=100; i++){
			thread=new ThreadC(i);
			if(i!=100){
				thread.setPriority(Thread.MIN_PRIORITY);
			}else{ //100은 실행기회를 많이갖기때문에 상대적으로 빨리끝난다. 
				thread.setPriority(Thread.MAX_PRIORITY);
			}
			thread.start();
		}
	}

}
