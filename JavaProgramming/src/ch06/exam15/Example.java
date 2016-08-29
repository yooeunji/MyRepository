package ch06.exam15;

import ch06.exam15.pack1.*; //*는 그 앞에 써진 패키지 내의 모든 클래스를 사용해도 된다는 뜻
import ch06.exam15.pack2.*;

public class Example {

	public static void main(String[] args) {
		A a=new A();  
		B b=new B();
		ch06.exam15.pack1.C c=new ch06.exam15.pack1.C();
	}

}
