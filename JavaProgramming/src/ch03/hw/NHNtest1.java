package ch03.hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class NHNtest1 {
	public static void main(String[] args) {
		   ArrayList<Integer> numberList = new ArrayList<Integer>();
		   ArrayList<Sub> subList=new ArrayList<Sub>();

	        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
	            String input = br.readLine();
	            String[] numStrList = input.split(" ");
	            for (String numStr : numStrList) {
	                numberList.add(Integer.parseInt(numStr));
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        int j=1;
	        for(int i=0; i<numberList.size(); i++){
	        	j=1;
	        	for(j=j+i; j<numberList.size(); j++){
	        		Sub sub=new Sub(numberList.get(i), numberList.get(j));
	        		subList.add(sub);
	        	}
	        }        
	
	int finalsub=subList.get(0).result;        
	int finalsum=subList.get(0).sum;
	Sub finalSub=new Sub(0, 0);
	for(Sub s:subList){
		if(s.result<=finalsub){
			finalsub=s.result;
			if(s.sum<finalsum){
				System.out.println(s.num1+" "+ s.num2);
			}
			finalsum=s.sum;
		}
	}
	
	}
	
	public static class Sub{
		int num1;
		int num2;
		int result;
		int sum;
		
		Sub(int a, int b) {
			num1=a;
			num2=b;
			sum=a+b;
			if(a>b)
				result=a-b;
			else
				result=b-a;
		}
	}
	
}
