package ch05.exam02;

public class ArrayCreateByValueList2 {

	public static void main(String[] args) {
		
		int[] scores={83, 90, 87};
		int sum=0;
		double avg=0.0;
		
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println(scores[2]);
		
		int arrayLength=scores.length; //��ȣ���ȵ����� �޼ҵ尡 �ƴ϶� �ʵ�,   �ݺ����� �����ؾߵɶ� �迭�� ��� ���� ���ִ��� �𸦶� �� ��length�ʵ带 ������ָ� ����
		System.out.println("�迭�� ���̴� : "+arrayLength);
	
	
		for(int i=0; i<scores.length; i++){
   
			sum+=scores[i];
		}
		System.out.println(sum);
		avg=(double) sum/scores.length;
		System.out.println(avg);
	
	}
}
