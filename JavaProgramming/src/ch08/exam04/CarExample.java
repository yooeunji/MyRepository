package ch08.exam04;

public class CarExample {

	public static void main(String[] args) {
		 Car myCar = new Car();
	      
	      myCar.run();
	      
	      myCar.frontLeftTire = new KumhoTire();
	      myCar.frontRightTire = new KumhoTire();
	      
	      myCar.run();

	}

}
