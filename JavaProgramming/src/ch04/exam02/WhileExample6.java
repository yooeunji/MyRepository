package ch04.exam02;

public class WhileExample6 {

	public static void main(String[] args) throws Exception{
	
		
		boolean run=true;
		int money =0;
		int keyCode=0;
		
		while(run){
			if(keyCode !=13 && keyCode !=10){
				System.out.println("----------");
				System.out.println("1.예금 | 2.출금 | 3.종료");
				System.out.println("----------");
				System.out.print("선택 : ");
			}
		
			keyCode=System.in.read();
			
			if(keyCode==49){
				System.out.println("1000원씩 예금액을 증가");
				money+=1000;
				System.out.println("현재잔액: "+money+"원");
			
			}else if(keyCode==50){
				System.out.println("500원씩 예금액을 감소");
				money-=500;
				System.out.println("현재잔액: "+money+"원");
		
			}else if(keyCode==51){
				System.out.println("프로그램 종료");
				run=false;
			}
	}

}
}
