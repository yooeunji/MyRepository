package ch11.exam10;

public class StringToLowerUpperCaseExample {

	public static void main(String[] args) {
		String oldStr="java programming";
		String newStr=oldStr.toLowerCase();
		System.out.println(oldStr);
		System.out.println(newStr);
		System.out.println(oldStr==newStr);
		
		System.out.println(oldStr.equals("JAVA programming"));
		System.out.println(oldStr.toLowerCase().equals("JAVA programming".toLowerCase()));
		System.out.println(oldStr.toUpperCase().equals("JAVA programming".toUpperCase()));
		
		String targetStr="        java programming        ";
		System.out.println(targetStr==oldStr);
		System.out.println(oldStr.equals(targetStr));
		System.out.println(oldStr.equals(targetStr.trim()));

	}

}
