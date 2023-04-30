//It is a problem scenario where the compiler is confused in
//differentiating between instance variable and local variable

//this results in the default values being retained in the instance variable

package com.oops_programs;

class Dog4{
private String name;
private int age; 
private int cost; 
private String color;
private String breed;


void setData(String name,int age,int cost,String color,String breed) {
	 name=name;
	 age=age;
	 cost= cost;
	 color =color;
	 breed=breed;
}
void getData() {
	  System.out.println(name);
	  System.out.println(age);
	  System.out.println(cost);
	  System.out.println(color);
	  System.out.println(breed);


}
	 
}
public class Shadowing_Problem {

	public static void main(String[] args) {
		Dog4 d4=new Dog4();
		d4.setData("Rocky", 15, 5000, "black", "GR");
		d4.getData();

	}

}

//output:-
//null
//0
//0
//null
//null

