package ch05.exam02;

public class MainArgument {

	public static void main(String[] args) {
		//java MainArgument 3 4
		String v1=args[0]; //"3"
		String v2=args[1]; //"4"
		
		int intv1 = Integer.parseInt(v1);
		int intv2 = Integer.parseInt(v2);
		int result=intv1+intv2;
		//String result =v1+v2; //산술연산이아닌 문자열 결합
		System.out.println("result="+result);
		
		

	}

}
