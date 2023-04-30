//program is demonstrate the data types
package com.Java_basics;

public class Primitive_Datatypes {

	public static void main(String[] args) {
		
		//byte takes 1 byte
		byte byteMax	=127;
		byte byteMin 	=-128;
		System.out.println("The max range of the byte is "+byteMax +" The min range of the byte is "+byteMin);
		
		//short - 2 bytes
		short shortMax	=32767;
		short shortMin	=-32768;
		System.out.println("Min range of short is "+shortMin +" max range of short is"+shortMax);
		
		//int -4 bytes
          	int MaxInt = 2147483647;
          	int MinInt = -2147483648;
          	System.out.println("Min range of int is "+MinInt + " Max range of int is "+MaxInt);
          	
         // long  -8bytes
          	long maxlong	=9223372036854775807L;
          	long minlong	=-9223372036854775808L;
          	System.out.println("min range of long is "+minlong + "max range of long is "+maxlong);
          	
          	float f= 3234.141243278345f;
          	double  d = 3456.141245512345678902345678914f;
          	System.out.println("float value is "+f+" double is "+d);
          	
          	//boolean
          	boolean flag =false;
          	System.out.println("The boolean value is"+flag);
          	
          	
          	
          	
          	
          	

	}

}
