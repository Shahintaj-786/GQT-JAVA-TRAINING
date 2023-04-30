//program to  reverse the string & check the given string is pallindrome or not
package com.gqt.interviewprogram;
import java.util.Scanner;
public class reverse_String {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the string");
		String str =sc.next();
		String str2 ="";
		
		
		for(int i=str.length()-1; i>=0;i--) {
		str2=str2+str.charAt(i);
	}
		System.out.println(str2);
		if(str2.equals(str)==true) {
		System.out.println("pallindrome");
		}
		else {
			System.out.println("not a pallindrome");
		}
		
		

}
}

//Output:-
//enter the string
//mom
//mom
//pallindrome
//
