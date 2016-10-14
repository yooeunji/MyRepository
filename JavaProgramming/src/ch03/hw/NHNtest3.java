package ch03.hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NHNtest3 {
	public static void main(String[] args) {
		int number = 0;
	    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
	        String line = br.readLine();
	        int[] num=new int[line.length()];
	        for(int i=0; i<line.length(); i++){
	        	num[i]=Integer.parseInt(String.valueOf(line.charAt(i)));
	        	System.out.print((num[i]));
	        }
	    }catch (IOException e) {
	         e.printStackTrace();
	    }
	}


	void rev_plus(int[] num){
		int[] sum=new int[];
		for(int i=0; i<num.length; i++){
			sum[i]=num[i]+num[(num.length)-i];
		
		}
		
	}
	
	
	
}