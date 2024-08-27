package com.javaOOPS;

public class Dog //class name: Dog
{
	
	//Fields/Variables (Information/Features: state)
	private String dogName;
	private String dogColor;
	private int dogAge;
	
	//Initializers/Constructors/Blocks
	public Dog()//special method, use to initialize state of the Object.
	{
		dogName = "Rony";
		dogColor = "White";
		dogAge = 3;
	}
	
	//We can do dynamic initialization
	public Dog(String dogName, String dogColor, int dogAge) {
		this.dogName = dogName;
		this.dogColor = dogColor;
		this.dogAge = dogAge;
	}


	//Methods: it is block of code which has logic/operation
	public void getDogInformation()
	{
		System.out.println(dogName);
		System.out.println(dogColor);
		System.out.println(dogAge);
	}
	
	//Inner classes
	public class Child
	{
		//Fields/Variables (Information/Features: state)
		private String childDogName;
		private String childDogColor;
		private int childDogAge;
		
		//Initializers/Constructors/Blocks
		public Child()//special method, use to initialize state of the Object.
		{
			childDogName = "Puppy";
			childDogColor = "Black and White";
			childDogAge = 1;
		}
		
		//Methods: it is block of code which has logic/operation
		public void getChildDogInformation()
		{
			System.out.println(childDogName);
			System.out.println(childDogColor);
			System.out.println(childDogAge);
		}
		
		//Inner classes
		
	}
	
	
}
