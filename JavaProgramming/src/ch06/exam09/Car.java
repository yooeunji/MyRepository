package ch06.exam09;

public class Car {  //이아이는 객체가 아니라 설계도얌
	
//Field
	int gas;
	
	
	
//constructor
	
	
	
	
	
//Method
	
	void setGas(int gas){
		
		this.gas=gas;
	}
	
	boolean isLeftGas(){
		if(gas==0){
			System.out.println("gas가 없습니다");
			return false;
		}
		else{ 
			System.out.println("gas가 없습니다");
			return true;
		}
	}
	void run(){
		while(true){
			if(gas>0){
				System.out.println("달립니다.(gas잔량 :"+gas+")");
				gas-=1;
			}else{
				System.out.println("멈춥니다.(gas잔량 :"+gas+")");
				//break;
				return; //리턴값이 필요없는데 while문(또는 메소드)를 빠져나가고싶을때  return을 쓸수있다. 
						//그대신 리턴혼자써, 그 바로 뒤에 리턴하는 값을 쓰면 안된다
			}
		}
	}
}

	