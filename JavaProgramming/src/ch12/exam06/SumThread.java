package ch12.exam06;

public class SumThread extends Thread{
	 
	private long sum=0;
	
	
	public long getSum() {
		return sum;
	}

	public void setSum(long sum) {
		this.sum = sum;
	}
	
	@Override
	public void run() {
		for(int i=1; i<=100; i++){
			sum+=i;
		}
	}

	
		
}
