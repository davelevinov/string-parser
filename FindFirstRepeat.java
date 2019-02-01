/* 
Assignment number    :    3.0 
File Name            :    FindFirstRepeat.java 
Name (First Last)    :    David Levinov  
Student ID           :    308152859
Email                :    davelevinov@gmail.com
*/

public class FindFirstRepeat {
	public static void main(String[] args){
		// define array size
		int[] values = new int[args.length];
		boolean repeated = false;
		int num = 0;
		// initialize array
		for (int i = 0; i < values.length; i++) {
			values[i] = Integer.parseInt(args[i]);
		}
		// checking for equality for each value from its own position onwards
		for (int j = 0; (j < values.length) && (repeated == false); j++) {
			for (int k = j; k < values.length - 1; k++) {
				if (values[j] == values[k + 1]) {
					repeated = true;
					num = values[k + 1];
					break;
				}
			}			
		}
		if (repeated == true)
			System.out.println("First repeating element is " + num);
		else
			System.out.println("No repeating elements");
	}
}	