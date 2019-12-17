package week1.assignments.optional;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		//Declare a String 
		String text1 = "LISTEN1";
		//Declare another String
		String text2 = "SiLent";
		int count = 0;

		//build logic to check the given words are anagram or not

		/*
		 * Pseudo Code
		 * a) Check length of the strings are same then
		 * b) Convert both Strings in to characters
		 * c) Sort Both the arrays
		 * d) Check both the arrays has same value
		 * 
		 */

		int length1 = text1.length();
		int length2 = text2.length();

		if (length1 != length2) {

			System.out.println("Given words are not Anagram");

		}

		if (length1 == length2) {

			
			
			char[] charArray1 = text1.toLowerCase().toCharArray();
			char[] charArray2 = text2.toLowerCase().toCharArray();

			Arrays.sort(charArray1); 
			Arrays.sort(charArray2);

			for (int i = 0; i < charArray2.length; i++) {
				if (charArray1[i] != charArray2[i] ) {

					count++;

				}
			}

			if(count>0) {
				System.out.println("Given words are not Anagram");
			}

			else {
				System.out.println("Given words are Anagram");
			}
		}




	}

}



