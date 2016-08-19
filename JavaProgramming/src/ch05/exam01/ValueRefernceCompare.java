package ch05.exam01;

public class ValueRefernceCompare {

	public static void main(String[] args) {
		//값비교
		
		int v1=100;
		int v2=100;
		
		System.out.println(v1==v2);
		System.out.println(v1!=v2);
		
		//참조비교(객체비교)
		String r1=new String("자바");
		String r2=new String("자바"); //모든객체는 new로 만들어진다 ,string은 좀 다르게 만들어질수도있다. 저아래
		
		System.out.println(r1==r2);
		System.out.println(r1!=r2);
		
		String r3="자바"; //"자바"라는 객체의 번지가 저장된것이다  
		String r4="자바"; //int v1=100 이런거랑은 다르다
		System.out.println(r3==r4); //r3가 참조하는 객체와 r4가 참조하는 객체가 같냐?
		System.out.println(r3!=r4);
	}

}


//int x=null; 기본타입은 null값을 쓸수없다. 이런식으로 못써
//null은 참조변수에만 쓸수있다.
//null이라는 의미는 현재 이 변수는 아무 객체도 참조하고있지않다.



