package ch07.exam06.pack2;

import ch07.exam06.pack1.A;

public class D extends A{
	//A a=new A(); 에러나는 이유는 상속과 관련있는 코드가 아니다. 

	D(){
		/*A a=new A(); 이것도 마찬가지다
		  a.field=5;
		  a.method();		*/
		  super(); //<-protected가 적용되어도 상속하면 부모의 생성자 이것이 생략되지만 허용된다 
		  field =5;
		  method();
	}

	
}
