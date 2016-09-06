package ch11.hw11; //11장 확인문제 4번

public class MemberExample {

	public static void main(String[] args) {
		
		Member member=new Member("blue", "이파란");
		System.out.println(member);
	} //여기에서 toString의 호출이 없었는데 toString을 호출한것처럼 출력이되는것이 신기합니다. 아 책에 나와있네요 466p
}//매개값으로 객체를 주면 객체의 toString()메소드를 자동호출해서 리턴값을 받아 출력하도록 되어있습니다
