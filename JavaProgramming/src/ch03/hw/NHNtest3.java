package ch03.hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class NHNtest3 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
	      int sel=scanner.nextInt();
	      
	      int sum=0;
	      int result=-1;
	      int i;
	      
	      for(i=0; i<3; i++){
	         sum=sel+reverse(sel);
	         if(sum==reverse(sum)){
	            System.out.println(sum);
	            System.exit(0);
	         }   
	         sel=sum;
	      }
	      if(sel!=reverse(sel)){
	         System.out.println(-1);
	      }
	   }
	   
	   static int reverse(int sel){
	      int reverseNum=0;
	      while( sel != 0 )
	       {
	           reverseNum = reverseNum * 10;
	           reverseNum = reverseNum + sel%10;
	           sel = sel/10;
	       }
	      return reverseNum;
	   
		}
}