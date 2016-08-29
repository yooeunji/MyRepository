package ch06.exam16.pack1;

public class A {
	//Field
	private int field1;
	int field2;  //private과 public의 중간, 같은 패키지에서만 사용가능, pack1 내부에서만
	public int field3; //패키지가 다르더라도 사용가능
	
	
	//Constructor
	
	private A(){}
	A(int field1){}
	public A(int field1, int field2){}
	
	//Method
	private void method1(){
		
	}
	void method2(){
		
	}
	public void method3(){
	
	}
}
