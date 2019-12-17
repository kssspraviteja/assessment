package day1.classroom;

public class SwitchOperator {

	/*
	 * Goal: Perform calculation based on the user input operations
	 * 
	 * inputs: 2,3 and "add"
	 * output: added value: 5
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a Switch case: type 'switch', followed by: ctrl + space + down arrow + enter
	 *   
	 * What are my learnings from this code?
	 * 1)
	 * 2)
	 * 3) 
	 * 
	 */	
	
	public static void main(String[] args) {
		
		// Declare 2 integer numbers
		
int i = 2;
int n = 5;
int m = 0;


		// Declare a String variable with input as operations (Tip:
String Operation = "Add";


		// Initiate switch case for operations
		
switch (Operation) {
case "Add":
	m = i + n;
	System.out.println(m);
	
	break;

case "Sub":
	m = n - 1;
	System.out.println(m);
	
	break;
	
	
case "Mul":
	m = i * n;
	System.out.println(m);
	
	break;
	
case "Div":
	m = n/i;
	System.out.println(m);
	
	break;
	
default:
	System.out.println("invalid operation");
	break;
}
			// Within switch, include as case for add operation
		
		
			// Within switch, include as case for sub operation
		
		
			// Within switch, include as case for mul operation
		
		
			// Within switch, include as case for div operation
		
		
			// Within switch, include 'default' to handle other operations
		
		
		//end of switch case
		
	}

}
