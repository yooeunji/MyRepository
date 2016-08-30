package ch07.exam07;

public class Example {

	public static void main(String[] args) {
		A a;
		a = new B();
		a = new C();

		B b = new B();
//		B b= new C();   <-컴파일 에러, 상속관계 아닐때는 타입변환 할수없다.
		
		
	}

}
