package ch05.exam02;

public class ArrayCreateByValueList2 {

	public static void main(String[] args) {
		
		int[] scores={83, 90, 87};
		int sum=0;
		double avg=0.0;
		
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println(scores[2]);
		
		int arrayLength=scores.length; //괄호가안들어간것은 메소드가 아니라 필드,   반복문을 실행해야될때 배열에 몇개의 값이 들어가있는지 모를때 이 ㄷlength필드를 사용해주면 좋다
		System.out.println("배열의 길이는 : "+arrayLength);
	
	
		for(int i=0; i<scores.length; i++){
   
			sum+=scores[i];
		}
		System.out.println(sum);
		avg=(double) sum/scores.length;
		System.out.println(avg);
	
	}
}
