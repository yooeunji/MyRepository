package ch04.exam03;

public class ContinueExample {

	public static void main(String[] args) throws Exception {
		//Ű����κ��� 1~3������ ��ȣ �̿��� ��ȣ�� �ԷµǸ� �ٽ� �Է��� �ϵ��� �ϼ���.
		
		while(true){
			int num=System.in.read();
			if(49>num || num>51)
				continue;				
			
			System.out.println(num);
		}
	
	}

}
