package ch11.hw11; //11장 확인문제 12번

public class StringConvertExample {

	public static void main(String[] args) {
		String strData1="200";
		int intData1=Integer.parseInt(strData1); //문자열을 정수로
		System.out.println(intData1);
		
		int intData2=150;
		String strData2=String.valueOf(intData2);  //숫자를 문자열로
		System.out.println(intData2);
	}

}
