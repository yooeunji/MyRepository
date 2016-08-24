package ch06.exam07;

public class Board {
	//Field
	int no;
	String title;
	String content;
	String writer;
	int hitcount;
	
	//Constructor Overloading  생성자 오버로딩: 매개변수 수가 다르거나 타입이 달라야한다
	Board(){}
	Board(int no){}
	//Board(int hitcount){} 불가능 오버로딩 조건에 위배
	Board(int no, String content){}
	Board(String content, int no){}
	Board(int no, String content, String writer){}
	Board(int no, String content, String writer, int hitcount){}
	
	
	
	//Method
	
}
