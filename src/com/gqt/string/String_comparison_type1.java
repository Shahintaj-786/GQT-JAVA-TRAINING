//when the String  is created using literal
//There are diffrent ways of comparison of strings
//Type 1:-using equals()


package com.gqt.string;

public class String_comparison_type1 {

	public static void main(String[] args) {
		String s1 = "Global";
		String s2 ="Global";
		
		if(s1.equals(s2)==true) 
		{
			System.out.println("Strings are equal");
			
		}
		else {
			System.out.println("Strings are not equal");
		}
		
		
	}

}
