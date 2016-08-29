package ch06.exam12;

public class StaticMember2 {
	//Static Field
	static String field;
	String field2;
	
	
	
	//Static constructor
	static{
		System.out.println("Static Block 실행");
		field="자바";
		//field2="자바"; <-필드 초기화 불가능, 객체가 없어서
	}//적재가 된다면 이부분이 실행이 되어야한다
	//생성자는 메소드 영역에있는 필드를 초기화할떄 사용합니다.
	
	
	//Static constructor
	static void method(){
		field="자바";
		//field2="자바"; 이것도 불가능
	}
	void method2(){
		field="자바";
		field2="자바";
	}
	
	public static void main(String[] args){
		field="자바";
		//field2="자바"; 
		
		method();
		//method2();
	
		StaticMember2 sm=new StaticMember2();
		sm.field2="자바";
		sm.method2();
	}
	
}
