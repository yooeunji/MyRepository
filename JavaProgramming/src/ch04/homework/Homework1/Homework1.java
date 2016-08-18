package ch04.homework.Homework1;

public class Homework1 { //클래스 선언

	public static void main(String[] args) { //메소드 선언
		
		for(int i=1; i<=100; i++){   //시행을 100번 반복
			int num1 =(int)(Math.random()*6)+1;  //첫번째 주사위에서 나올수 있는 눈을 변수 num1에 저장
			int num2 =(int)(Math.random()*6)+1;  //두번째 주사위에서 나올수 있는 눈을 변수 num2에 저장
			
			if(num1+num2==10){ //둘의 합이 10이면
				System.out.println("(" + num1 +"," +num2 + ")"); //출력
			}
		}
	}
}