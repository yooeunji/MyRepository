package ch04.homework.Homework2; 

public class Homework2 { //Ŭ���� ����
	public static void main(String[] args) { //�޼ҵ� ����
		
		for(int i=1; i<=10; i++){ //int�� ���� i�� �����ϰ� 1���� 10���� 1�������ϸ鼭 �ݺ�
			for(int j=1; j<=10; j++){ //int�� ���� j�� �����ϰ� 1���� 10���� 1�������ϸ鼭 �ݺ�
				if((4*i)+(5*j)==60){ //���ǹ��� �����ϸ�
					System.out.println("(" + i +","+ j +")");		 //���			
				}
			}
		}
	}
}
