// In mutable string we string buffer and string builder method
package com.gqt.string;

public class mutable_strings {

	public static void main(String[] args) {
	StringBuffer sb1 = new StringBuffer("sita");
	
	StringBuffer sb2 = new StringBuffer("rama");
	sb1=sb1.append(sb2);
	System.out.println(sb1);
	



//using string buffer method
StringBuilder s1 = new StringBuilder("sita");

StringBuilder s2 = new StringBuilder("Kalyan");
s1=s1.append(s2);
System.out.println(s1);
}
}