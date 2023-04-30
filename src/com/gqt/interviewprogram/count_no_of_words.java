//program to count the number of words in the string
package com.gqt.interviewprogram;
import java.util.Scanner;
public class count_no_of_words {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		
		int spc_cnt=0;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				spc_cnt++;
			}
		}
			int word_cnt=spc_cnt+1;
			System.out.println("The number of words in a string is = "+word_cnt);
				
		}
				

	}

//Output:-
//Enter the string
//my name is shah
//The number of words in a string is = 4

