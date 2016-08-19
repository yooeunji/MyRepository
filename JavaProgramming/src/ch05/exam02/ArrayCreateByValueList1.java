package ch05.exam02;

public class ArrayCreateByValueList1 {

	public static void main(String[] args) {
		//how1
		int[] scores1={83, 90, 87};
		
	
	/*	int[] scores2;
		scores2={"83, 90, 87"}    이건에러다
		배열은 이렇게하믄안돼 */
		
		//how2
		int[] scores2;
		scores2=new int[] {83, 90, 87};
		
		sum(new int[] {83, 90, 87});  //sum에 {83, 90,87} 이런 형대가 아닌 new int[] {83, 90, 87} 이런식으로 대입해야된당, 문법이그래
		
	
	}
	
	public static void sum(int[] arr){  //매개변수로 배열을 줘야한다,,미리 변수 선언은 해놨고 나중에 대입하는것과 비슷하므로 how2와 비슷하다, 

	}

}
