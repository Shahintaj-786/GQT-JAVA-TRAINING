
package com.gqt.pattern;
import java.util.Scanner;

public class Pattern_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("enter the value of n:");
		int n =sc.nextInt();
		int count= n*n;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(count+"	");
				count=count-1;
				
			}
			System.out.println();
			
		}
		
		
		
		

	}

}
