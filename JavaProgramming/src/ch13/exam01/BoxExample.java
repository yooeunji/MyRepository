package ch13.exam01;

import java.util.Date;

public class BoxExample {

	public static void main(String[] args) {
		Box box1=new Box();
		
		box1.setItem("홍길동");
		String name=(String)box1.getItem();
		
		Box box2=new Box();
		box2.setItem(10); //Integer로 박싱이되어서 Integer번지가 setItem 매개변수로 넘어간다. Object는 참조니까 
		int value=(Integer)box2.getItem();
		
		Box box3=new Box();
		box3.setItem(new Date());
		Date now=(Date)box3.getItem();
		 //저장했던 타입을 제대로 알고있어야 캐스팅을 잘할수있는데 그러기도 번거롭고 일일이 캐스팅해주는것도 귀찮다 ->제네릭사용하까
	}

}
