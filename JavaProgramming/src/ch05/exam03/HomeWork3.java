package ch05.exam03;

import java.util.Scanner;

public class HomeWork3 {

	public static void main(String[] args) throws Exception{
		
		 views = 0;
		Scanner scanner = new Scanner(System.in);
		
		String[][] news= new String[100][] ;
		
		while(true){
			System.out.println("--------------------------------------");
			System.out.println("1.��� | 2.�۾��� | 3.�󼼺��� | 4.�����ϱ� | 5.�����ϱ� | 6.����");
			System.out.println("--------------------------------------");
			System.out.println("���� ");
			String choice=scanner.nextLine();
			
			if(choice.equals("1")){
				System.out.println("**************************************");
				System.out.println("��ȣ\t\t" + "����\t\t"+"�۾���\t\t"+"��ȸ��");
				System.out.println("**************************************");
			
				for(String[] newspaper: news){
					if(newspaper != null)
						System.out.println(newspaper[0]+"\t\t"+newspaper[1]+"\t\t"+newspaper[2]+"\t\t"+Integer.parseInt(newspaper[3]));				
				}
			}
			
			
			else if(choice.equals("2")){
				
				System.out.print("������ �Է��Ͻÿ�.");
				String title= scanner.nextLine();
				System.out.print("�۾��̸� �Է��Ͻÿ�.");
				String name= scanner.nextLine();
				System.out.print("������ �Է��Ͻÿ�.");
				String context= scanner.nextLine();
				
		
				for(int i=0; i<news.length; i++){
					if(news[i]==null){
						String[] newspaper={String.valueOf(i), title, name, views, context}; //�Ű������ڸ� ���ڿ���!
						news[i]=newspaper;
						break;
					}		
				}
			}
			
			
			else if(choice.equals("3")){
				System.out.print("���� ������� ���� ��ȣ�� �Է��ϼ���.");
				int num=Integer.parseInt(scanner.nextLine());
				System.out.println(num+"�� ���� ���� : "+ news[num][4]);
				
			}
			
			else if(choice.equals("4")){
	
				System.out.print("�����Ϸ��� ���� ��ȣ�� �Է��ϼ���."); //���� �������
				
			}
			else if(choice.equals("5")){
				System.out.print("���� �ϰ� ���� ���� ��ȣ�� �Է��ϼ���.");
				int num=Integer.parseInt(scanner.nextLine());
				news[num]=null;
				
			}
			else if(choice.equals("6")){
				break;
			}

		}
	}
}
