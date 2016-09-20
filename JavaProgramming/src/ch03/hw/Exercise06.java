package ch03.hw;

public class Exercise06 {

	public static void main(String[] args) {
		int lengthTop=5;
		int lengthBottom=10;
		
		int height=7;
		double area=((lengthTop+lengthBottom)*height/(double)2); //int를 double로 타입변환
		System.out.println(area);
	}

}
