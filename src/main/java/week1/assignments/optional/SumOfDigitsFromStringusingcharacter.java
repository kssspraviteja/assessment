package week1.assignments.optional;

public class SumOfDigitsFromStringusingcharacter {

	public static void main(String[] args) {
		// Declare a String text with the following value
				String text = "Tes12Le79af65";
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
				
				
				char[] charArray = text.toCharArray();
				int length = charArray.length;
				for (int i = 0; i < charArray.length; i++) {
					int a = 0;
				if(Character.isDigit(charArray[i])) {
					
					
//				Another method is to remove the value of character '0' from the existing character. 
					
//					a = charArray[i]-'0';
					
					a = Character.getNumericValue(charArray[i]);
					
												
					
				}
				
					
				sum = sum + a;
					
									
				}
				System.out.println(sum);
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