// Two dimensional Jagged array
// class    students
//     0         3
//     1         4
//     2         5
package com.Arrays;
import java.util.Scanner;
public class Array_code_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the count of class:");
		int cls = sc.nextInt();
		
		int arr[][]=new int[cls][];
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter the number of students inside the class:"+(i+1));
			arr[i] = new int [sc.nextInt()];
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(" Inside the class"+(i+1));
			for(int j=0;j<arr[i].length ;j++) {
				System.out.println("Enter the marks of the student no"+(j+1));
				arr[i][j]=sc.nextInt();
			}
			
	}
	//fetching the data
		for(int i=0;i<arr.length;i++) {
			System.out.println(" Inside the class"+(i+1));
			for(int j=0;j<arr[i].length ;j++) {
				System.out.println("The marks of ths student no"+(j+1)+"is ="+arr[i][j]);
				
			}
			
		}	
		
	}
	
	

}

//Output:-
//Enter the count of class:
//3
//enter the number of students inside the class:1
//3
//enter the number of students inside the class:2
//4
//enter the number of students inside the class:3
//5
// Inside the class1
//Enter the marks of the student no1
//34
//Enter the marks of the student no2
//45
//Enter the marks of the student no3
//67
// Inside the class2
//Enter the marks of the student no1
//34
//Enter the marks of the student no2
//56
//Enter the marks of the student no3
//76
//Enter the marks of the student no4
//78
// Inside the class3
//Enter the marks of the student no1
//34
//Enter the marks of the student no2
//67
//Enter the marks of the student no3
//32
//Enter the marks of the student no4
//45
//Enter the marks of the student no5
//56
// Inside the class1
//The marks of the student no1is =34
//The marks of the student no2is =45
//The marks of the student no3is =67
// Inside the class2
//The marks of the student no1is =34
//The marks of the student no2is =56
//The marks of the student no3is =76
//The marks of the student no4is =78
// Inside the class3
//The marks of the student no1is =34
//The marks of the student no2is =67
//The marks of the student no3is =32
//The marks of the student no4is =45
//The marks of the student no5is =56
//
