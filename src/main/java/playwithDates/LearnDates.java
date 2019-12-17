package playwithDates;

import java.util.Date;

public class LearnDates {

	public static void main(String[] args) {
		String day = "2019";
		Date today = new Date();
		int date = today.getDate();
		
		String string = Integer.toString(date);
		System.out.println(string + day);
		int i = Integer.parseInt(day);
		System.out.println(i);

		
		
	}
}
