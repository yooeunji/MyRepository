package ch05.exam03;

import java.util.Scanner; //자바가 제공

public class ScannerExample {

	public static void main(String[] args) throws Exception{
		
		    Scanner scanner= new Scanner(System.in); //scanner에는 번지가 저장/8가지 기본타입에 속하는 것이아니면 보통 참조타입 객체, 키보드로부터 입력하는 값을 읽어들이는 스캐너생성
		    /*while(true){
				int value=scanner.nextInt(); //스캐너라는 객체가 가지고있는 메소드를 실행ㅎㅐ서 생기는 결과값을 value에 저장하겠다 , () <-반환값이 있을것이다. 
				System.out.println(value);		
			
				String value1=scanner.nextLine(); //숫자와 문자 둘다 읽어들일수있다.
				System.out.println(value1);	*/
		
			System.out.print("학생수: ");
			String strNum=scanner.nextLine();
			int num = Integer.parseInt(strNum);
			int[] scores=new int[num];
			
			
			for(int i=0; i<scores.length; i++ ){
				System.out.print("점수");
				String data =scanner.nextLine();
				scores[i]= Integer.parseInt(data);
			}
				
			
			int sum=0;
			for(int score : scores){
				sum+=score;
			}
			
			System.out.println("총합: " + sum);
			System.out.println("평균: " + (double)sum/scores.length);
			
			
	}
}


