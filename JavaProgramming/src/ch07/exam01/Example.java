package ch07.exam01;

public class Example {

	public static void main(String[] args) {
		Car car=new Car();
		car.kind="승용차";
		car.maker="현대자동차"; //부모의 kind, maker를 이렇게 바꿧다.
		
		Car car2=new Car();
		car2.kind="트럭";
		car2.maker="기아자동차"; //이때는 또 부모의 kind, maker를 이렇게바꿨다.
		
	/*	car.turnOn();//현실세계는 부모가 하나 자식이 여럿, 자식이 부모의 
		car.turnOff();
		
		car2.turnOn();
		car2.turnOff();*/

	}

}
