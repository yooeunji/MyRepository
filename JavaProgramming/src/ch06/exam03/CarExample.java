package ch06.exam03;

public class CarExample {

	public static void main(String[] args) {
		//Car 객체를 생성하고 위치정보 얻기
		Car myCar=null;    //메인 메소드 안에서 선언된것은 다 변수라한다. Car타입의 변수, 아직 객체를 참조하고있지않다.
		try{
			myCar=new Car(); //객체를 만들때 car의 생성자를 실행하면서 객체를 만들어라, 실행에 문제가 생기면 객체가 만들어지지않는다, 객체가 만들어지면 그객체의 번지 대입
		}catch(Exception e){} //Car 객체가 있는지 조사
		
		if(myCar !=null){
			System.out.println("Car 객체 있음");
		}else{
			System.out.println("Car 객체 없음");
		}
		
		//객체 내부의 필드값을 읽어보자
		System.out.println(myCar.company);
		//객체 내부의 필드값을 변경해보자
		myCar.company="KOSA";
		System.out.println(myCar.company);
		
		//객체 내부의 
		myCar.run();
		
	}

}
//설계도를 가지고객체를 만들때 빨간색으로 해 검은색으로 해 이런걸 결정해주는거야, 생성자에서 만들어줌
