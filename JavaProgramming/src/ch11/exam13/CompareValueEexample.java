package ch11.exam13;

public class CompareValueEexample {

	public static void main(String[] args) {
		Integer obj1=500;
		Integer obj2=500;
		
		System.out.println(obj1==obj2);   //같은 객체니~?
		
		System.out.println(obj1.intValue()==obj2.intValue());  //박스 안 내용이 같니?
		
		Integer obj3=100;
		Integer obj4=100;
		System.out.println(obj3==obj4); //가능하면 값을 비교할때 이렇게 쓰지말고 이건 어쩔땐 true고 어쩔땐 false이렇게 나온다.-128 ~ 127사이는 true로 나온다.
		System.out.println(obj3.intValue()==obj4.intValue());  //이렇게쓰자 
		System.out.println(obj3.equals(obj4));   //값만 비교할수있도록 Integer에서 equals를 재정의했다.
	
	}

}
