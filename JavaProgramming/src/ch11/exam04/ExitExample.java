package ch11.exam04;

public class ExitExample {

	public static void main(String[] args) {
		
		System.setSecurityManager(new SecurityManager(){
			@Override
			public void checkExit(int status) {
				if(status!=5){
					throw new SecurityException();  //Runtimeexception 트라이캐치없어도된당
				}
				System.out.println("나죽네~");
			} //예외 발생하면 프로그램이 죽기마련인데 trycatch해주면 예외처리 들어가서 안죽어. 
		});
		
		for(int i=0; i<10; i++){
			System.out.println(i);
			try{
			System.exit(i);
			}catch(SecurityException e){}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*for(int i=0; i<10; i++){
			System.out.println(i);
			if(i==5){
				System.exit(0); //프로세스를 종료해라, 0이냐 1이냐 2냐에 따라 프로세스가 종료하긴하지만 값에따라서 프로그램을 종료시킬지 말지 한번더 기회를 주겠다는 의미
				//break;   <-for문을 빠져나가라 
				return;
			}
		}
		System.out.println("내가 출력될까요??????");
	}
	public static void method(int x){
		if(x==5){
			return; //메소드를 실행하지마라
		}*/
	
	}
}
