package ch11.exam07;

public class SystemEnvExample {

	public static void main(String[] args) {
		String java_home=System.getenv("JAVA_HOME");
		System.out.println(java_home);
	}

}
