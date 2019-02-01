/* 
Assignment number    :    3.0 
File Name            :    FreqCalc.java 
Name (First Last)    :    David Levinov  
Student ID           :    308152859
Email                :    davelevinov@gmail.com
*/

public class FreqCalc {
	public static void main(String[] args) {
	// char array to assist in printing out result from Freq
	char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l',
		'm','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	// initialize all the variables inside Freq
	Freq.builder(args[0]);
	for (int i = 0; i < alphabet.length; i++) {
		System.out.print(alphabet[i] + ":");
		System.out.println(Freq.nextLet());
	}	
	}
}

