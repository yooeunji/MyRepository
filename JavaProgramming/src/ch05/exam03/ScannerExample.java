package ch05.exam03;

import java.util.Scanner; //�ڹٰ� ����

public class ScannerExample {

	public static void main(String[] args) throws Exception{
		
		    Scanner scanner= new Scanner(System.in); //scanner���� ������ ����/8���� �⺻Ÿ�Կ� ���ϴ� ���̾ƴϸ� ���� ����Ÿ�� ��ü, Ű����κ��� �Է��ϴ� ���� �о���̴� ��ĳ�ʻ���
		    /*while(true){
				int value=scanner.nextInt(); //��ĳ�ʶ�� ��ü�� �������ִ� �޼ҵ带 ���ा���� ����� ������� value�� �����ϰڴ� , () <-��ȯ���� �������̴�. 
				System.out.println(value);		
			
				String value1=scanner.nextLine(); //���ڿ� ���� �Ѵ� �о���ϼ��ִ�.
				System.out.println(value1);	*/
		
			System.out.print("�л���: ");
			String strNum=scanner.nextLine();
			int num = Integer.parseInt(strNum);
			int[] scores=new int[num];
			
			
			for(int i=0; i<scores.length; i++ ){
				System.out.print("����");
				String data =scanner.nextLine();
				scores[i]= Integer.parseInt(data);
			}
				
			
			int sum=0;
			for(int score : scores){
				sum+=score;
			}
			
			System.out.println("����: " + sum);
			System.out.println("���: " + (double)sum/scores.length);
			
			
	}
}


