//one dimensional array
package com.Arrays;
import java.util.Scanner;
public class Array_code_1 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter  count of students:");
		int n = sc.nextInt();
		
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter the marks of the student:"+(i+1));
			 arr[i] =sc.nextInt();
			
		}
		//fetching the data
		for(int i=0;i<n;i++) {
			System.out.println("The marks of student no: "+(i+1)+"is =" +arr[i]);
			
		
	}

}
}

//Output:-
//Enter  count of students:
//5
//Enter the marks of the student:1
//34
//Enter the marks of the student:2
//45
//Enter the marks of the student:3
//45
//Enter the marks of the student:4
//23
//Enter the marks of the student:5
//56
//The marks of student no: 1is =34
//The marks of student no: 2is =45
//The marks of student no: 3is =45
//The marks of student no: 4is =23
//The marks of student no: 5is =56
