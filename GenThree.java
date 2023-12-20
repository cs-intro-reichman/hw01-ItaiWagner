/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		// Cast the 2 given numbers for the range from string type to int type
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		// assigining the a and b to min/max vars
		int minVar = Math.min(a, b);
		int maxVar = Math.max(a, b);
		
		// Calculating 3 numbers using the random function by multiplying it by the (b - a) and prints them
		int randomNumber1 = (int) ((maxVar - minVar)*(Math.random())) + minVar;
		System.out.println(randomNumber1);
		int randomNumber2 = (int) ((maxVar - minVar)*(Math.random())) + minVar;
		System.out.println(randomNumber2);
		int randomNumber3 = (int) ((maxVar - minVar)*(Math.random())) + minVar;
		System.out.println(randomNumber3);
		
		// Calculate who is the minimal number
		int minNumber = Math.min((Math.min(randomNumber1, randomNumber2)), randomNumber3);
		System.out.println("The minimal generated number was " + minNumber);
	}
}
