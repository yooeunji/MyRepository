package ch06.exam14;

public class SingleTonExample {

	public static void main(String[] args) {
		SingleTon obj1=SingleTon.getInstance();
		SingleTon obj2=SingleTon.getInstance();

		if(obj1==obj2){
			System.out.println("���� Singleton ��ü �Դϴ�.");
		}else {
			System.out.println("�ٸ� Singleton ��ü �Դϴ�.");
		}
	}

}
