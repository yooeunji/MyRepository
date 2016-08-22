package ch05.exam02;

public class AdvancedFor {

	public static void main(String[] args) {
		
		int[] scores={90, 92, 95};
		 
		int sum=0;
		for(int i=0; i<scores.length; i++){
			sum+=scores[i];	
		}
		System.out.println(sum);
		
		
		sum=0;
		for(int score: scores){  //반복해라, 
			sum+=score;
		}
		System.out.println(sum);
		
		String[] names={"자바", "c언어", "파이썬"};
		
		for(int i=0; i<names.length; i++){
			System.out.println(names[i]);
		}
		for(String name: names){  //반복해라, 
			System.out.println(name);
		}
		
	}

}
