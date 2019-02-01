/* 
Assignment number    :    3.0 
File Name            :    Stats.java 
Name (First Last)    :    David Levinov  
Student ID           :    308152859
Email                :    davelevinov@gmail.com
*/

public class Stats {
	public static void main(String[] args){
		int sum = 0;
		double average = 0;
		double deviation = 0;
		int[] values = new int[args.length];
		for (int i = 0; i < values.length; i++) {
			values[i] = Integer.parseInt(args[i]);
		}
		for (int j = 0; j < values.length; j++) {
			sum = sum + values[j];
		}
		average = (double)sum / values.length;
		for (int k = 0; k < values.length; k++) {
			if (values[k] < average)
			deviation = deviation + (average - values[k]);
			if (values[k] > average)
			deviation = deviation + (values[k] - average);
		}
		System.out.print("The average is " + average +
				". The absolute deviation is " + deviation / values.length);
	}
}	