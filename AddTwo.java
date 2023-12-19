/*
 * Adds two given integers and prints the result in a fancy way.
 */
public class AddTwo {
	public static void main(String[] args) {
		// Casting the given arguments from string to int
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		// calculating the sum of a + b
		int sum = a + b;
		
		// Printing the sum of a + b in a fancy way
		System.out.println(a + " + " + b + " = " + sum);
	}
}
