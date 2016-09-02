package ch11.exam03;

public class Example {

	public static void main(String[] args) {
		Date d1=new Date();
		String d1Str=d1.toString();
		System.out.println(d1Str);
		System.out.println(d1); 
		String result=d1+"맑음"; //d1의 대표문자열을 얻어서 스트링과 결합
		System.out.println(result); 
		java.util.Date d2=new java.util.Date();
		String d2Str=d2.toString();
		System.out.println(d2Str);
	}

}
