package ch06.exam06;

public class Board {
	//Field
	int no;
	String title;
	String content;
	String writer;
	int hitcount;
	
	//Constructor Overloading  ������ �����ε�: �Ű����� ���� �ٸ��ų� Ÿ���� �޶���Ѵ�
	Board(){}
	Board(int no){
		//int a=10; (x)
		this(no, null, null, null, 0);
	}//��ü �ڽ��� ������ ȣ��
	//Board(int hitcount){} �Ұ��� �����ε� ���ǿ� ����
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
