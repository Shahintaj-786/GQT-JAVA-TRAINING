package com.gqt.pattern;
import java.util.Scanner;


public class Pattern_18 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter thevalue of n:-");
		int n= sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=i;j--) {
				System.out.print("&");
			}
			for(int j=1;j<=n;j++) {
				System.out.print("#");
			}
			System.out.println();
			
		}
	}

}
