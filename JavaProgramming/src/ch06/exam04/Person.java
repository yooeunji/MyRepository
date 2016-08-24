package ch06.exam04;

public class Person {
	
	//Field
	String name;
	String sex;
	int age;
	double height;
	boolean married;
	
	//Construct	, 생성자의 매개값으로 받아서 객체를 생성할때 데이터가 저장될수있도록
	Person(String name, String sex, int age, double height){ //생성자에 매개변수를 넣어주면 
					   //생성자를 호출할때 값을 줘야 호출할수있도록, 이 생성자는 값을 받아서 필드를 초기화한다 라고 얘기할수있다
		this.name=name;  
		this.sex=sex;//가장 가까운 변수를 쓰게되어있다. 
					//그러므로 왼쪽의 name을 필드값의 name이아닌 매개변수라 생각해버린다.
		this.age=age;
		this.height=height;
	}//this.name 은 나의 객체 내 필드의 name을 가리킨다
	
}
