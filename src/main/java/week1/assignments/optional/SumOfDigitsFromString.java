package week1.assignments.optional;

public class SumOfDigitsFromString {

	public static void main(String[] args) {
		// Declare a String text with the following value
				String text = "Tes128376ksdkf84wkejfo248uLe79af65";
				String cha = "abc";
				
				
				
				
				// Declare a int variable sum
				int sum = 0;
				
				//build a logic to get sum of all the digits from the given string
				
				/*
				 * Method 1
				 * Pseudo Code
				 * a) using replaceAll(), replace all the non-digits into ""
				 * b) Now, convert the String into array
				 * c) Iterate over the array and get each character
				 * d) Using Character.getNumericValue(), Change the char into int
				 * e) Add the values to sum & print
				 * 
				 */
				
//				text = text.replaceAll("[^0-9.]", "");
				
				text = text.replaceAll("[^\\d.]", "");
//				text = text.replaceAll("[^A-Za-z]", "");
				
				char[] charArray = text.toCharArray();
				int len = charArray.length;
				for (int i = 0; i < len; i++) {
				int num = 0;
					char a = charArray[i];
					num = Character.getNumericValue(a);
				
//					System.out.println(num);
					sum = sum + num;
				}
				
				System.out.println("The sum of the numbers in the string is '" + sum + "'");
							
								/*
				 * Method 2
				 * Pseudo Code
				 * 
				 * a) Iterate an  array over the String
				 * b) Get each character and check if it is a number using Character.isDigit()
				 * c) Now covert char to int using Character.isDigit() and add it to sum
				 * d) Now Print the value
				 */

	}

}
