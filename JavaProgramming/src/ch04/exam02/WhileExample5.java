package ch04.exam02;

public class WhileExample5 {

	public static void main(String[] args) throws Exception{
		
		boolean run=true;
		int speed =0;
		int keyCode=0;
		
		while(run){
			if(keyCode !=13 && keyCode !=10){
				System.out.println("----------");
				System.out.println("1.증속 | 2.감속 | 3.멈춤");
				System.out.println("----------");
				System.out.print("선택");
			}
		
			keyCode=System.in.read();
			
			System.out.println();
			
			if(keyCode==49){
				System.out.println("1을 눌렀음");
				speed++;
				System.out.println("현재속도: "+speed);
			
			}else if(keyCode==50){
				System.out.println("2를 눌렀음");
				speed--;
				System.out.println("현재속도: "+speed);
		
			}else if(keyCode==51){
				System.out.println("3을 눌렀음");
				System.out.println("종료");
				run=false;
			}
			
		}		
	}
}


