package ch13.exam07;

public class Util {
	public static <T extends Number> int compare(T t1, T t2){ //숫자화 할수없는 객체가 들어올때 나는 수치만 비교하고싶을때 T extends Number (Number를 상속받는 T)
		double v1=t1.doubleValue();
		double v2=t2.doubleValue();
		
		return Double.compare(v1, v2);  //v1이 적으면 음수를 , 크면 양수를 리턴

	}
	
}
