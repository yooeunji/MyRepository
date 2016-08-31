package ch08.exam06;

public class DriveExample {

	public static void main(String[] args) {
		Driver driver=new Driver();
		
		Bus bus=new Bus();
		Taxi taxi=new Taxi();
		
		driver.drive(bus);
		driver.drive(taxi);

	}

}
