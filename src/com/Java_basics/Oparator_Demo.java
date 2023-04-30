package com.Java_basics;

public class Oparator_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		int x =10;
		System.out.println("a and b value before the operation:"+a+"  "+b);
		++a;//11
		int c=++a+b+a--;//12+20+12
		System.out.println("c value after the operations:"+c);
		System.out.println(a);
		int d=c++ +a+b--;
		System.out.println(b);
		System.out.println(d);
		
		//Ternary Operator
		x=(10==x)?1:0;
		System.out.println(x);
		
	    
			
			
		
	}

}
