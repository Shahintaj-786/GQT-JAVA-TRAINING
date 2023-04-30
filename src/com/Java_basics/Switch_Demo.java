package com.Java_basics;

public class Switch_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char x ='l';
		switch(x)
		{
		case 'l':
		case 'L':
System.out.println(x+" is a letter");
		case 'd':
		case 'D':
		System.out.println(x+" is a digit");
		break;
		case 'w':
		case 'W':
		System.out.println(x+"is a white space");
		break;
		case 's':
		case 'S':
		System.out.println(x+"is Special Symbol");
		default:
		System.out.println(x+"is other than letter,digit,space or special symbol");
		
		
		

	}

}
}
