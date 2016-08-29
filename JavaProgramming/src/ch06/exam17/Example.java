package ch06.exam17;

public class Example {

	public static void main(String[] args) {
		Member m1=new Member("angel");
		//System.out.println(m1.mid);
		System.out.println(m1.getMid()); //프라이빗 필드값을 읽기위해 getter함수를 이용한다.
		//m1.height=170.2;
		//m1.height=-100; 키에는 음수가 없으니까 이런식으로 막바로 접근을 못하게한다. setter함수이용
		
	}

}
