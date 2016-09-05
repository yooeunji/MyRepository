package ch11.exam10;

import java.util.Arrays;

public class ArraySortExample2 {

	public static void main(String[] args) {
		int[] scores={99, 97, 98};
		Arrays.sort(scores);
		System.out.println(Arrays.toString(scores));
		
		Member3[] members={
				new Member3("홍길동", 99),
				new Member3("박동수", 97),
				new Member3("김민수", 98)
		};
		
		Arrays.sort(members); //compareTo는 우리가 호출하는것이아니라 sort가 사용하는것이다. 우리는 다만 어떻게 사용하라고 재정의 해줄뿐 크고작음을 음수와 0 양수로 리턴되게
		System.out.println(Arrays.toString(members));
	}
}

class Member3 implements Comparable{
	String name;
	int score;
	
	Member3(String name, int score){
		this.name=name;
		this.score=score;
	}
	
	@Override
	public int compareTo(Object o) {//비교할때쓰는 메소드 , 우리가쓰는건아니고..
		System.out.println("compareTo");
		Member3 target=(Member3) o;
		return score-target.score;   //역순으로 홍길동을 먼저빼고싶을땐 return target.name.compareTo(target.name);
	}
	@Override
	public String toString() {
		return name;
	}
	
}