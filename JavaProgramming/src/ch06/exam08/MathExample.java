package ch06.exam08;

public class MathExample {

	public static void main(String[] args) {
		Math math = new Math();
		math.printInfo("���� ��ü�� ������");
		
		int result=math.max(7,  5);
		System.out.println(result);
		
		math.max(7,  5); //�̷��� ���°͵������ϴ� �ٸ� ���ϰ��� �����ʰڴ�
		
		int[] values = {10, 20, 30, 40, 50};
		double result1 = math.avg1(values);
		System.out.println(result1);
		
		double result2 = math.avg2(10, 20, 30, 40, 50); //�迭�� �������� ��������� �ִ´�
		System.out.println(result2);
		// ȣ���ϱ� �� ���ϴ�
		
		
		
	}

}
