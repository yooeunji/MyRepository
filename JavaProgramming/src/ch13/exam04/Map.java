package ch13.exam04;

public interface Map <K, V> { //아직 타입 결정을 안했다, 제네릭 인터페이스
	void add(K k, V v); //제네릭 메소드
	V get(K k);
	
}
