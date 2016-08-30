package ch07.exam13;

public abstract class Phone {   //중복된걸 모아놓은 클래스, 객체를 만들려는게아니다
	 public String number;
	 
	 public abstract void ring(); //메소드는 실행블록이있어야되는데 없네, abstract넣어서 추상 메소드로 만들면 공통적인 성질이라고 언급만해주고 코딩하지않아. 
	 							  //분명히 존재는하는데 내가 내용이뭔지 정해주는건 아니야. 자식들이 재정의를 해줘야한다.반드시
	 							  //추상 메소드가 있는 클래스는 무조건 추상클래스!
	 
	 public void sendVoice(){
		 System.out.println("음성을 전송합니다");
	 }
	 public void receiveVoice(){			
		 System.out.println("음성을 수신합니다");
	 }
	 
}
