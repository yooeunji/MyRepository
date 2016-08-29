package ch07.exam05;

public class Machine {
	//Field

	
	//Constructor
	public void work(){
		System.out.println("Muchine-work()실행");
	}
	public final void PowerOn(){  //얘는 재정의도못해
		System.out.println("전원을 연결합니다.");
	}
	public final void PowerOff(){
		System.out.println("전원을 끊습니다.");
	}
	
	
	//Method

	
}
