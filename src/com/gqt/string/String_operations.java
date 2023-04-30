package com.gqt.string;

public class String_operations {

	public static void main(String[] args) {
		
		String s1="Mahabharatha";
		System.out.println(s1.toUpperCase()); //MAHABHARATHA
		System.out.println(s1.toLowerCase()); //mahabharatha

		System.out.println(s1.charAt(5)); //h
		//System.out.println(s1.charAt(50)); //java.lang.StringIndexOutOfBoundsException
		System.out.println(s1.indexOf('t')); //9
		System.out.println(s1.indexOf('a')); //1
		
		System.out.println(s1.startsWith("Maha")); //true
		System.out.println(s1.startsWith("Vaha")); //false
		System.out.println(s1.startsWith("maha")); //false
		System.out.println(s1.endsWith("ratha"));   //true
		System.out.println(s1.endsWith("tha"));     //true
		System.out.println(s1.endsWith("Vaha"));    //false
		System.out.println(s1.contains("Bharath"));   //false
		System.out.println(s1.contains("bharat"));    //true
		System.out.println(s1.getClass());      //class java.lang.String
		System.out.println(s1.isBlank()); //false
		System.out.println(s1.isEmpty()); //false
		System.out.println(s1.length());   //12
		System.out.println(s1.lastIndexOf('a')); //11
		
		
	}

}
