package week1.assignments.optional;

public class FindAllPrimeNumbers {

	public static void main(String[] args) {
		//Declare an int variable range with value 100
		int range = 30;
		//Declare another int variable for counting
		int i;
		int j;
		String primeNumbers = "";

		//Build a logic to find all the prime numbers from 1 to 100
		/*
		 * Pseudo Code
		 * a) Iterate a loop with i from 1 to range
		 * b) Iterate another loop with j from 1 to i (nested loop)
		 * c) Check if i is divisible by j, if so, increase the count
		 * d) if count is 2, then print i
		 * e) Make sure that count is reset to 0 for each iteration
		 */
		//Empty String

		for (i = 0; i < range; i++) {
			int  count = 0;

			for (j = i; j >=1; j--) {

				if (i%j ==0) {
					count++;
				}
			}

			if (count == 2)

			{
				primeNumbers = primeNumbers + " " + i;

			}

		}
		System.out.println("Primenumbers below " + range + " are: " + primeNumbers);
//		System.out.println(primeNumbers);

	}
}
