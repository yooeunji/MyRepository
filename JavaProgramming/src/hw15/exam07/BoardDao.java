package hw15.exam07;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
	List<Board> getBoardList(){
		List<Board> list=new ArrayList<>();
		list.add(new Board("제목1", "내용1"));
		list.add(new Board("제목2", "내용2"));
		list.add(new Board("제목3", "내용3"));
		
		return list;
	}
}
