package com.gqt.pattern;

import java.util.Scanner;

public class Number_5 {
	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter value of n");
	int n = sc.nextInt();
	for(int i=0;i<=n-1;i++) {
		for(int j=0;j<=n-1;j++) {
			if(i==0 && j>n/4 && j<=3*n/4
				|| i==n-1 && j>n/4 && j<3*n/4
				|| i==n/2 && j>=n/4 && j<3*n/4 && j!=n/4
				|| j==n/4 && i<=n/2 
				|| j==3*n/4 && i>n/2 && i!=n-1 
				)
			           
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
//    # # # # # # #     
//    #                 
//    #                 
//    #                 
//    #                 
//    # # # # # #       
//                #     
//                #     
//                #     
//                #     
//      # # # # #       
//
