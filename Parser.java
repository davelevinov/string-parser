/* 
Assignment number    :    3.0 
File Name            :    Parser.java 
Name (First Last)    :    David Levinov  
Student ID           :    308152859
Email                :    davelevinov@gmail.com
*/

/** A parser for texts consisting of characters and integers.
 *  The parser provides sequential access services to each char 
 *  and int in the text, as described in the methods API.  */

public class Parser {
	static String str;   // the input text
	static int N;        // input size
	static int current;  // current position in the text

	/** Initializes the given string for parsing. */
	public static void init(String s) {
		str = s;
		N = str.length();
		current = 0;
	}

	/** Returns true if there are more characters to process, false otherwise. */
	public static boolean hasMoreChars() {
		return (current < N);
	}

	/** Returns the next character in the text.
	 /*  Should be called only if hasMoreChars() is true. */
	// Side effect: advances current just beyond the character.
	public static char nextChar() {
			char nextL = str.charAt(current);
			current++;
			return nextL;
						
	}

	/** Returns the next integer in the text.
	 *  Should be called only if hasMoreChars() is true.
	 *  It is assumed that this function is called only if the caller knows that
	 *  the next char in the string is the beginning of an integer. */
	// Side effect: advances current just beyond the integer.
	public static int nextInt() {
			
			String digit = "";
			int num = 0;
			if (current < N) {
				// search for integers only
			while ((str.charAt(current) < 58) && (str.charAt(current) > 47) &&
			       (current < N)) {					 
				digit = digit + str.charAt(current);
				if (current + 1 <= N)
				current++;
				if (current + 1 > N)
					break;
			}
			num = Integer.parseInt(digit);
			}			
		return num;
					
	}
}

	