package com.Methods;
//method overloading
class calculator{
	int add(int a,int b) {
		return a+b;
	}
	float add(float a,float b) {
		return a+b;
	} 
	int add(int a,int b,int c) {
		return a+b+c;
	}
	double add(double a,double b) {
		return a+b;
	}
	float add(float a,int b) {
		return a+b;
	}
}



public class methode_overloading {

	public static void main(String[] args) {
		calculator c =new calculator();
		System.out.println(c.add(20,30));
		System.out.println(c.add(20.4f, 30.5f));
		System.out.println(c.add(20,30,40));
		System.out.println(c.add(20.5f,30));

	}

}
//output:-
//50
//50.89999961853027
//90
//50.5

