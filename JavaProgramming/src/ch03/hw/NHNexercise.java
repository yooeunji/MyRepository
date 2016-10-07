package ch03.hw;
import java.util.Scanner;
public class NHNexercise {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String sel=scanner.nextLine();
		int num=Integer.parseInt(sel);
		char[][] star=new char[num][num];
		int middle=num/2;
		
		for(int i=0; i<star.length;i++){
			for(int j=0; j<star[i].length; j++){
				if(j==middle){
					star[i][middle]='*';
				}
				else{star[i][j]=' ';}	
			}
		} 
		
		for(int i=0; i<num/2; i++){
			for(int j=0; j<=i; j++){
				star[i][middle+j]='*';
				star[i][middle-j]='*';
			}
		}	
		for(int j=0; j<num; j++){
			star[num/2][j]='*';
		}
		for(int i=0; i<=middle; i++){
			star[(num-1)-i]=star[i];
		}
		for(int i=0; i<star.length;i++){
			for(int j=0; j<star[i].length; j++){
				System.out.print(star[i][j]);
			}
			System.out.println();
		}
	}
}
