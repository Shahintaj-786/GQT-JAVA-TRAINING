//program to remove unnecessary spaces
package com.gqt.interviewprogram;
import java.util.Scanner;
public class remove_unnecessary_spaces {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String str = sc.nextLine();
		
		String str2 ="";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' '&& str.charAt(i+1)==' ') {
				
			}
			else {
			str2=str2+str.charAt(i);
			}
			
		}
		System.out.println(str2);
		

	}

}

//output:-
//enter the string
//Hi   good   morning
//Hi good morning

