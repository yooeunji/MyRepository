package ch07.exam02;

public class CellPhone {
	String model;
	String color;
	
	public CellPhone(String model, String color){	//우리가 생성자 만들어주면 컴파일러가 기본생성자를 안만든다.
		this.model=model;
		this.color=color;
	}
	
	void powerOn(){
		System.out.println("전원켭니다");
	}
	void powerOff(){
		System.out.println("전원끕니다");
	}
	void bell(){
		System.out.println("벨이 울립니다");
	}
	void sendVoice(String message){
		System.out.println("자기 :"+message);
	}
	void receiveVoice(String message){
		System.out.println("상대방 :"+message);
	}
	void hangUp(){
		System.out.println("전화 끊습니다");
	}
}
