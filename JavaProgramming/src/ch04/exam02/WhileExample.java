package ch04.exam02;

public class WhileExample {

	public static void main(String[] args) throws Exception{
		int i=1;
		
		while(i<=10){
			System.out.println("반복실행중...");
			Thread.sleep(1000);//1초주기로 반복하고싶을때
			i++;
		}

	}

}
