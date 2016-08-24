package ch06.exam06;

public class Board {
	//Field
	int no;
	String title;
	String content;
	String writer;
	int hitcount;
	
	//Constructor Overloading  생성자 오버로딩: 매개변수 수가 다르거나 타입이 달라야한다
	Board(){}
	Board(int no){
		//int a=10; (x)
		this(no, null, null, null, 0);
	}//객체 자신의 생성자 호출
	//Board(int hitcount){} 불가능 오버로딩 조건에 위배
	Board(int no , String title){
		this(no, title, null, null, 0);
	}
	
	Board(String title, int no){
		this(no, title, null, null, 0);
	}
	
	
	Board(int no ,String title, String content){
		this(no, title, content, null, 0);
	}
	
	Board(int no, String title, String content, String writer){
		this(no, title, content, writer, 0);
		
	}
	Board(int no, String title, String content, String writer, int hitcount)
	{
		this.no=no;
		this.content=content;
		this.writer=writer;
		this.hitcount=hitcount;
	}
	
	
	
	//Method
	
}
