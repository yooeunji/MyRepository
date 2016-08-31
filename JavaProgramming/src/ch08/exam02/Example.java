package ch08.exam02;


public class Example { 
	public static void powerOn(RemoteControl rc){ //인터페이스를 사용가능한 객체가매개변수로 대입된다. (다형성)이 돋보인당
		rc.turnOn();							  //뭘 대입하냐에따라 티비의turnOn가 실행되거나 라디오의 turnOn이 실행된다
	}

	public static void main(String[] args) {
		int max=RemoteControl.MAX_VOLUME;
		int min=RemoteControl.MIN_VOLUME;
		
		//RemoteControl.turnOn(); 사용못해 객체있어야돼
		//RemoteControl.SetMute(true); 얘도
		
		RemoteControl.changeBattery();
		
		Television tv = new Television();
		tv.turnOn();  //객체로 바로 실행 
		
		RemoteControl rc=tv;
		rc.turnOn();  //인터페이스이용, 인터페이스가 tureOn의 코드를 가지고있지않아. (다형성)이 돋보인당
		
		Audio audio=new Audio();
		rc=audio;
		rc.turnOn();
		
		
		
		

	}
}
