package ch04.exam02;

public class WhileExample5 {

	public static void main(String[] args) throws Exception{
		
		boolean run=true;
		int speed =0;
		int keyCode=0;
		
		while(run){
			if(keyCode !=13 && keyCode !=10){
				System.out.println("----------");
				System.out.println("1.���� | 2.���� | 3.����");
				System.out.println("----------");
				System.out.print("����");
			}
		
			keyCode=System.in.read();
			
			System.out.println();
			
			if(keyCode==49){
				System.out.println("1�� ������");
				speed++;
				System.out.println("����ӵ�: "+speed);
			
			}else if(keyCode==50){
				System.out.println("2�� ������");
				speed--;
				System.out.println("����ӵ�: "+speed);
		
			}else if(keyCode==51){
				System.out.println("3�� ������");
				System.out.println("����");
				run=false;
			}
			
		}		
	}
}


