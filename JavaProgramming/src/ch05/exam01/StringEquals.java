package ch05.exam01;

public class StringEquals {

	public static void main(String[] args) {
		String name1="자바";
		String name2="자바";
		String name3=new String("자바");

		System.out.println(name1 == name2);
		System.out.println(name1 == name3);//번지만 비교, 같은 객체를 가리키고있는지, 내용에는 관심이 없다
		
		System.out.println(name1.equals(name2));
		System.out.println(name1.equals(name3)); //객체 안에있는 문자열이 같은지 비교하는 메소드
	}

}
