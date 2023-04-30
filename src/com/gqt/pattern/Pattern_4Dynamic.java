package com.gqt.pattern;
import java.util.Scanner;
public class Pattern_4Dynamic {

	public static void main(String[] args) {
		Scanner sc	=new Scanner(System.in);
        System.out.println("enter the value of n:");
		int n = sc.nextInt();
		int count=n*n;
		for(int i=1;i<=5;i++) {
			System.out.print(count+" ");
			count=count-n;
		}
		
		
		
		

	}

}
