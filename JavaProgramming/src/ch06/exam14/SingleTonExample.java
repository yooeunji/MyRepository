package ch06.exam14;

public class SingleTonExample {

	public static void main(String[] args) {
		SingleTon obj1=SingleTon.getInstance();
		SingleTon obj2=SingleTon.getInstance();

		if(obj1==obj2){
			System.out.println("같은 Singleton 객체 입니다.");
		}else {
			System.out.println("다른 Singleton 객체 입니다.");
		}
	}

}
