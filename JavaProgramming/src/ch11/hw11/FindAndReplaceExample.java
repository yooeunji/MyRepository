package ch11.hw11; //11장 확인문제 7번

public class FindAndReplaceExample {

	public static void main(String[] args) {
		String str="모든 프로그램은 자바 언어로 개발될 수 있다.";
		int index=str.indexOf("자바"); //문자열 찾기, 문자열이 시작되는 index를 넘겨줍니다.
		if(index==-1){ //index가 -1이면 string에 찾는 문자열이 없다는 소리입니다.
			System.out.println("자바 문자열이 포함되어 있지 않습니다.");
		}else{
			System.out.println("자바 문자열이 포함되어 있습니다.");
			str=str.replace("자바", "JAVA"); //책에서는 변수를 새로 선언해서 받았기때문에 새로 생성된 문자열을 참조한다고 나와있는데 이건 그럼 새로생성되는게 아니라 덮어씌우는 건가요?
			System.out.println("->"+str);
		}
	}
}
