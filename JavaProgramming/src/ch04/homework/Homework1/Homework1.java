package ch04.homework.Homework1;

public class Homework1 { //Ŭ���� ����

	public static void main(String[] args) { //�޼ҵ� ����
		
		for(int i=1; i<=100; i++){   //������ 100�� �ݺ�
			int num1 =(int)(Math.random()*6)+1;  //ù��° �ֻ������� ���ü� �ִ� ���� ���� num1�� ����
			int num2 =(int)(Math.random()*6)+1;  //�ι�° �ֻ������� ���ü� �ִ� ���� ���� num2�� ����
			
			if(num1+num2==10){ //���� ���� 10�̸�
				System.out.println("(" + num1 +"," +num2 + ")"); //���
			}
		}
	}
}