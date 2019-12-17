package week1.assignments;

public class RemoveDuplicatesWords {

	public static void main(String[] args) {
		// Use the declared String text as input
		String text = "We learnt java basics as part of java sessions in week1 and sessions also covers java basics";
		// Initialise an integer variable as count
		int count = 0; String content = "";
		/*
		 * Pseudo code 
		 * a) Split the String into array and iterate over it 
		 * b) Initialise another loop to check whether the word is there in the array 
		 * c) if it is available then increase and count by 1. 
		 * d) if the count > 1 then replace the word as "" 
		 * e) print the each word
		 */



		String[] words = text.split(" ");

		int length = words.length;

		for (int i = 0; i < words.length; i++) {

			String word = words[i];

			for (int j = i+1; j < words.length; j++) {

				if(words[i].equalsIgnoreCase(words[j])) {

					count++;
					words[j] = "";

				}

			}
			
			content = content + words[i] + " ";
			
		}


System.out.println(content);
		System.out.println(count);

	}
}