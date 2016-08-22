package ch05.exam02;

public class ArrayReferenceCompare {

	public static void main(String[] args) {
		String[] names = new String[3];
		names[0]="홍길동";
		names[1]="홍길동";
		names[2]=new String("홍길동");
		
		System.out.println(names[0]==names[1]); //번지가 같으냐?? 같은것을 참조하냐?를 물어보는거지 문자열이 같니?를 물어보는게아님
		System.out.println(names[0]==names[2]);
		
		System.out.println(names[0].equals(names[1]));
		System.out.println(names[0].equals(names[2]));
	}

}
