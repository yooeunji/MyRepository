package ch06.exam07;

public class Board {
	//Field
	int no;
	String title;
	String content;
	String writer;
	int hitcount;
	
	//Constructor Overloading  ������ �����ε�: �Ű����� ���� �ٸ��ų� Ÿ���� �޶���Ѵ�
	Board(){}
	Board(int no){}
	//Board(int hitcount){} �Ұ��� �����ε� ���ǿ� ����
	Board(int no, String content){}
	Board(String content, int no){}
	Board(int no, String content, String writer){}
	Board(int no, String content, String writer, int hitcount){}
	
	
	
	//Method
	
}
