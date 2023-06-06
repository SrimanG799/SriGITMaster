package com.ciq.person;

public class Person {

	String name;
	String gender;
	public Person(String name, String gender) {
		//super();
		this.name = name;
		this.gender = gender;
	}
	
	public void getGender()
	{
		System.out.println(this.gender);
	}
	
	public static void main(String[] args) {
		Male m=new Male("sriman", "male");
		m.getGender();
		
		Female f=new Female("laxmi", "female");
		f.getGender();
	}
	
	
	
}
