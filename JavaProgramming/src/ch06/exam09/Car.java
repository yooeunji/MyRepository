package ch06.exam09;

public class Car {  //�̾��̴� ��ü�� �ƴ϶� ���赵��
	
//Field
	int gas;
	
	
	
//constructor
	
	
	
	
	
//Method
	
	void setGas(int gas){
		
		this.gas=gas;
	}
	
	boolean isLeftGas(){
		if(gas==0){
			System.out.println("gas�� �����ϴ�");
			return false;
		}
		else{ 
			System.out.println("gas�� �����ϴ�");
			return true;
		}
	}
	void run(){
		while(true){
			if(gas>0){
				System.out.println("�޸��ϴ�.(gas�ܷ� :"+gas+")");
				gas-=1;
			}else{
				System.out.println("����ϴ�.(gas�ܷ� :"+gas+")");
				//break;
				return; //���ϰ��� �ʿ���µ� while��(�Ǵ� �޼ҵ�)�� ���������������  return�� �����ִ�. 
						//�״�� ����ȥ�ڽ�, �� �ٷ� �ڿ� �����ϴ� ���� ���� �ȵȴ�
			}
		}
	}
}

	