package day2.classroom.str;

public class testreverseeven {

	public static void main(String[] args) {
		// Here is the input
		String test="software tester works to deliver quality product";
		int count = 0; String content = "";String reverseword = "";



		String[] words = test.split( " ");

		int length = words.length;

		for (int i = 0; i < words.length; i++) {

			String word = words[i];
			int wordlen = word.length();


			if(i%2 !=0) {

				reverseword = words[i];
				
				System.out.println(reverseword);
				
			}


	}


}
}

