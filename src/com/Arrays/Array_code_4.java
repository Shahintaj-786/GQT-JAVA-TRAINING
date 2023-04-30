//four dimensional array

 //   uni     school  class  student 
//       0        0       0      5
//                        1      5
//                1       0      5
//                        1      5

//       1        0        0     5
//                         1     5
//                1        0     5
//                         1     5                 

package com.Arrays;

import java.util.Scanner;

public class Array_code_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the count of university");
		int uni = sc.nextInt();
		System.out.println("enter the count of school");
		int scl = sc.nextInt();
		System.out.println("enter the count of class");
		int cls = sc.nextInt();
		System.out.println("enter the count of student");
		int stu = sc.nextInt();
		
		//storing the data
		 
		int arr[][][][] = new int[uni][scl][cls][stu];
		
		 for(int i=0;i<uni;i++) {
				System.out.println("Inside the univarsity"+ (i+1));
		for(int j=0;j<scl;j++) {
			System.out.println("Inside the school"+(j+1));
			for(int k=0;k<cls;k++) {
			System.out.println("Inside the class"+(k+1));
			for(int l=0;l<stu;l++) {
			System.out.println("Enetr the marks of the student"+(l+1));
			arr[i][j][k][l]=sc.nextInt();
			}
			
			}}}
			//fetching the data
		 for(int i=0;i<uni;i++) {
				System.out.println("Inside the univarsity"+(i+1));
		for(int j=0;j<scl;j++) {
			System.out.println("Inside the school"+(j+1));
			for(int k=0;k<cls;k++) {
			System.out.println("Inside the class"+(k+1));
			for(int l=0;l<stu;l++) {
			System.out.println("the marks of the student"+(l+1) + "is ="+arr[i][j][k][l]);
				
				}
				
				}
		}
		}
	}

}

//Output:-
//enter the count of university
//2
//enter the count of school
//2
//enter the count of class
//4
//enter the count of student
//5
//Inside the univarsity1
//Inside the school1
//Inside the class1
//Enetr the marks of the student1
//23
//Enetr the marks of the student2
//34
//Enetr the marks of the student3
//45
//Enetr the marks of the student4
//56
//Enetr the marks of the student5
//34
//Inside the class2
//Enetr the marks of the student1
//54
//Enetr the marks of the student2
//56
//Enetr the marks of the student3
//67
//Enetr the marks of the student4
//45
//Enetr the marks of the student5
//43
//Inside the class3
//Enetr the marks of the student1
//67
//Enetr the marks of the student2
//43
//Enetr the marks of the student3
//34
//Enetr the marks of the student4
//67
//Enetr the marks of the student5
//34
//Inside the class4
//Enetr the marks of the student1
//67
//Enetr the marks of the student2
//43
//Enetr the marks of the student3
//56
//Enetr the marks of the student4
//78
//Enetr the marks of the student5
//34
//Inside the school2
//Inside the class1
//Enetr the marks of the student1
//67
//Enetr the marks of the student2
//34
//Enetr the marks of the student3
//5
//Enetr the marks of the student4
//78
//Enetr the marks of the student5
//34
//
//Inside the class2
//Enetr the marks of the student1
//34
//Enetr the marks of the student2
//56
//Enetr the marks of the student3
//76
//Enetr the marks of the student4
//34
//Enetr the marks of the student5
//56
//Inside the class3
//Enetr the marks of the student1
//34
//Enetr the marks of the student2
//56
//Enetr the marks of the student3
//34
//Enetr the marks of the student4
//23
//Enetr the marks of the student5
//34
//Inside the class4
//Enetr the marks of the student1
//55
//Enetr the marks of the student2
//64
//Enetr the marks of the student3
//2
//Enetr the marks of the student4
//34
//Enetr the marks of the student5
//
//5
//Inside the univarsity2
//Inside the school1
//Inside the class1
//Enetr the marks of the student1
//23
//Enetr the marks of the student2
//45
//Enetr the marks of the student3
//65
//Enetr the marks of the student4
//45
//Enetr the marks of the student5
//67
//Inside the class2
//Enetr the marks of the student1
//34
//Enetr the marks of the student2
//56
//Enetr the marks of the student3
//76
//
//Enetr the marks of the student4
//34
//Enetr the marks of the student5
//23
//Inside the class3
//Enetr the marks of the student1
//23
//Enetr the marks of the student2
//45
//Enetr the marks of the student3
//65
//Enetr the marks of the student4
//65
//
//Enetr the marks of the student5
//34
//Inside the class4
//Enetr the marks of the student1
//23
//Enetr the marks of the student2
//45
//Enetr the marks of the student3
//65
//Enetr the marks of the student4
//5
//Enetr the marks of the student5
//
//44
//Inside the school2
//Inside the class1
//Enetr the marks of the student1
//6
//Enetr the marks of the student2
//
//43
//Enetr the marks of the student3
//5
//Enetr the marks of the student4
//
//35
//Enetr the marks of the student5
//34
//Inside the class2
//Enetr the marks of the student1
//54
//Enetr the marks of the student2
//34
//Enetr the marks of the student3
//3
//4Enetr the marks of the student4
//
//Enetr the marks of the student5
//23
//Inside the class3
//Enetr the marks of the student1
//4
//Enetr the marks of the student2
//4
//Enetr the marks of the student3
//5
//Enetr the marks of the student4
//353
//Enetr the marks of the student5
//
//5
//Inside the class4
//Enetr the marks of the student1
//
//5
//Enetr the marks of the student2
//
//5
//Enetr the marks of the student3
//
//4
//Enetr the marks of the student4
//35
//Enetr the marks of the student5
//6
//Inside the univarsity1
//Inside the school1
//Inside the class1
//the marks of the student1is =23
//the marks of the student2is =34
//the marks of the student3is =45
//the marks of the student4is =56
//the marks of the student5is =34
//Inside the class2
//the marks of the student1is =54
//the marks of the student2is =56
//the marks of the student3is =67
//the marks of the student4is =45
//the marks of the student5is =43
//Inside the class3
//the marks of the student1is =67
//the marks of the student2is =43
//the marks of the student3is =34
//the marks of the student4is =67
//the marks of the student5is =34
//Inside the class4
//the marks of the student1is =67
//the marks of the student2is =43
//the marks of the student3is =56
//the marks of the student4is =78
//the marks of the student5is =34
//Inside the school2
//Inside the class1
//the marks of the student1is =67
//the marks of the student2is =34
//the marks of the student3is =5
//the marks of the student4is =78
//the marks of the student5is =34
//Inside the class2
//the marks of the student1is =34
//the marks of the student2is =56
//the marks of the student3is =76
//the marks of the student4is =34
//the marks of the student5is =56
//Inside the class3
//the marks of the student1is =34
//the marks of the student2is =56
//the marks of the student3is =34
//the marks of the student4is =23
//the marks of the student5is =34
//Inside the class4
//the marks of the student1is =55
//the marks of the student2is =64
//the marks of the student3is =2
//the marks of the student4is =34
//the marks of the student5is =5
//Inside the univarsity2
//Inside the school1
//Inside the class1
//the marks of the student1is =23
//the marks of the student2is =45
//the marks of the student3is =65
//the marks of the student4is =45
//the marks of the student5is =67
//Inside the class2
//the marks of the student1is =34
//the marks of the student2is =56
//the marks of the student3is =76
//the marks of the student4is =34
//the marks of the student5is =23
//Inside the class3
//the marks of the student1is =23
//the marks of the student2is =45
//the marks of the student3is =65
//the marks of the student4is =65
//the marks of the student5is =34
//Inside the class4
//the marks of the student1is =23
//the marks of the student2is =45
//the marks of the student3is =65
//the marks of the student4is =5
//the marks of the student5is =44
//Inside the school2
//Inside the class1
//the marks of the student1is =6
//the marks of the student2is =43
//the marks of the student3is =5
//the marks of the student4is =35
//the marks of the student5is =34
//Inside the class2
//the marks of the student1is =54
//the marks of the student2is =34
//the marks of the student3is =3
//the marks of the student4is =4
//the marks of the student5is =23
//Inside the class3
//the marks of the student1is =4
//the marks of the student2is =4
//the marks of the student3is =5
//the marks of the student4is =353
//the marks of the student5is =5
//Inside the class4
//the marks of the student1is =5
//the marks of the student2is =5
//the marks of the student3is =4
//the marks of the student4is =35
//the marks of the student5is =6
//
