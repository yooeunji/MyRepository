package ch04.exam02;

public class WhileExample3 {

	public static void main(String[] args) throws Exception{

		System.out.println("���α׷� ����");
		
		while(true){	

			int num=System.in.read();
		
			if(num!=13&&num!=10&&num!=113){
				System.out.println("�Է��� ���ڴ�"+num);
			}
			
			else if(num==113){
				break;
			}
		}
		
		System.out.println("����");
	}
}


/*
 

while(true){
	int num =System.in.read();
	if(num!=13){
		if(num!=10){
			System.out.println("�Է��� ���ڴ�"+num);
		}
	}
}*/

//������ �ڵ�
 /*
  int num=0;
 
  while(num!=113){
  	num=System.in.read();
  	
  	if(num!=13 && num!=10){
  		System.out.println("�Է��� ���ڴ�"+num);
  	}
  }
  
  System.out.println("����");
 */
 


