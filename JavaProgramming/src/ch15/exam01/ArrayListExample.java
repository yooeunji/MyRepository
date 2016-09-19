package ch15.exam01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		//List 계열의 컬렉션 생성
		List<String> list=new ArrayList<>(); //타입 명시를 해줘야 경고표시 X, 타입명시 안해주면 List<Object> list=new ArrayList<Object>(); 처럼 받아들인다.
		
		//객체 저장
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("ibatis");
		list.add(null);
		
		int size=list.size();
		System.out.println("총 객체 수:"+size);
		
		String skill=list.get(2);
		System.out.println("2번 인덱스 객체 : "+skill);
		System.out.println();
		
		//전체 객체를 일괄 처리
		for(int i=0; i<list.size(); i++){
			String str=list.get(i);
			System.out.println(i+"번째 객체 : "+str);
		}
		System.out.println();
		
		for(String str : list){  //배열도 iterable<E>인터페이스를 구현한 객체기때문에 list 저 자리에 올수있는것!
			System.out.println(str);
		}
		System.out.println();
		
		//객체 삭제
		list.remove(2);  //2번인덱스 지우면 뒤에 객체들 한칸씩 앞으로 땡겨진다.
		list.remove(2);
		System.out.println("삭제 후 결과 : "+list);
		
		list.remove(new String("ibatis")); //17번객체와 번지가 다르다. 객체가 달라도 "ibatis"와 equals인 객체는 같이 삭제. 내부적으로 그렇다.
		System.out.println(list.size());   //2출력됨
		
		
		
	}

}
