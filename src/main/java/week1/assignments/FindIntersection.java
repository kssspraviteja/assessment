package week1.assignments;

public class FindIntersection {

	public static void main(String[] args) {
		// Here is the input 
				int[] arr1 = {3,2,11,4,6,7};
				int[] arr2 = {1,2,8,4,9,7};
				
				//Build a logic to identify the intersection between given arrays
				
				/* Pseudo Code: 
				 * 1)Traverse through each array item for each given array (use nested for loop)
				 * 2)Compare both the arrays 
				 * 3) Print the matching item
				 */

				
				int lenght1 = arr1.length;
				int length2 = arr2.length;
				
				for (int i = 0; i < arr1.length; i++) {
					
					for (int j = 0; j < arr2.length; j++) {
						
						if(arr1[i] == arr2[j]) {
							
						
//						int val1 = arr1[i];
//						int val2= arr2[j];
//						if(val1 == val2) {
					
						
							System.out.print(arr1[i] + " ");		
							
						}
						
					
					}
				
					
						}
												
					}

}
