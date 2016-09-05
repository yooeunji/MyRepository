package ch11.exam10;

public class StringBuildExample {

	public static void main(String[] args) {
		String data="a"; //String은 내부의 문자를 바꿀수없다.  //java5이상에서는 성능상 괜찮아, java4이하처럼 객체 계속 생기는거 아니당
		data+="b";
		data+="c";
		System.out.println(data);
		
		StringBuilder sb=new StringBuilder();
		sb.append("a");
		sb.append("b");
		sb.append("c");
		System.out.println(sb);

		String data2="abc";
		StringBuilder sb2=new StringBuilder(data2);
		sb2.insert(1, "0");
		data2=sb2.toString(); //sb2는 string이 아니다.
		System.out.println(data2);
	}

}

