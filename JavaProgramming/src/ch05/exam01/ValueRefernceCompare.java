package ch05.exam01;

public class ValueRefernceCompare {

	public static void main(String[] args) {
		//����
		
		int v1=100;
		int v2=100;
		
		System.out.println(v1==v2);
		System.out.println(v1!=v2);
		
		//������(��ü��)
		String r1=new String("�ڹ�");
		String r2=new String("�ڹ�"); //��簴ü�� new�� ��������� ,string�� �� �ٸ��� ������������ִ�. ���Ʒ�
		
		System.out.println(r1==r2);
		System.out.println(r1!=r2);
		
		String r3="�ڹ�"; //"�ڹ�"��� ��ü�� ������ ����Ȱ��̴�  
		String r4="�ڹ�"; //int v1=100 �̷��Ŷ��� �ٸ���
		System.out.println(r3==r4); //r3�� �����ϴ� ��ü�� r4�� �����ϴ� ��ü�� ����?
		System.out.println(r3!=r4);
	}

}


//int x=null; �⺻Ÿ���� null���� ��������. �̷������� ����
//null�� ������������ �����ִ�.
//null�̶�� �ǹ̴� ���� �� ������ �ƹ� ��ü�� �����ϰ������ʴ�.



