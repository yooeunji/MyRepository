package ch07.exam03;

public class Robot extends Machine{
	
	@Override    //Ctlr + space
	public void work() {
		System.out.println("Robot-work()실행");
	}
	
	
	
	
	/*@Override //이 annotation 아래에 적용한다, 아래쓴것이 제대로 한 재정의가 맞는지 확인해줌, 컴파일러한테 시켜
	public void work(){ //접근제한이 좁은곳에서 넓은곳으로 가는건 괜찮다. 
						//부모가 퍼블릭이면 자식도 반드시 퍼블릭일수밖에없다.
		                //근데 부모가 퍼블릭이아니라 디폴트(void)면 자식은 재정의를 void아니면 public으로 할수있다
		System.out.println("Robot-work()실행");
	}*/

}
