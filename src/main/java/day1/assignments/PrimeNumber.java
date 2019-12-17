package day1.assignments;

public class PrimeNumber {
	
	/*
	 * Goal: To find whether a number is a Prime number or not
	 * 
	 * input: 13
	 * output: 13 is a Prime Number
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a 'for' loop: type 'for', followed by ctrl + space + down arrow + enter
	 * 3) To create an 'if' condition: type 'if', followed by ctrl + space +down arrow + enter
	 *   
	 * What are my learnings from this code?
	 * 1)
	 * 2)
	 * 3) 
	 * 
	 */
	
	public static void main(String[] args) {

		// Declare an int Input and assign a value
		int i = 15;
		int m;
		// Declare a boolean input as flag
boolean NotPrime = false;


		// Iterate from 1 to half of the input

for(int n= 2; n <= i/2; n++)
{
	if(i%n == 0)
	{
		NotPrime = true;
				break;
	}
	
}

	if(!NotPrime)
	{
		System.out.println("The given number is  prime");
		
	}
	else
	{
		System.out.println("The given number is not prime");
	}

	


// Divide the input with each for loop variable and check the remainder
			
				// Set the flag as true when there is no remainder
				
				// break the iterator
				
		// Check the flag (Provide a condition)
		
			// Print 'Prime' when the condition matches
			
			// Print 'Not a Prime' when the condition doesn't match 
			
		

	}

}
