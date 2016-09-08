package ch13.exam05;

public class Util {
	
	public static <T>Box boxing(T t){
		
		Box<T> box =new Box<>();
		box.setItem(t);
		return box;
	}
	

}
