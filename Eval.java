/* 
Assignment number    :    3.0 
File Name            :    Eval.java 
Name (First Last)    :    David Levinov  
Student ID           :    308152859
Email                :    davelevinov@gmail.com
*/

public class Eval {
	public static void main(String[] args){
		// initialize using parser
		Parser.init(args[0]);
		char operator = 'a';
		int num = 0;
		int result = 0;
		while (Parser.hasMoreChars())
		{
			System.out.print(Parser.nextChar());
		}
		System.out.print(" ");
		Parser.init(args[0]);
		num = Parser.nextInt();
		operator = Parser.nextChar();
		// choose which math operation according to char received from parser
			if (operator == '-')
				result = result + num - Parser.nextInt();
			if (operator == '+')
				result = result + num + Parser.nextInt();
		while (Parser.hasMoreChars())
		{
			operator = Parser.nextChar();
			if (operator == '-')
				result = result - Parser.nextInt();
			if (operator == '+')
				result = result + Parser.nextInt();
		}
		System.out.print(" = " + result);
	}
}