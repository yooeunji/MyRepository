package ch15.exam03;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		//Map 계열 컬렉션 생성
		Map<String, Integer> map=new HashMap<>(); //HashTable넣어도 된당 같은 맵계열이라..
		
		//엔트리 추가
		map.put("홍길동", 85);
		map.put("유은지", 90);
		map.put("홍길동", 95);
		map.put("감자바", 81);
		
		//객체 값 얻기
		System.out.println(map.size());
		int score=map.get("홍길동");
		System.out.println(score);
	
		//모든 entry일괄처리
		Set<Entry<String, Integer>> set=map.entrySet();
		for(Entry<String, Integer> entry:set){
			String key=entry.getKey();
			int value=entry.getValue();
			System.out.println(key+ ":" +value);
		}
		System.out.println();
		
		Set<String> set2=map.keySet();
		for(String key : set2){
			int value=map.get(key);
			System.out.println(key+":"+value);
		}
		System.out.println();
		
		//객체 삭제
		map.remove("홍길동");  //홍길동의 Entry자체가 삭제됨
		Set<String> set3=map.keySet();
		for(String key : set3){
			int value=map.get(key);
			System.out.println(key+":"+value);
		}
		System.out.println();
		
		
	
	}
	

}
