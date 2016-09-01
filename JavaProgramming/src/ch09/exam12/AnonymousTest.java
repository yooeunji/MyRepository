package ch09.exam12;

public class AnonymousTest {
	//필드
	private RemoteControl rc=new RemoteControl(){}; //인터페이스를 사용하는 클래스를 선언하고 그 클래스의 객체를 만들어서 RemoteControl에 대입했다
	
	//생성자
	public AnonymousTest(){  
		RemoteControl rc=new RemoteControl(){};
	}//로컬변수도 초기화 할수있다.
	
	
	
	//메소드
	public void method1(RemoteControl rc){
		
	}
	public void method2(){
		method1(new RemoteControl(){});
	}
		
}
