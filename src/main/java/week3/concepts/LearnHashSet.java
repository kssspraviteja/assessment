package week3.concepts;

import java.util.HashSet;
import java.util.Iterator;

public class LearnHashSet {


	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<String>();

		hs.add("Yalk");
		hs.add("Parrot");
		hs.add("Antelope");
		hs.add("Zebra");
		hs.add("Parrot");

		System.out.println(hs);


		Iterator<String> i = hs.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());

		}

	}

}

