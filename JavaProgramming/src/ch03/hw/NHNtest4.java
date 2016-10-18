package ch03.hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class NHNtest4 {

	public static void main(String[] args) {
		 ArrayList<Integer> numberList = new ArrayList<Integer>();

         try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
             String input = br.readLine();
             String[] numStrList = input.split(" ");
             for (String numStr : numStrList) {
                 numberList.add(Integer.parseInt(numStr));
             }
         } catch (IOException e) {
             e.printStackTrace();
         }
         
         for(int i=0; i<numberList.size(); i++){
            numberList.get(i);
         }
         
         /*int[][] A = new int[numberList.size()][]; // input 문자열 길이만큼 배열 준비.
         for(int i=0;i<input.length();i++) {
             A[i] = input.charAt(i) - '0'; // i=0 일때, '1' - '0' = 1 이됨.
         }*/


	}

}