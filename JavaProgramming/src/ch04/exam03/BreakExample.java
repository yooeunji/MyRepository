package ch04.exam03;

public class BreakExample {
	//�ֻ����� ���� 6�̳����� ���α׷��� �����ϼ���.
	public static void main(String[] args){
		while(true){
			
			int num=(int)(Math.random()*6)+1;	
			if(num==6){
				System.out.println("6�������Ƿ� ����");
				break;
			}
			else
				System.out.println(num);
		}
	}
}
//continue;�� �Ʒ��� ������������ �ٽ� �ö󰡼� �ݺ��ض�