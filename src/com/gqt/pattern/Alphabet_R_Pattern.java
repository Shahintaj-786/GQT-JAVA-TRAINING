package com.gqt.pattern;

import java.util.Scanner;

public class Alphabet_R_Pattern {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter value of n");
		int n=sc.nextInt();
		for(int i=0;i<=n-1;i++) {
			for(int j=0;j<=n-1;j++) {
				if(j==0 
				  || i==0 && j<n/2 
				  || i==n/2 && j<n/2 
				  || j==n/2 && i<n/2 && i>0
				  || i-j == n/2)
				           
				    {
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
//Enter value of n
//11
//
//# # # # #             
//#         #           
//#         #           
//#         #           
//#         #           
//# # # # #             
//# #                   
//#   #                 
//#     #               
//#       #             
//#         #           
//
