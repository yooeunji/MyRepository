package ch06.exam14;

public class Calculator3 {
	//Field

	final int field2; //아직 무슨값이 들어올지는 모르겠지만 들어오면 바꾸지않겟다
	

	
	//Constructor
	Calculator3(int num){
		this.field2=num;
	}
	
	
	//Method
	public static void main(String[] atgs){
		Calculator3 cal1=new Calculator3(5);
		Calculator3 cal2=new Calculator3(7);
		
	}
	
}
