package ch08.exam03;

public interface RemoteControl {
	//Constant
	int MAX_VOLUME=10;  //상수는 관례적으로 대문자!
	int MIN_VOLUME=0;   //상수는 선언할 때 반드시 초기값 대입
	
	
	
	
	//Abstract Method /객체가 있어야 사용할수있다
	void turnOn();
	void turnOff();
	void SetVolume(int volume);
	
	
	
	
	//Default Method
	default public void setMute(boolean mute){          //실행부를 가지고있지만 인터페이스만있으면 실행안돼, 객체를 가지고있어야한다.
		if(mute){
			System.out.println("무음처리합니다.");
		}
		else{
			System.out.println("무음헤제합니다.");
		}
	}
	
	
	
	//Static Method
	static void changeBattery(){
		System.out.println("건전지를 교환합니다");
	}
}
