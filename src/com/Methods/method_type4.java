//method 4
//with input(parameters) and return type(output)

package com.Methods;
class calculator4{
	int add(int a,int b) 
	{
		int c =a+b;
		return c;
	}
}
public class method_type4 {

	public static void main(String[] args) {
		calculator4 c4 = new calculator4();
	       int res=c4.add(20,40);
	       System.out.println("the result is "+res);
		

	}

}
