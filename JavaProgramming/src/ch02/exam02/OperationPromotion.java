package ch02.exam02;

public class OperationPromotion {

	public static void main(String[] args) {
		
		int v1=10+20;
		System.out.println("v1:" +v1);
		
		byte v2=10;
		byte v3=20;
		int v5=v2+v3;
		//int v4=v2+v3;
		System.out.println("v5:" +v5);
		
		
		//int������ Ÿ�� ������ ��� intŸ����������ȴ�, byte, char, short, int Ÿ�� ��� ��� ����ϵ�
		//long�� �ٸ� ������� �������� ū long���� Ÿ���� �ٲ� ���ȴ�.����� long
		
		char v6='A';
		char v7=(char)(v6+1); //��ȣ�� �� ���� ��� ���� �ǰ� ���ش�. 
		System.out.println("v7:" +v7);
		
 
		
	}

}
