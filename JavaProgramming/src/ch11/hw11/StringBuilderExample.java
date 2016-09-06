package ch11.hw11; //11장 확인문제 9번

public class StringBuilderExample {

	public static void main(String[] args) {
		String str= "";
		for(int i=1; i<=100; i++){
			str+=i;
		}
		System.out.println(str);
		
		//StringBuilder는 객체를 새로 만들지 않고도 문자열을 덧붙히는것이 가능하다! 
		StringBuilder sb=new StringBuilder();
		for(int i=1; i<=100; i++){
			sb.append(i);
		}
		System.out.println(sb);
	}
}
