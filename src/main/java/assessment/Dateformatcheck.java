package assessment;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.apache.poi.hpsf.Date;

public class Dateformatcheck {


	public static void main(String[] args) {


//		Date dated = new Date();
//		DateFormat df = new SimpleDateFormat();
//		System.out.println(df);
//		
//		String today = df.format(dated);
//		int tomorrow = Integer.parseInt(today) +1;
//		System.out.println(tomorrow);
//		String Stom = Integer.toString(tomorrow);
//		String xpath = "//div[contains( text()," + Stom + ")";
//		System.out.println(xpath);
		
java.util.Date today = new java.util.Date();

int date = today.getDate();
System.out.println(date);
	}
		
}
