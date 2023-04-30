//using comapre To

package com.gqt.string;

public class String_coamprison_type4 {

	public static void main(String[] args) {
		String s1 ="Global";
		String s2 ="Global";
		String s3 ="gloBaL";
		if(s1.compareTo(s2)==0) {
			System.out.println("String are s1 and s2equal");
			
			}
		else {
			System.out.println("Strings are  s1 and s2 not equal");
		}
		if(s1.compareTo(s3)==0) {
			System.out.println("String s1 and s3 are equal"); 
		}
		else {
			System.out.println("String s1 and s3 are not equal"); 
		}
	}
	
	
	
}

//logic for comapreTo
//G 	l	 o	  b	  a	   l
//71	108	 111  98  97  108  ASCII Values

//G 	l	 o	  b	  a	   l
//71	108	 111  98  97  108  ASCII Values

//The diffrence between two string is 0
//hence they are same

//case 2
//G 	l	 o	  b	  a	   l
//71	108	 111  98  97  108  ASCII Values

//g 	l	  o	   B   a    L
//103   108   111  66  97   76

//the difference between them is not 0
//hence they are not equal
