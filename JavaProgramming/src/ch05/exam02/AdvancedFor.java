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
		for(int score: scores){  //�ݺ��ض�, 
			sum+=score;
		}
		System.out.println(sum);
		
		String[] names={"�ڹ�", "c���", "���̽�"};
		
		for(int i=0; i<names.length; i++){
			System.out.println(names[i]);
		}
		for(String name: names){  //�ݺ��ض�, 
			System.out.println(name);
		}
		
	}

}
