package ch07.exam01;

public class DmbCellPhone extends CellPhone{
	//필드
	int channel;
	//생성자
	public DmbCellPhone(String model, String color, int channel){
		this.model=model;
		super.color=color;
		this.channel=channel;
	}
	//메소드
	void turnOnDmb(){
		System.out.println("채널"+channel+"번 DMB방송 수신을 시작합니다.");
	}
	void changeChannelDmb(int channel1){
		this.channel=channel1;
		System.out.println("채널"+channel+"번 으로 바꿉니다.");
	}
	void turnOffDmb(){
		System.out.println("DMB방송 수신을 멈춥니다");
	}
	
}
