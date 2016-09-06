package ch11.hw11; //11장 확인문제 13번

import java.time.LocalDateTime;
import java.util.Date;

public class DataPrintExample {

	public static void main(String[] args) {
		LocalDateTime now=LocalDateTime.now();
		LocalDateTime targetDateTime=null;
		
		targetDateTime=now
				.withYear(2024)
				.withMonth(05)
				.withDayOfMonth(8)
				.withHour(10)
				.withMinute(30);
		System.out.println(targetDateTime);
		
		
	}
}
