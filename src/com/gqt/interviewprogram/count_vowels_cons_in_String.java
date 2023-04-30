//program to count total number of vowels and consonents
package com.gqt.interviewprogram;
import java.lang.String;
import java.util.Scanner;
public class count_vowels_cons_in_String {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String str = sc.next();
		
		int vowels_cnt =0;
		int Cons_cnt = 0;
		
		for(int i=0;i<=str.length();i++) {
			if(str.charAt(i)=='a'&& str.charAt(i)=='e' &&str.charAt(i)=='i'&&str.charAt(i)=='o'&&str.charAt(i)=='u') {
				vowels_cnt++;
				
			}
			else
			{
				Cons_cnt++;
			}
		}
		
       System.out.println("Vowels count = "+vowels_cnt);
       System.out.println("consonents count = "+Cons_cnt);
	}

}
