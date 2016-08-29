package ch07.exam06.pack1;

public class A {	
	//필드
	protected int field;  //상속을 배제했다면 default와 같다, default는 같은 패키지내에서 사용   default+자식 ->자식이라면 다른패키지여도 상관없다, 디폴트처럼 쓸수있다.
	
	protected A() {}
	
	protected void method(){} //상속의 대상이된다, 필드랑 메소드는, 다른패키지일지언정
}
