package ch06.exam08;

public class MathExample {

	public static void main(String[] args) {
		Math math = new Math();
		math.printInfo("수학 객체가 생성됨");
		
		int result=math.max(7,  5);
		System.out.println(result);
		
		math.max(7,  5); //이렇게 쓰는것도가능하다 다만 리턴값을 받지않겠다
		
		int[] values = {10, 20, 30, 40, 50};
		double result1 = math.avg1(values);
		System.out.println(result1);
		
		double result2 = math.avg2(10, 20, 30, 40, 50); //배열로 넣지말고 값목록으로 넣는다
		System.out.println(result2);
		// 호출하기 더 편리하다
		
		
		
	}

}
