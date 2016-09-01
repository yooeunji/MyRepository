package ch09.exam04;

public class Example {

	public static void main(String[] args) {
		//A.B b= new A.B(); 이렇게 한꺼번에 만들수 없다. A먼저 만들고 그러고 B 접근!
		A a=new A();
		A.B b=a.new B();
		b.field1=10;
		b.method1();
	}

}
