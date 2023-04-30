//program to replace all the vowels by special charter specified below
/*
 * a-->@
 * e-->#
 * i-->$
 * o-->%
 * u-->&
 * sample input:-aeiou;
 * sample output:-@#$%&
 */

package com.gqt.interviewprogram;
import java.util.Scanner;
public class Replace_vowels_by_spl_char {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String str = sc.next();
		str=str.toLowerCase();
		
		String str2 ="";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a') {
				str2=str2+'@';
				
			}
			else if(str.charAt(i)=='e'){
				str2=str2+'#';
			}
			else if(str.charAt(i)=='i'){
				str2=str2+'#';
				}
			else if(str.charAt(i)=='o'){
				str2=str2+'%';
				}
			else if(str.charAt(i)=='u'){
				str2=str2+'&';
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
//shahin
//sh@h#n

//enter the string
//aeiou
//@##%&

