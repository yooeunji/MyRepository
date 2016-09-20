package ch15.exam06;

public class Person implements Comparable<Person>{  //자기객체와 또다른 Person객체를 비교하는 기능을 가지고있다.
	private String name;
	private int age;
	
	public Person(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	@Override
	public String toString() {
		return name+"("+age+")";
	}
	
	@Override
	public int compareTo(Person target) {
		return age-target.age;
	}
}
