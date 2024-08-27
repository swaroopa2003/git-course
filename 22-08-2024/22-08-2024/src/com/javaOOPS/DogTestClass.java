package com.javaOOPS;

//Java program/application starts from class
public class DogTestClass
{

	//Java program/application execution starts/run from this method
	public static void main(String[] args)
	{
		//new keyword: always creates a new object/instance 
		             //based on given class name
		
		/**
		 * System.out.println(new Dog().hashCode());
		 * 
		 * System.out.println(new Dog().hashCode());
		 * 
		 * System.out.println(new Dog().hashCode());
		 * 
		 * System.out.println(new College().hashCode());
		 */
		
		/**
		 * int value = 450;
		 * 
		 * String name = "Deepak";
		 * 
		 * System.out.println(new Dog().hashCode());
		 * 
		 * Dog dog1 = new Dog(); System.out.println(dog1.hashCode());
		 * 
		 * System.out.println(new College().hashCode());
		 * 
		 * College college1 = new College(); System.out.println(college1.hashCode());
		 */
		
		Dog dog1 = new Dog();
		dog1.getDogInformation();
		
		Dog dog2 = new Dog("Puppy", "Black and White", 4);
		dog2.getDogInformation();
		
		Dog dog3 = new Dog("Jhony", "Black and Red", 2);
		dog3.getDogInformation();
		
		College college1 = new College();
		
		//instanceof
		
		if(college1 instanceof College)
		{
			System.out.println("college1 is an instance/object of College class");
		}
		else
		{
			System.out.println("college1 is not an instance/object of College class");
			
		}
	}

}
