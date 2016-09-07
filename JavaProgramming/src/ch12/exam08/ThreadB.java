package ch12.exam08;

public class ThreadB extends Thread{
	private WorkObject workObject;
	
	public ThreadB(WorkObject workObject){ //생성자 injection주입
		this.workObject=workObject;
	}
	
	public void setWorkObject(WorkObject workObject) { //setter주입
		this.workObject = workObject;
	}


	@Override
	public void run() {
		for(int i=0; i<10; i++){
			workObject.methodB();
		}
	}

}
