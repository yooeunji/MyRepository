package ch15.exam02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		//Set계열 컬렉션 생성
		Set<String> set = new HashSet<String>();//Set인터페이스로 사용가능한 인터페이스 구현객체 생성
		
		//객체 저장
		set.add("Servet/JSP");
		set.add("Java");
		set.add("JDBC");
		set.add("Java"); //오류는 안나도 중복저장 못해, 추가해도 size그대로
		set.add("iBATIS");
		System.out.println(set.size());
		
		//객체를 일괄 처리하기
		Iterator<String> iterator=set.iterator();
		while(iterator.hasNext()){
			String str=iterator.next();
			if(str.equals("JDBC")){
				iterator.remove();
			}
			System.out.println(str);
		}
		System.out.println();
	
		for(String str: set){
			if(str.equals("JDBC")){
				iterator.remove();
			}
			System.out.println(str);
		}
	}
}
