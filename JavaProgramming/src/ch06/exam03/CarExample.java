package ch06.exam03;

public class CarExample {

	public static void main(String[] args) {
		//Car ��ü�� �����ϰ� ��ġ���� ���
		Car myCar=null;    //���� �޼ҵ� �ȿ��� ����Ȱ��� �� �������Ѵ�. CarŸ���� ����, ���� ��ü�� �����ϰ������ʴ�.
		try{
			myCar=new Car(); //��ü�� ���鶧 car�� �����ڸ� �����ϸ鼭 ��ü�� ������, ���࿡ ������ ����� ��ü�� ����������ʴ´�, ��ü�� ��������� �װ�ü�� ���� ����
		}catch(Exception e){} //Car ��ü�� �ִ��� ����
		
		if(myCar !=null){
			System.out.println("Car ��ü ����");
		}else{
			System.out.println("Car ��ü ����");
		}
		
		//��ü ������ �ʵ尪�� �о��
		System.out.println(myCar.company);
		//��ü ������ �ʵ尪�� �����غ���
		myCar.company="KOSA";
		System.out.println(myCar.company);
		
		//��ü ������ 
		myCar.run();
		
	}

}
//���赵�� ������ü�� ���鶧 ���������� �� ���������� �� �̷��� �������ִ°ž�, �����ڿ��� �������
