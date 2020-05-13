package OfficeHours.Practice_04_15_2020;

public class Greetings
{
	public static void main(String[] args)
	{
		String firstName,lastName;
		greetNames(firstName = "Jean Michel ",lastName = "Chauvet");
	}
	
	public static void greetNames( String firstName,String lastName)
	{
	 String greets ="Hello " + firstName + "" + lastName;
		System.out.println(greets);
	}
}
