//3 dimensional array
//     school      class        student
//         0     	  0				  5
//                    1               5
//         1          0               5
//                    1               5
//         2          0               5
//                    1               5

package com.Arrays;
import java.util.Scanner;
public class Array_code_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the count of school");
		int scl = sc.nextInt();
		System.out.println("enter the count of class");
		int cls = sc.nextInt();
		System.out.println("enter the count of student");
		int stu = sc.nextInt();
		
		//storing the data
		 int arr[][][] = new int[scl][cls][stu];
		for(int i=0;i<scl;i++) {
			System.out.println("Inside the school"+i+1);
			for(int j=0;j<cls;j++) {
			System.out.println("Inside the class"+j+1);
			for(int k=0;k<stu;k++) {
			System.out.println("Enter the marks obtained by student"+k+1);
			arr[i][j][k] =sc.nextInt();
			}
			
			}
			//fetching the data
			    for(i=0;i<scl;i++) {
				System.out.println("Inside the school"+i+1);
				for(int j=0;j<cls;j++) {
				System.out.println("Inside the class"+j+1);
				for(int k=0;k<stu;k++) {
				System.out.println("the marks obtained by student"+k+1+"is ="+arr[i][j][k]);
				
				}
				
				}
		}
		}
	}

}
//output:-
//enter the count of school
//2
//enter the count of class
//2
//enter the count of student
//3
//Inside the school01
//Inside the class01
//Enter the marks obtained by student01
//34
//Enter the marks obtained by student11
//54
//Enter the marks obtained by student21
//54
//Inside the class11
//Enter the marks obtained by student01
//54
//Enter the marks obtained by student11
//32
//Enter the marks obtained by student21
//45
//Inside the school01
//Inside the class01
//the marks obtained by student01is =34
//the marks obtained by student11is =54
//the marks obtained by student21is =54
//Inside the class11
//the marks obtained by student01is =54
//the marks obtained by student11is =32
//the marks obtained by student21is =45
//Inside the school11
//Inside the class01
//the marks obtained by student01is =0
//the marks obtained by student11is =0
//the marks obtained by student21is =0
//Inside the class11
//the marks obtained by student01is =0
//the marks obtained by student11is =0
//the marks obtained by student21is =0
//
