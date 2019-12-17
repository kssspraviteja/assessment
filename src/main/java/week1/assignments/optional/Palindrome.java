package week1.assignments.optional;

public class Palindrome {

	public static void main(String[] args) {
		//Declare a String text with a value
				String text = "aabbaa";
				//Declare another String rev
				String rev = "";
				
				//Build a logic to find the given string is palindrome or not
				/*
				 * Pseudo Code
				 * a) Iterate over the String in reverse order
				 * b) Add the char into rev
				 * c) Compare text and rev, if it is same then print palindrome 
				 */

				
				char[] charArray = text.toCharArray();
				
				int length = charArray.length;
				
				for(int i = length-1; i>=0; i--) {
				
					rev = rev + charArray[i];
					
//					System.out.print(charArray[i]);
				}
					
				System.out.println(rev);
				
				if (rev.equalsIgnoreCase(text)) {
					
					System.out.println("Entered string is a pallindrome");
					
				}
				else {
					System.out.println("Entered String is not pallindrome");
				}
	}

}
