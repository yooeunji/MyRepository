package ch05.exam02;

public class ArrayInArray {

	public static void main(String[] args) {
		int[][] scores = new int[2][3];
		System.out.println(scores.length); //scores가 참조하는 길이 : 2
		System.out.println(scores[0].length); //scores[0]이 참조하는 길이 : 3
		System.out.println(scores[1].length); //scores[0]이 참조하는 길이 : 3
		
		System.out.println("항목값 접근");
		
		System.out.println(scores[0][0]);
		System.out.println(scores[0][1]);
		System.out.println(scores[0][2]);
		
		System.out.println(scores[1][0]);
		System.out.println(scores[1][1]);
		System.out.println(scores[1][2]);
	
		
		System.out.println("for문 이용");
		for(int i1=0; i1<scores.length; i1++){
			for(int i2=0; i2<scores[i1].length; i2++){
				System.out.println(scores[i1][i2]);
			}
		}
		
		System.out.println("값 변경");
		
		
		scores[0][0]=50;	
		System.out.println(scores[0][0]);
		System.out.println(scores[0][1]);
		System.out.println(scores[0][2]);
		
		System.out.println(scores[1][0]);
		System.out.println(scores[1][1]);
		System.out.println(scores[1][2]);
		

	}

}
