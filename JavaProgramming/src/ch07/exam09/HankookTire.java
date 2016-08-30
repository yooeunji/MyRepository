package ch07.exam09;

public class HankookTire extends Tire{

//필드
	
//생성자
	public HankookTire(String location, int maxRotation){
		super(location, maxRotation);
	}
	
	@Override
		public boolean roll(){
			++accumulatedRotation;
			if(accumulatedRotation<maxRotation){
				System.out.println(location+"hankookTire 수명 : "+ (maxRotation-accumulatedRotation)+"회");
				return true;
			}
			else{
				System.out.println("***"+location+"hankookTire펑크***");
				return false;
			}
		}
	
}
