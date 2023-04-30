// Three dimensional jagged array
package com.Arrays;
import java.util.Scanner;
public class Array_code_6 {
public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the count of Schools:");
		int sch = sc.nextInt();
		System.out.println("Enter the count of the class:");
		int cls = sc.nextInt();
		System.out.println("Enter the count of students:");
		int stu = sc.nextInt();
		int arr [][][]= new int[sch][cls][stu];
		
		for (int i=0;i<sch;i++){
			System.out.println("Inside School:"+(i+1));
			for (int j=0;j<cls;j++) {
				System.out.println(" Class inside the school :"+(j+1));
			
				for(int k=0;k<stu;k++) {
					System.out.println("Enter the marks of the student:"+(k+1));
					
	
				arr[i][j][k] = sc.nextInt();
				}
			}
				
			
			
			
			
		}
		for (int i=0;i<sch;i++){
			System.out.println("Inside School:"+(i+1));
			for(int j=0;j<cls;j++) {
				System.out.println("class "+(j+1)+"  in the schcool  :"+(i+1));
			}
			for(int k=0;k<stu;k++) {
				int j=0;
				System.out.println("The marks of the students :"+(k+1)+"is:"+arr[i][j][k]);
				
			}
			
			
			
		}
		 
		// TODO Auto-generated method stub

	}

}//  school        class         students
//      0			0				2
//      			1				3
//       
//      1			0				3
//                  1				4
//                  2				5
