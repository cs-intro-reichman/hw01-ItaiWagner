/*
 * Write a program that gets a quantity of cents as a command-line argument.
 * The program prints how to represent this quantity using as many quarters as possible, plus the remainder in cents.
 */
public class Coins {
	public static void main(String[] args) {
		// Casting the input cents number from string type to int type
		int input_cents = Integer.parseInt(args[0]);

		// Divides the total amount of cents to 25 to find how many quarters to use
		int quarters_num = input_cents / 25;

		// calculate how many cents to use using modulo
		int cents_num = input_cents % 25;

		// Prints the full string of how many quarters and cents to use   
		System.out.println("Use " + quarters_num + " quarters and " + cents_num + " cents");
	}
}