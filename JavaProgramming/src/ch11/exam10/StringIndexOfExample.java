package ch11.exam10;

public class StringIndexOfExample {

	public static void main(String[] args) {
		String subject="자바 프로그래밍 자바 핵심";
		
		boolean result1=subject.contains("자바");
		if(result1){
			System.out.println("자바 관련 책이군요");
		}else{
			System.out.println("자바와 관련없는 책이군요");
		}
		
		int result2=subject.indexOf("자바");
		if(result2 != -1){   //문자열에서 "자바"없으면 -1 리턴
			System.out.println("자바 관련 책이군요");
		}else{
			System.out.println("자바 관련 없는 책이군요");
		}
		
		int startIndex=subject.indexOf("자바");   //0부터해서 2번째 이전까지 출력
		int endIndex=startIndex+2;
		String token1=subject.substring(startIndex, endIndex);
		System.out.println(token1);
	
		String find="프로그래밍";
		startIndex=subject.indexOf("프로그래밍");
		endIndex=startIndex+find.length();
		String token2=subject.substring(startIndex, endIndex);
		String token3=subject.substring(startIndex);
		System.out.println(token2);
		System.out.println(token3);
		
	}
}
