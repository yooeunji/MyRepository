package ch05.exam03;

import java.util.Scanner;

public class HomeWork3 {

	public static void main(String[] args) throws Exception{
		
		int views = 0;
		Scanner scanner = new Scanner(System.in);
		
		String[][] news= new String[100][] ;
		
		while(true){
			System.out.println("--------------------------------------");
			System.out.println("1.목록 | 2.글쓰기 | 3.상세보기 | 4.수정하기 | 5.삭제하기 | 6.종료");
			System.out.println("--------------------------------------");
			System.out.println("선택 ");
			String choice=scanner.nextLine();
			
			if(choice.equals("1")){
				System.out.println("**************************************");
				System.out.println("번호\t\t" + "제목\t\t"+"글쓴이\t\t"+"조회수");
				System.out.println("**************************************");
			
				for(String[] newspaper: news){
					if(newspaper != null)
						System.out.println(newspaper[0]+"\t\t"+newspaper[1]+"\t\t"+newspaper[2]+"\t\t"+Integer.parseInt(newspaper[3]));				
				}
			}
			
			
			else if(choice.equals("2")){
				
				System.out.print("제목을 입력하시오.");
				String title= scanner.nextLine();
				System.out.print("글쓴이를 입력하시오.");
				String name= scanner.nextLine();
				System.out.print("내용을 입력하시오.");
				String context= scanner.nextLine();
				
		
				for(int i=0; i<news.length; i++){
					if(news[i]==null){
						String[] newspaper={String.valueOf(i), title, name, views, context}; //매개값숫자를 문자열로!
						news[i]=newspaper;
						break;
					}		
				}
			}
			
			
			else if(choice.equals("3")){
				System.out.print("상세히 보고싶은 글의 번호를 입력하세요.");
				int num=Integer.parseInt(scanner.nextLine());
				System.out.println(num+"번 글의 내용 : "+ news[num][4]);
				
			}
			
			else if(choice.equals("4")){
	
				System.out.print("수정하려는 글의 번호를 입력하세요."); //제목 내용수정
				
			}
			else if(choice.equals("5")){
				System.out.print("삭제 하고 싶은 글의 번호를 입력하세요.");
				int num=Integer.parseInt(scanner.nextLine());
				news[num]=null;
				
			}
			else if(choice.equals("6")){
				break;
			}

		}
	}
}
