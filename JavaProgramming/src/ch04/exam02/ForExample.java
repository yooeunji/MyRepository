package ch04.exam02;

public class ForExample {

	public static void main(String[] args) {
		
		double sum=0;
		
		for(int i=1; i<=3; i++){
				int p= (int)(Math.random()*6)+1;
				System.out.println(i+"��° ���¼� : "+p);
				sum+=p;
		}
		
		System.out.println("�� : "+sum);
		
		sum=sum/3;
		System.out.println("������ : "+sum);
		
	}//for���� ���ǿ� ���������� �ѹ��� ���� ���Ҽ��ִ�.	
}


