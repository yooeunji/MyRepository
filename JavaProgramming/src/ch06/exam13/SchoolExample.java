package ch06.exam13;

public class SchoolExample {

	public static void main(String[] args) {
/*		School s1= new School();
		School s2= new School();      생성자에 접근 못해*/
		
		School s1=School.getInstance();  //이런식으로접근할수있다
		School s2=School.getInstance();
		System.out.println(s1==s2);
	
		//School.singleton=null;
		School s3=School.getInstance();
	}

}
