package ch08.exam02;

public class Audio implements RemoteControl {// RemoteControl로 사용가능한 클래스 Audio를 선언
	@Override   //여기서는 재정의라기보다는 인터페이스에서 설명한내용이잘구현되어있는지 검사
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}


@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
	}


@Override
	public void SetVolume(int volume) {
		System.out.println("현재 Audio볼륨 : " +volume );
			
	}
}
