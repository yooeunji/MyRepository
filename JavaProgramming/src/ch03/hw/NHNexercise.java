package ch03.hw;

import java.util.Scanner;

public class NHNexercise {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String sel=scanner.nextLine();
		int num=Integer.parseInt(sel);
		char[][] star=new char[num][num];
		
		for(int i=0; i<star.length;i++){
			for(int j=0; j<star[i].length; j++){
				star[i][j]='-';
			}
		}
		
		for(int i=0; i<(num-1)/2; i++){
			for(int j=(num-1)/2; j<num-2; j++){
				star[i][j]='*';}
			
			for(int j=(num-1)/2; j>0; j--){
				star[i][j]='*';}
		}
			
		for(int i=0; i<star.length;i++){
			for(int j=0; j<star[i].length; j++){
				System.out.print(star[i][j]);
			}
			System.out.println();
		}
	}
}
