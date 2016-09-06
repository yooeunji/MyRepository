package ch11.hw11; //11장 확인문제 4번

public class Member {
	private String id;
	private String name;
	
	public Member(String id, String name){
		this.id=id;
		this.name=name;
	}
	@Override
	public String toString() { //toString의 재정의
		return id+":"+name;
	}
	
}
