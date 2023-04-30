package com.gqt.pattern;

import java.util.Scanner;

public class Number_4 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter value of n");
		int n=sc.nextInt();
		for(int i=0;i<=n-1;i++) {
			for(int j=0;j<=n-1;j++) {
				if( j==0 && i<3*n/4 || i==3*n/4 ||j==3*n/4 && i>n/4 ){
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
				System.out.println();
		
	}

	}

}

//Output:-
//
//Enter value of n
//11
//#                     
//#                     
//#                     
//#               #     
//#               #     
//#               #     
//#               #     
//#               #     
//# # # # # # # # # # # 
//                #     
//                #     
//
