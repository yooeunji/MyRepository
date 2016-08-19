package ch04.exam03;

public class BreakExample {
	//주사위의 눈이 6이나오면 프로그램을 종료하세요.
	public static void main(String[] args){
		while(true){
			
			int num=(int)(Math.random()*6)+1;	
			if(num==6){
				System.out.println("6나왔으므로 종료");
				break;
			}
			else
				System.out.println(num);
		}
	}
}
//continue;는 아래로 내려가지말고 다시 올라가서 반복해라