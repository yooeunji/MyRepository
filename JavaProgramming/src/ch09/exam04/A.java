package ch09.exam04;

public class A {
	
	public A(){ //생성자가 실행될때 객체가 만들어지긴해,호출되기 전에 만들어진다. 근데 빈껍데기고 생성자가 끝날때 사용준비완료
		B b=new B();//객체를 사용 준비시키는건 생성자가 끝나고나서! 준비하다가 에러나면 객체가 만들어지긴햇어도 사용못해, 빈껍데기
	}
	public void method(){
		B b=new B();
	}
	
	static void method2(){
		//B b = new B();
	}
	//A객체를 없이도 사용할수있어야하는데
	
	
	public class B{	
		int field1;
		void method1(){};		
	}
}
