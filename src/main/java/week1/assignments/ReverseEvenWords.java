package week1.assignments;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// Here is the input
		String test="software tester works to deliver quality product";
		int count = 0; String content = "";String reverseword = "";
		//Build a logic to reverse the even position words (output: I ma a erawtfos tester)

		/* Pseudo Code:
		a) split the words and have it in an array
		b) Traverse through each word (using loop)
		c) find the odd index within the loop (use mod operator)
		d) Convert words to character array if the position is even else print the word as it is(concatenate space at the end).
		e) print the even position words in reverse order using another loop (nested loop)

		 */

		String[] sentencewords = test.split( " ");

		int length = sentencewords.length;

		for (int i = 0; i < sentencewords.length; i++) {

			String word = sentencewords[i];
			int wordlen = word.length();

			if(i%2 !=0) {

				reverseword = sentencewords[i] + " ";
			}

			if(i%2 == 0)
			{
				
				for (int j = wordlen-1; j >= 0; j--) {

					reverseword = reverseword + word.charAt(j);			
				}

				content = content + " " + reverseword ;
				
			}
			
		}

		System.out.println("the final output is " + content.trim());		

	}

}
