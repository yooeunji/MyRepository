package ch11.exam08;

public class CarExample {

	public static void main(String[] args) throws ClassNotFoundException{
		//Class classCar=Car.class;  //Car클래스 메모리주소
		//Class classCar=Class.forName("ch11.exam08.Car");
		
		Car car=new Car();
		Class classCar=car.getClass();
		
		System.out.println(classCar.getName());
		System.out.println(classCar.getSimpleName());
		System.out.println(classCar.getPackage().getName());
		
	}

}
