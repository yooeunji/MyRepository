package ch04.exam01;

public class SwitchExample {

	public static void main(String[] args) {
		
		/*double d= Math.random(); //0.0<=������ �� <1.0
		d=d*6; //0.0<=������ ��<6.0
		int num=(int)d; //0, 1, 2, 3, 4, 5
		num=num+1; //1, 2, 3, 4, 5, 6
		System.out.println(num);*/ 
		
		int num=(int)(Math.random()*6)+1; //���� �ּ�ó���ѰͰ� ����� �Ȱ���
		
		
		
		switch(num) {
		
		case 1:
			System.out.println("1���� ���Խ��ϴ�.");
			break;
		case 2:
			System.out.println("2���� ���Խ��ϴ�.");
			break;
		case 3:
			System.out.println("3���� ���Խ��ϴ�.");
			break;
		case 4:
			System.out.println("4���� ���Խ��ϴ�.");
			break;
		case 5:
			System.out.println("5���� ���Խ��ϴ�."); 
			break;
		default:	
			System.out.println("6���� ���Խ��ϴ�.");
		}
	}

}
//case������ ���̸� break���������� �Ʒ� case ��ӽ����Ѵ�. 