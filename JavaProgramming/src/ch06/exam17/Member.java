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
	
	
	public String getMid(){ //Getter�޼ҵ�, get������ �ʵ��� ù���ڸ� �빮�ڷ�
		return mid;   //�ʵ尪�� �ܺη� �����Ҷ� ���
	}
	public void setMheight(double mheight){
		if(mheight<0.0){   //Setter�޼ҵ�, �����ڵ带 �߰��Ҽ��ִ�.
			mheight=0.0;
		}
		this.mheight=mheight;
	}
}
