package ch09.exam06;

public class Example {

	public static void main(String[] args) {
		//A.B b= new A.B(); 이렇게 한꺼번에 만들수 없다. A먼저 만들고 그러고 B 접근!
		//외부에서 b에 접근 못해, 사용도못함, A 내부 메소드 안에서만 사용가능하다
		A a=new A();
		a.method();
	}

}
