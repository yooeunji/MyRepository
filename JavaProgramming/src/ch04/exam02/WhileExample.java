package ch04.exam02;

public class WhileExample {

	public static void main(String[] args) throws Exception{
		int i=1;
		
		while(i<=10){
			System.out.println("�ݺ�������...");
			Thread.sleep(1000);//1���ֱ�� �ݺ��ϰ������
			i++;
		}

	}

}
