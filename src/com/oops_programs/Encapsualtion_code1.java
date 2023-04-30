//program where encapsulation is not present

package com.oops_programs;
class Dog{
	String name="puppy";
	int age =10;
	int cost =2000;
	String breed="GR";
}


public class Encapsualtion_code1 {

	public static void main(String[] args) {
		Dog d1 = new Dog();
         System.out.println(d1.name);
         System.out.println(d1.age);
         System.out.println(d1.cost);
         System.out.println(d1.breed);
         
	} 

}
// As seen above code we are all able to access the properties of the class Dog
// just by creating the object.

// As per the encapsulation these properties are most important component of hence they should not be  directly accessed outside. 

//Output:-

//puppy
//10
//2000
//GR
