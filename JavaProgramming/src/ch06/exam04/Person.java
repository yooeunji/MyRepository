package ch06.exam04;

public class Person {
	
	//Field
	String name;
	String sex;
	int age;
	double height;
	boolean married;
	
	//Construct	, �������� �Ű������� �޾Ƽ� ��ü�� �����Ҷ� �����Ͱ� ����ɼ��ֵ���
	Person(String name, String sex, int age, double height){ //�����ڿ� �Ű������� �־��ָ� 
					   //�����ڸ� ȣ���Ҷ� ���� ��� ȣ���Ҽ��ֵ���, �� �����ڴ� ���� �޾Ƽ� �ʵ带 �ʱ�ȭ�Ѵ� ��� ����Ҽ��ִ�
		this.name=name;  
		this.sex=sex;//���� ����� ������ ���ԵǾ��ִ�. 
					//�׷��Ƿ� ������ name�� �ʵ尪�� name�̾ƴ� �Ű������� �����ع�����.
		this.age=age;
		this.height=height;
	}//this.name �� ���� ��ü �� �ʵ��� name�� ����Ų��
	
}
