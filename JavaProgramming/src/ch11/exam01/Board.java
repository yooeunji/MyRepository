package ch11.exam01;

public class Board {
	private int bno;
	private String title;
	private String content;
	
	public Board(int bno, String title, String content){
		super(); //부모는 Object클래스. 생략가능
		this.bno=bno;
		this.title=title;
		this.content=content;
	
	}
	
	@Override
	public boolean equals(Object obj) {
			
		if(obj instanceof Board){  //비교대상이 같아야하니까 매개변수로 들어온 객체가 Board객체와 종류가 같은지 비교
			Board target=(Board) obj;
			if(bno==target.bno){
				return true;
			}
		}
		return false;
		
	}
}
