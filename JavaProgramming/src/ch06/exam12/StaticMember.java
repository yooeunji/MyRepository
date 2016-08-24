package ch06.exam12;

public class StaticMember {
	//Static Field
	static String field;
	
	
	
	
	//Static constructor
	static{
		System.out.println("Static Block 실행");
		field="자바";
	}//적재가 된다면 이부분이 실행이 되어야한다
	//생성자는 메소드 영역에있는 필드를 초기화할떄 사용합니다.
	
	
	//Static constructor
	static void method(){
		
	}
}
