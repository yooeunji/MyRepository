package ch06.exam12;

public class StaticMember2 {
	//Static Field
	static String field;
	String field2;
	
	
	
	//Static constructor
	static{
		System.out.println("Static Block ����");
		field="�ڹ�";
		//field2="�ڹ�"; <-�ʵ� �ʱ�ȭ �Ұ���, ��ü�� ���
	}//���簡 �ȴٸ� �̺κ��� ������ �Ǿ���Ѵ�
	//�����ڴ� �޼ҵ� �������ִ� �ʵ带 �ʱ�ȭ�ҋ� ����մϴ�.
	
	
	//Static constructor
	static void method(){
		field="�ڹ�";
		//field2="�ڹ�"; �̰͵� �Ұ���
	}
	void method2(){
		field="�ڹ�";
		field2="�ڹ�";
	}
	
	public static void main(String[] args){
		field="�ڹ�";
		//field2="�ڹ�"; 
		
		method();
		//method2();
	
		StaticMember2 sm=new StaticMember2();
		sm.field2="�ڹ�";
		sm.method2();
	}
	
}
