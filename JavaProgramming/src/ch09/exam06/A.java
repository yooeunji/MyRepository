package ch09.exam06;

public class A {//실행순서 즁요치않아
	
	int field=10;

	public void method(){ //실행순서 중요
		final int local=10;
		class B{                             //nested의 local클래스, 실행순서중요
			                               //field1=5; 클래스에는 실행문올수없다. 선언문밖에못와
			void method(){		
				field=5;
				//local=5; final때매 값 변경못해
				int result=local+field; //읽는건 가능
				
			}
		}

		B b = new B();
	}
	
		
}
