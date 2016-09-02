package ch11.exam05;

public class GcExample {

	public static void main(String[] args) {
		Employee emp=new Employee(1);
		emp=null;
		emp=new Employee(2);
		emp=new Employee(3);
		System.gc();  //JVM이 판단을 한다. 쓰레기 객체를 정리가 필요하면 하고 아님안해. 
	}

}
