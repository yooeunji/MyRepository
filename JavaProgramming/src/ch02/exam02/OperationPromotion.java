package ch02.exam02;

public class OperationPromotion {

	public static void main(String[] args) {
		
		int v1=10+20;
		System.out.println("v1:" +v1);
		
		byte v2=10;
		byte v3=20;
		int v5=v2+v3;
		//int v4=v2+v3;
		System.out.println("v5:" +v5);
		
		
		//int이하의 타입 연산은 모두 int타입으로저장된다, byte, char, short, int 타입 섞어서 어떻게 계싼하든
		//long과 다른 연산들을 섞을때는 큰 long으로 타입이 바뀌어서 계산된다.결과도 long
		
		char v6='A';
		char v7=(char)(v6+1); //괄호를 꼭 서서 계산 먼저 되게 해준다. 
		System.out.println("v7:" +v7);
		
 
		
	}

}
