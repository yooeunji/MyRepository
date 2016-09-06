package ch11.hw11; //11장 확인문제 10번

import java.util.regex.Pattern;

public class PatternMatcherExample {

	public static void main(String[] args) {
		String id="5Angel1004";
		String regExp="\\[a-zA-Z]\\W+{8,12}"  ; //정규표현식
		boolean isMatch=Pattern.matches(regExp, id);
		if(isMatch){
			System.out.println("ID로 사용 할 수 있습니다.");
		}else{
			System.out.println("ID로 사용 할 수 없습니다.");
		}
	}
}
