/* 
Assignment number    :    3.0 
File Name            :    Expand.java 
Name (First Last)    :    David Levinov  
Student ID           :    308152859
Email                :    davelevinov@gmail.com
*/

public class Expand {
	public static void main(String[] args){
		Parser.init(args[0]);
		char printed;
		int times = 0;
		while (Parser.hasMoreChars()) {
			printed = Parser.nextChar();
			times = Parser.nextInt();
			// prints the character for times defined by next integer
			for (int i = 0; i < times; i++) {
				System.out.print(printed);
			}
		}		
	}
}