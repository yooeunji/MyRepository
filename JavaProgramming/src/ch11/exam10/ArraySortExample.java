package ch11.exam10;

import java.util.Arrays;

public class ArraySortExample {

	public static void main(String[] args) {
		int[] scores={99, 97, 98};
		Arrays.sort(scores);
		System.out.println(Arrays.toString(scores));
		
		Member2[] members={
				new Member2("홍길동"),
				new Member2("박동수"),
				new Member2("김민수")
		};
		
		Arrays.sort(members);
		System.out.println(Arrays.toString(members));
	}
}

class Member2 implements Comparable{
	String name;
	Member2(String name){
		this.name=name;
	}
	
	@Override
	public int compareTo(Object o) {//비교할때쓰는 메소드 , 우리가쓰는건아니고..
		Member2 target=(Member2) o;
		return name.compareTo(target.name);   //역순으로 홍길동을 먼저빼고싶을땐 return target.name.compareTo(target.name);
	}
	@Override
	public String toString() {
		return name;
	}
	
}