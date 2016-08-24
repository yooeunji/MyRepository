package ch06.exam11;

import java.util.Scanner; //자바가 스캐너를 제공

public class ScoreManagement {

	public static void main(String[] args) throws Exception{
		
		
		Scanner scanner = new Scanner(System.in);
		Student[] students=null; //생성은 하였으나 아직은 아무것도 참조하고있지 않다.
		 
				
		while(true){
			System.out.println("--------------------------------------");
			if(students==null){
				System.out.println("1.총학생수| 7.종료 ");
			}else{
				System.out.println("1.총학생수 | 2.목록 | 3.입력 | 4.삭제 | 5.최고점수 | 6.평균 | 7.종료 ");
			}
			System.out.println("--------------------------------------");
			System.out.println("선택 ");
			String choice=scanner.nextLine();
			
			if(choice.equals("1")){
				System.out.print("총학생수 : ");
				int totalNum=Integer.parseInt(scanner.nextLine());
				students= new Student[totalNum];    
			}
			
			else if(choice.equals("2")){
				System.out.println("**************************************");
				System.out.println("학번\t\t" + "이름\t\t"+"점수\t\t");
				System.out.println("**************************************");
			
				for(int i=0; i<students.length; i++){
					Student student=students[i];
					if(student != null)
						System.out.println(student.no+"\t\t"+student.name+"\t\t"+student.score);				
					}
			}
			
			else if(choice.equals("3")){
					System.out.print("학생이름 : ");
					String name = scanner.nextLine();
					System.out.print("점수 : ");
					int score = Integer.parseInt(scanner.nextLine());
					
					for(int i=0; i<students.length; i++){
						if(students[i]==null){
							Student student=new Student(i, name,score); //매개값숫자를 문자열로! 52,53열 students[i]=new Student(
							students[i]=student;
							break;
						}		
					}
			}
			
			else if(choice.equals("4")){
				if(students!=null){
					System.out.print("삭제할 학생의 학번 입력 : ");
					int gar=Integer.parseInt(scanner.nextLine());
					students[gar]=null;
				}
			}
			
			else if(choice.equals("5")){
				int max=0;
				for(Student student: students){
					if(student!=null){
						if(max<student.score)
							max=student.score;
					}
				}
				for(Student student: students){
					if(student!=null){
						if(max==student.score){
						System.out.println("최고점수 학생 :("+student.name+"), 점수는 "+student.score);
						}
					}
				}
			}
			
			
			else if(choice.equals("6")){
				int sum=0;
				int score=0;
				
				for(Student student: students){	
					if(student!=null){
						score+=student.score;
						sum++;
					}
				}
				System.out.println("평균 : "+(double)score/sum);
				
			}else if(choice.equals("7")){
				break;
			}
		}
	}
}

