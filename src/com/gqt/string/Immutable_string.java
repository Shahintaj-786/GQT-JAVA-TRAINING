//What do you mean by statement "Immutable Strings cannot be changed"
package com.gqt.string;

public class Immutable_string {

	public static void main(String[] args) {
		
		String s1 = "sita";
		String s2 ="ravana";
		s1=s1.concat(s2);
		System.out.println(s1);

	}

}
