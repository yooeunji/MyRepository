package ch13.exam05;

public class Box <T>{ //구체적으로 타입결정을 하지않았다. 
	private T item;  //이 item에는 모든 객체를 다 저장하겠다.

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
	
	
	
}
