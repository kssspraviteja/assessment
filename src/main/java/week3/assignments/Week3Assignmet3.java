package week3.assignments;

import java.util.ArrayList;
import java.util.Collections;

public class Week3Assignmet3 {

	public static void main(String[] args) {
		
		
		ArrayList<String> a = new ArrayList<String>();
		
		
		a.add("HCL");
		a.add("Aspire Systems");
		a.add("CTS");
		a.size();
		
		System.out.println(a.indexOf("CTS"));
		System.out.println(a);
		
		Collections.sort(a);
		System.out.println(a);
		
		Collections.reverse(a);
		System.out.println(a);
//		for (int i = a.size()-1; i >=0 ; i--) {
//			
//			System.out.print(a.get(i) + ",");
//		}
//		
		
//		System.out.println("The new reverse order is "+a);
	}
}
