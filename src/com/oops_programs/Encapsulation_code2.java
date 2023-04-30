//program for encapsulation 
//to access the private members we need to use getters and setters method
package com.oops_programs;
class Dog2{
	 private String name;
	 private int age; 
	 private int cost; 
	private String color;
	private String breed;
	
	//using getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	
}
public class Encapsulation_code2 {

	public static void main(String[] args) {
		Dog2 d2 =new Dog2();
		d2.setName("tommy");
		d2.setAge(10);
		d2.setCost(2000);
		d2.setBreed("GR");
		d2.setColor("white");
		
		System.out.println(d2.getName());
		System.out.println(d2.getAge());
		System.out.println(d2.getCost());
		System.out.println(d2.getColor());
		System.out.println(d2.getBreed());
		
		

	}

}
