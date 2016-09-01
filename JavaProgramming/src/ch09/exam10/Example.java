package ch09.exam10;

public class Example {

	public static void main(String[] args) {
		Parent p=new Parent(){};  // 클래스면 상속, {}이거를 붙히면 기존 생성자와는 다른얘기가 된다. {}이 안에는 자식클래스의 내용이담긴다. 이블록에서는 자식클래스의 객체를 만드는것까지 다한다
									//이 클래스를 상속하는 자식을 {}이렇게 정의를 하고 그 자식의 객체를 만들겠다는뜻
	}
	
	RemoteControl rc=new RemoteControl(){}; //인터페이스면 자식구현

}
