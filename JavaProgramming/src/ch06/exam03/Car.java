package ch06.exam03;

public class Car {    //이것은 설계도다. 이걸가지고 객체를 만들어야지만 필드나 메소드를 쓸수있다.
	//field, 자동차라면 이런 데이터들이있다. 뒤에 괄호없으면 field다.
	String company="현대자동차";
	
	//constructor, 자동차 객체를 만들때 반드시 이 생성자 사용해야해
	
	
	Car(){
		System.out.println("Car()실행됨");
		//Integer.parseInt("a");
	} //이 안에있는 내용의 실행이 성공적이면 객체가 만들어진다. 
	
	
	
	
	//Method 정의, 자동차라면 이런 기능이 있다
	void run(){
		System.out.println("run()실행됨");
				
	}
}
