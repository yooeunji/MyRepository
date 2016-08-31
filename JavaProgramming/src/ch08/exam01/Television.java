package ch08.exam01;

public class Television implements RemoteControl {
@Override   //여기서는 재정의라기보다는 인터페이스에서 설명한내용이잘구현되어있는지 검사
	public void turnOn() {
		System.out.println("Tv를 켭니다.");
	}


@Override
	public void turnOff() {
		System.out.println("Tv를 끕니다.");
	}


@Override
	public void SetVolume(int volume) {
		System.out.println("현재 tv볼륨 : " + volume);
			
	}

}
