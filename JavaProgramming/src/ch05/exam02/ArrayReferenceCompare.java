package ch05.exam02;

public class ArrayReferenceCompare {

	public static void main(String[] args) {
		String[] names = new String[3];
		names[0]="ȫ�浿";
		names[1]="ȫ�浿";
		names[2]=new String("ȫ�浿");
		
		System.out.println(names[0]==names[1]); //������ ������?? �������� �����ϳ�?�� ����°��� ���ڿ��� ����?�� ����°Ծƴ�
		System.out.println(names[0]==names[2]);
		
		System.out.println(names[0].equals(names[1]));
		System.out.println(names[0].equals(names[2]));
	}

}
