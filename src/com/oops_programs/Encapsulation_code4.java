package com.oops_programs;
class cricket{
	 private String name;
	 private String country;
	 private int age;
	 private int jersy_no;
	 private int runs;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getJersy_no() {
		return jersy_no;
	}
	public void setJersy_no(int jersy_no) {
		this.jersy_no = jersy_no;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	 
	 
}
public class Encapsulation_code4 {

	public static void main(String[] args) {
		cricket c1=new cricket() ;
		c1.setName("Sachin");
		c1.setCountry("india");
		c1.setAge(23);
		c1.setJersy_no(10);
		c1.setRuns(300);
		
		System.out.println(c1.getName());
		System.out.println(c1.getCountry());
		System.out.println(c1.getAge());
		System.out.println(c1.getJersy_no());
		System.out.println(c1.getRuns());
		
		
		
	
		
	}

}
