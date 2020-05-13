package day29_Wrapper_ArrayList;

import java.util.ArrayList;


public class CreateArrayList {
	public static void main(String[] args) {
		//Create an Arraylist
		ArrayList<String> animals = new ArrayList<>();
		animals.add("Lion");
		animals.add("Dogs");
		animals.add("Cats");
		animals.add("Snakes");
		
		System.out.println(animals);
		
		animals.add(2,"Cows");
		animals.add(5,"Chickens");
		animals.add(3,"Fish");
		
		System.out.println(animals);
	}
}
