package ch05.exam03;

import java.util.Scanner; //�ڹٰ� ��ĳ�ʸ� ����

public class ScoreManagement {

	public static void main(String[] args) throws Exception{
		
		
		Scanner scanner = new Scanner(System.in);
		String[][] students=null; //������ �Ͽ����� ������ �ƹ��͵� �����ϰ����� �ʴ�.
		 
				
		while(true){
			System.out.println("--------------------------------------");
			if(students==null){
				System.out.println("1.���л���| 7.���� ");
			}else{
				System.out.println("1.���л��� | 2.��� | 3.�Է� | 4.���� | 5.�ְ����� | 6.��� | 7.���� ");
			}
			System.out.println("--------------------------------------");
			System.out.println("���� ");
			String choice=scanner.nextLine();
			
			if(choice.equals("1")){
				System.out.print("���л��� : ");
				int totalNum=Integer.parseInt(scanner.nextLine());
				students= new String[totalNum][];    
			}
			
			else if(choice.equals("2")){
				System.out.println("**************************************");
				System.out.println("�й�\t\t" + "�̸�\t\t"+"����\t\t");
				System.out.println("**************************************");
			
				for(String[] student: students){
					if(student != null)
						System.out.println(student[0]+"\t\t"+student[1]+"\t\t"+student[2]);				
					}
			}
			
			else if(choice.equals("3")){
					System.out.print("�л��̸� : ");
					String name = scanner.nextLine();
					System.out.print("���� : ");
					String score = scanner.nextLine();
					
					for(int i=0; i<students.length; i++){
						if(students[i]==null){
							String[] student={String.valueOf(i), name, score}; //�Ű������ڸ� ���ڿ���!
							students[i]=student;
							break;
						}		
					}
			}
			
			else if(choice.equals("4")){
				if(students!=null){
					System.out.print("������ �л��� �й� �Է� : ");
					int gar=Integer.parseInt(scanner.nextLine());
					students[gar]=null;
				}
			}
			
			else if(choice.equals("5")){
				int max=0;
				for(String[] student: students){
					if(student!=null){
						if(max<Integer.parseInt(student[2])){
							max=Integer.parseInt(student[2]);
						}
					}
				}
				for(String[] student: students){
					if(student!=null){
						if(max==Integer.parseInt(student[2])){
						System.out.println("�ְ����� �л�"+student[0]+"("+student[1]+") :"+student[2]);
						}
					}
				}
			}
			
			
			else if(choice.equals("6")){
				int sum=0;
				int score=0;
				
				for(String[] student: students){	
					if(student!=null){
						score+=Integer.parseInt(student[2]);
						sum++;
				
					}
				}
				System.out.println("��� : "+(double)score/sum);
				
			}else if(choice.equals("7")){
				break;
			}
		}
	}
}

