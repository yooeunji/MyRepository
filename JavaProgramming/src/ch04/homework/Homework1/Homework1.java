package ch04.homework.Homework1;

public class Homework1 {

	public static void main(String[] args) {
		
		for(int i=1; i<=100; i++){
			int num1 =(int)(Math.random()*6)+1;
			int num2 =(int)(Math.random()*6)+1;
			
			if(num1+num2==10){
				System.out.println("(" + num1 +"," +num2 + ")");
			}
		}
}
}