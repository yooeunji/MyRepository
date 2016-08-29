package ch06.exam17;

public class Member {
	private String mid;
	private String mname;
	private String mpassword;
	private int mage;
	private boolean madult;
	private double mheight;
	
	
	public Member(String mid){
		this.mid=mid;
	}
	
	
	public String getMid(){ //Getter메소드, get붙히고 필드의 첫문자를 대문자로
		return mid;   //필드값을 외부로 제공할때 사용
	}
	public void setMheight(double mheight){
		if(mheight<0.0){   //Setter메소드, 검증코드를 추가할수있다.
			mheight=0.0;
		}
		this.mheight=mheight;
	}
}
