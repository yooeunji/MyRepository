package ch15.exam01;

import java.util.Arrays;
import java.util.List;

public class ArrayAsListExample {

	public static void main(String[] args) {
		List<String> list=Arrays.asList("java", "JDBC", "Database");
		System.out.println(list.size());
		
		for(String str: list){
			System.out.println(str);
		}
		
		list.add("SQL");
	}

}
