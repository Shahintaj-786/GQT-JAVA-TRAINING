package com.Arrays;
import java.util.Arrays;
//write the code to sort the array
		//arr[]= 23 ,45,22,32,15,77,61,5,1
		
public class Sort_array {

	public static void main(String[] args) {
		//array is abuilt in class that
		//available inside the util package
		int arr[]= {23 ,45,22,32,15,77,61,5,1};
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		

	}

}

