package ch11.exam10;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVal1="홍길동";
		String strVal2=new String("홍길동");
		
		
		System.out.println(strVal1==strVal2);//문자열에서는 같은 문자냐를 묻고 참조타입일때는 번지수비교
		System.out.println(strVal1.equals(strVal2));
	}

}
