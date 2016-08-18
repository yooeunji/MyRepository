package ch04.exam02;

public class ForExample {

	public static void main(String[] args) {
		
		double sum=0;
		
		for(int i=1; i<=3; i++){
				int p= (int)(Math.random()*6)+1;
				System.out.println(i+"번째 나온수 : "+p);
				sum+=p;
		}
		
		System.out.println("합 : "+sum);
		
		sum=sum/3;
		System.out.println("나누면 : "+sum);
		
	}//for문은 조건에 맞지않으면 한번도 실행 안할수있다.	
}


