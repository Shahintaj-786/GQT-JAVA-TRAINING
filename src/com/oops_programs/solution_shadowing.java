//the usage of this keyword with instance variable will help the compiler
//to recognize the instance and local variable
package com.oops_programs;
class Dog5{
private String name;
private int age; 
private int cost; 
private String color;
private String breed;

void setData(String name,int age,int cost,String color,String breed) {
	this.name=name;
	this.age=age;
	this.cost=cost;
	this.color=color;
	this.breed=breed;
	
}
void getData() {
	System.out.println(name);
	System.out.println(age);
	System.out.println(cost);
	System.out.println(color);
	System.out.println(breed);
}

}

public class solution_shadowing {

	public static void main(String[] args) {
		Dog5 d5 = new Dog5();
		d5.setData("tommy", 13, 2000, "brown", "GR");
		d5.getData();

	}

}

//Output:-
//tommy
//13
//2000
//brown
//GR

