package ch07.exam10;

public class DriveExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		driver.drive(new Vehicle());
		driver.drive(new Bus());
		driver.drive(new Texi());

	}

}
