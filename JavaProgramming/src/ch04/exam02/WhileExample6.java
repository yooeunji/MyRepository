package ch04.exam02;

public class WhileExample6 {

	public static void main(String[] args) throws Exception{
	
		
		boolean run=true;
		int money =0;
		int keyCode=0;
		
		while(run){
			if(keyCode !=13 && keyCode !=10){
				System.out.println("----------");
				System.out.println("1.���� | 2.��� | 3.����");
				System.out.println("----------");
				System.out.print("���� : ");
			}
		
			keyCode=System.in.read();
			
			if(keyCode==49){
				System.out.println("1000���� ���ݾ��� ����");
				money+=1000;
				System.out.println("�����ܾ�: "+money+"��");
			
			}else if(keyCode==50){
				System.out.println("500���� ���ݾ��� ����");
				money-=500;
				System.out.println("�����ܾ�: "+money+"��");
		
			}else if(keyCode==51){
				System.out.println("���α׷� ����");
				run=false;
			}
	}

}
}
