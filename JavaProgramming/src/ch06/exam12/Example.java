package ch06.exam12;

public class Example {

	public static void main(String[] args) {
		//Instan ce Member ���
		InstanceMember im=new InstanceMember();
		System.out.println(im.field);
		im.field ="�ڹ�";
		im.method();
		
		//Static Member ���
		//Ŭ�����̸������� ���ٷ� �����Ѵ�
	//	StaticMember.field="�ڹ�";
		System.out.println(StaticMember.field);
		StaticMember.method();
	//	StaticMember sm= new StaticMember();
		
	}

}
