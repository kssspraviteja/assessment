package day2.classroom.arrays;

import java.util.Arrays;

public class DisplayArrayvalues {
public static void main(String[] args) {
	String data[] = {"Apple", "Cat", "Bat", "Rabbit"};
	
	int datalength = data.length;
	Arrays.sort(data);
	for (String content : data) {
		System.out.println(content);
		
	}
}
}
