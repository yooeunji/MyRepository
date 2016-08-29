package ch06.exam14;

public class SingleTon {
	private static SingleTon singleton=new SingleTon();
	
	private SingleTon() {}
	
	static SingleTon getInstance(){
		return singleton;
	}
	
}
