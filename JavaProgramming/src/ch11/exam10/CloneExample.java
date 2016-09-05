package ch11.exam10;

import java.util.Arrays;

public class CloneExample { //clone은 

	public static void main(String[] args) throws CloneNotSupportedException {
		int[] arr1={1, 2, 3};
		int[] arr2=arr1.clone();
		
		System.out.println(arr1==arr2);
		System.out.println(Arrays.equals(arr1,  arr2));
	
		Member m1= new Member("hong", "길동");
		System.out.println(m1);
		Member m2=(Member)m1.clone();
	}

}

class Member implements Cloneable{ //얘가 복제 대상임을 인터페이스설정을 통해서 알려조야해,
	String mid;
	String mname;
	int age;
	String[] hobbys;
	
	Member(String mid, String mname){
		this.mid=mid;
		this.mname=mname;
	}
	@Override
	public String toString() {
		return mid+":"+mname;
	}
	
	@Override   //재정의는 접근제한자를 넓은 접근제한자로 바꿀수있다.
	public Object clone() throws CloneNotSupportedException {   //protected(같은 패키지 아니면 자식만 쓸수있다)를 public으로 바꿨다.
		return super.clone();
	}
}
