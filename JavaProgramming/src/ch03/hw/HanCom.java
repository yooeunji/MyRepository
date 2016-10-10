package ch03.hw;

import java.util.Scanner;

public class HanCom {
	static int i=1;
	static int num=0;
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int sel=scanner.nextInt();
		
		System.out.println(recursion(sel));
		
		
		
	}
	
	public static int recursion(int sel){
		
		
		if(sel==(num+i)){
			return i;
		}
		if(sel!=(num+i)){
			recursion(num+i);
		}
		if(sel==(num-i)){
			return i;
		}
		if(sel!=(num-i)){
			recursion(num-i);	
		}
		return 0;
	}

}

