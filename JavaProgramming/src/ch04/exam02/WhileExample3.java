package ch04.exam02;

public class WhileExample3 {

	public static void main(String[] args) throws Exception{

		System.out.println("프로그램 시작");
		
		while(true){	

			int num=System.in.read();
		
			if(num!=13&&num!=10&&num!=113){
				System.out.println("입력한 숫자는"+num);
			}
			
			else if(num==113){
				break;
			}
		}
		
		System.out.println("종료");
	}
}


/*
 

while(true){
	int num =System.in.read();
	if(num!=13){
		if(num!=10){
			System.out.println("입력한 숫자는"+num);
		}
	}
}*/

//선생님 코드
 /*
  int num=0;
 
  while(num!=113){
  	num=System.in.read();
  	
  	if(num!=13 && num!=10){
  		System.out.println("입력한 숫자는"+num);
  	}
  }
  
  System.out.println("종료");
 */
 


