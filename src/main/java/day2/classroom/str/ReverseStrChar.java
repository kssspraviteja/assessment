package day2.classroom.str;

public class ReverseStrChar {

	public static void main(String[] args) {
		String name = "Ravi Teja";
		
		int size = name.length();
		
		for (int i = size-1; i >= 0; i--) {
			System.out.print(name.charAt(i));
			
		}
	}
}
