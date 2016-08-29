package ch07.exam02;

public class DmbCellPhone extends CellPhone{
	//필드
	int channel;
	
	
	//생성자
	public DmbCellPhone(String model, String color, int channel){
		super(model, color);   //직접 안써도돼 생략되어 있을뿐, 부모의 생성자야, 
	/*	this.model=model;
		super.color=color;   이 주석은 super(model, color);얘와 같다 */
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
