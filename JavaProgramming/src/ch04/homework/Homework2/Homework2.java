package ch04.homework.Homework2; 

public class Homework2 { //클래스 선언
	public static void main(String[] args) { //메소드 선언
		
		for(int i=1; i<=10; i++){ //int형 변수 i를 선언하고 1부터 10까지 1씩증가하면서 반복
			for(int j=1; j<=10; j++){ //int형 변수 j를 선언하고 1부터 10까지 1씩증가하면서 반복
				if((4*i)+(5*j)==60){ //조건문을 만족하면
					System.out.println("(" + i +","+ j +")");		 //출력			
				}
			}
		}
	}
}
