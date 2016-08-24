package ch06.exam12;

public class Example {

	public static void main(String[] args) {
		//Instan ce Member 사용
		InstanceMember im=new InstanceMember();
		System.out.println(im.field);
		im.field ="자바";
		im.method();
		
		//Static Member 사용
		//클래스이름가지고 막바로 접근한다
	//	StaticMember.field="자바";
		System.out.println(StaticMember.field);
		StaticMember.method();
	//	StaticMember sm= new StaticMember();
		
	}

}
