package com.gqt.pattern;
import java.util.Scanner;

public class Pattern_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of n:" );
		int n =sc.nextInt();
		int count =1;
		for(int i=1;i<=5;i++) {
			count=i;
			for(int j=1;j<=5;j++) {
				System.out.print(count+"	");
				count=count+5;
			}
			System.out.println();
		}
		
				
		

	}

}
