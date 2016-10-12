package ch03.hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NHNtest2 {

	public static void main(String[] args) {
	
	        String[] words = null;
	        int num;
	        int num1=0;
	
	   
	        int num2=0;
	       
	        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
	            String line = br.readLine();
	            words = line.split(" ");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }   
	        
	        for(String word :words){
	        	num=-1;
	        	
	        	for(int i=0; i<word.length(); i++){
	        		char c=word.charAt(i);
	        		
	        		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
	        			if(i-num==1){
	        				num1++;
	        				break;
	        			}
	        		num=i; 		
	        		} //모음확인
	        		
	        		else{ //자음 확인
	        	
	        		}
	        	}
	       }
	        System.out.println(num1);
	        System.out.println(num2);
	}  
}
