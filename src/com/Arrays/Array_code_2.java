//two dimensional array
package com.Arrays;
import java.util.Scanner;
public class Array_code_2 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the count of class");
		int cls =sc.nextInt();
		System.out.println("enter the count of students");
		int stu =sc.nextInt();
		 
		       int arr[][]= new int[ cls][stu];
				 
		    for(int i=0;i<cls;i++) {
		    	System.out.println("inside the class"+(i+1));
			for(int j=0;j<stu;j++) {
				System.out.println("enter the marks of student no:"+(j+1));
				arr[i][j] =sc.nextInt();
				
			}
		}
		    //fecthing the data
		    for(int i=0;i<cls;i++) {
		    	System.out.println("inside the class"+(i+1));
			for(int j=0;j<stu;j++) {
				System.out.println("The marks of student no:"+(j+1)+"is ="+arr[i][j]);
				

	}

}
	}}

//output:-
//enter the count of class
//3
//enter the count of students
//5
//inside the class1
//enter the marks of student no:1
//34
//enter the marks of student no:2
//65
//enter the marks of student no:3
//34
//enter the marks of student no:4
//56
//enter the marks of student no:5
//76
//inside the class2
//enter the marks of student no:1
//23
//enter the marks of student no:2
//87
//enter the marks of student no:3
//65
//enter the marks of student no:4
//45
//enter the marks of student no:5
//98
//inside the class3
//enter the marks of student no:1
//54
//enter the marks of student no:2
//76
//enter the marks of student no:3
//43
//enter the marks of student no:4
//89
//enter the marks of student no:5
//56
//inside the class1
//The marks of student no:1is =34
//The marks of student no:2is =65
//The marks of student no:3is =34
//The marks of student no:4is =56
//The marks of student no:5is =76
//inside the class2
//The marks of student no:1is =23
//The marks of student no:2is =87
//The marks of student no:3is =65
//The marks of student no:4is =45
//The marks of student no:5is =98
//inside the class3
//The marks of student no:1is =54
//The marks of student no:2is =76
//The marks of student no:3is =43
//The marks of student no:4is =89
//The marks of student no:5is =56
