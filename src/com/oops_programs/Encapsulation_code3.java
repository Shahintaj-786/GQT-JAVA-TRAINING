//using general getter and setters
package com.oops_programs;
class Dog3{
	private String name;
	private int age; 
	private int cost; 
	private String color;
	private String breed;
	
	//using general set data
	 void setData(String a,int b,int c,String d,String e) {
		 name=a;
		 age=b;
		 cost= c;
		 color =d;
		 breed=e;
	 }
		 //using general getters
		   void getData() {
			  System.out.println(name);
			  System.out.println(age);
			  System.out.println(cost);
			  System.out.println(color);
			  System.out.println(breed);
		  
		 
	 }
}
public class Encapsulation_code3 {

	public static void main(String[] args) {
		Dog3 d3=new Dog3();
		d3.setData("Rocky", 15, 5000, "black", "GR");
		d3.getData();
	}

}
