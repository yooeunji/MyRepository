package ch03.hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class beakjun {

	public static void main(String[] args) {
		String[] words = null;
		 	try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
	            String line = br.readLine();
	             words= line.split(" ");
	        } catch (IOException e) {
	            e.printStackTrace();
	        } 

	}

}
