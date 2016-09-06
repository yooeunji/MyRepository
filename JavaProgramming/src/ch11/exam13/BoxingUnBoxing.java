package ch11.exam13;

public class BoxingUnBoxing {

	public static void main(String[] args) {
		Integer obj=100; //100이라고하는 값을 Integer객체로 만들어 박싱을 하고 obj라고 하는 변수에 그 객체의주소를 대입한다.
		
		int value= obj; //번지를 변수에 대입하는게 아니라 , 그 번지수를 가진 래퍼 객체안의 값 100을 꺼내어서 대입한다. 라고 해석해야한다.	
		System.out.println(value);

		int result=obj+200;
		System.out.println(result);
	
	}

}
