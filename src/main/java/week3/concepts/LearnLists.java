package week3.concepts;

import java.util.ArrayList;

public class LearnLists {

	
	
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		
		a.add("Apple");
		a.add("Ball");
		a.add("Ant");
		a.add("Cat");
		a.remove("Ant");
		a.remove(2);
		
		
		System.out.println(a);

		if (a.contains("Apple")) {
			System.out.println("found");
			
		}
		else {
			System.out.println("not found");
		}
	}
	
}
