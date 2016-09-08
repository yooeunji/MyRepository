package ch13.exam02;

import java.util.Date;

public class BoxExample {

	public static void main(String[] args) {
	
		Box<String> box1=new Box<>();   //String만 저장할수 있는 Box
		box1.setItem("홍길동");
		String name=box1.getItem();
		
		//Integer만 저장할수 있는 Box								
		Box<Integer> box2=new Box<>();   //T에 구체적인 타입을 지정안해주면 컴파일러는 T를 Object로 바꿔버린다.
		box2.setItem(10); //Integer로 박싱이되어서 Integer번지가 setItem 매개변수로 넘어간다. Object는 참조니까 
		int value=box2.getItem();
		
		Box<Date> box3=new Box<>(); //Date만 저장할수 있는 Box
		box3.setItem(new Date());
		Date now=box3.getItem();
		 //저장했던 타입을 제대로 알고있어야 캐스팅을 잘할수있는데 그러기도 번거롭고 일일이 캐스팅해주는것도 귀찮다 ->제네릭사용하까
	}

}
