package ch07.exam01;

public class Machine {
	//Field
	public String kind;
	public String maker;
	
	
	//Constructor
	public Machine(){
		System.out.println("Machine()실행됨");
	}
	
	
	
	//Method
	public void turnOn(){          //powerOn을 turnOn으로 바꾸고싶을때 통일감있게 바꾸고싶으면 상속이 편하겠다.
		System.out.println(maker + ":" + kind+"파워온");
	}
	public void turnOff(){
		System.out.println(maker + ":" + kind+"파워오프");
	}
	
}
