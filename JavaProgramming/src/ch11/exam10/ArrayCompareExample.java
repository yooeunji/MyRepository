package ch11.exam10;

import java.util.Arrays;

public class ArrayCompareExample {

	public static void main(String[] args) {
		int[] arr1={1, 2, 3};
		int[] arr2={1, 2, 3};
		
		System.out.println(arr1==arr2);  //참조하는 객체가 같은지   ->false
		System.out.println(Arrays.equals(arr1, arr2));  //그 안의 내용이 같은지   ->true
		
		int[][] arr3={{1, 2}, {3, 4}};
		int[][] arr4={{1, 2}, {3, 4}};    //Array.copyOf(arr3, 2) 일차원 배열의 복사
		
		System.out.println(arr3==arr4);  
		System.out.println(Arrays.equals(arr3, arr4));
		System.out.println(Arrays.deepEquals(arr3, arr4));
		
		
		
	}

}
