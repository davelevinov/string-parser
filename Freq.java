/* 
Assignment number    :    3.0 
File Name            :    Freq.java 
Name (First Last)    :    David Levinov  
Student ID           :    308152859
Email                :    davelevinov@gmail.com
*/

public class Freq {
	static int N;        // input size
	static int current;  // current position in the text
	static String[] counter = new String[26];
	static String str;
	/** Initializes the given string for parsing. */
	public static void builder(String s) {
		str = s;
		N = str.length();
		current = 0;
		int charval = 0;
		// initialize counter string array
		for (int i = 0; i < counter.length; i++) {
			counter[i] = "";
		}
		// insert values
		for (int i = 0; i < str.length(); i++) {					 
			if ((str.charAt(i) >= 'a') && (str.charAt(i) <= 'z')) {
				charval = (int)(str.charAt(i) - 'a');
				counter[charval] = counter[charval] + "*";
			}
			if ((str.charAt(i) >= 'A') && (str.charAt(i) <= 'Z')) {
				charval = (int)(str.charAt(i) - 'A');
				counter[charval] = counter[charval] + "*";
			}						
	    }
   }
	public static String nextLet() {
		String nextF = counter[current];
		current++;
		return nextF;
}
}

	