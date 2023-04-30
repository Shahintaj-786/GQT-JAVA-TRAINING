//method 3

//with no input and return the output
//
package com.Methods;

class calculator3{
	int add() 
	{
		int a=10;
		int b=20;
		int c=a+b;
		return c;
	}
}

public class method_type3 {

	public static void main(String[] args) {
		calculator3 c3 =new calculator3();
		int res = c3.add();
		System.out.println("the output is "+res);
		
		

	}

}
