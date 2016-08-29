package ch07.exam06.pack1;

public class B {
//필드
	/*A a;
	a=new A(); <-이건 실행문, 필드 선언과 동시에 값을주는건 괜찮아. 아래줄쓴거는 괜찮아*/
	A a=new A();

	
//생성자
	B(){
		A a=new A();
		a.field=10;
		a.method();
	}
	
	
//메소드
	void method(){
		A a=new A();
		
	}
}
