package com.gqt.pattern;
import java.util.Scanner;
public class Pattern_22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of n");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
			if(j==1||i==n||i==j) {
				System.out.print("# ");
			}
			else {
				System.out.print("- ");
			}
			}
			System.out.println(" ");
		}

	}

}
