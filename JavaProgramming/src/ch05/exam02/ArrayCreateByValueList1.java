package ch05.exam02;

public class ArrayCreateByValueList1 {

	public static void main(String[] args) {
		//how1
		int[] scores1={83, 90, 87};
		
	
	/*	int[] scores2;
		scores2={"83, 90, 87"}    �̰ǿ�����
		�迭�� �̷����ϹȾȵ� */
		
		//how2
		int[] scores2;
		scores2=new int[] {83, 90, 87};
		
		sum(new int[] {83, 90, 87});  //sum�� {83, 90,87} �̷� ���밡 �ƴ� new int[] {83, 90, 87} �̷������� �����ؾߵȴ�, �����̱׷�
		
	
	}
	
	public static void sum(int[] arr){  //�Ű������� �迭�� ����Ѵ�,,�̸� ���� ������ �س��� ���߿� �����ϴ°Ͱ� ����ϹǷ� how2�� ����ϴ�, 

	}

}
