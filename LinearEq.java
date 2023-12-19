/*
 * Solves linear equations of the form a⋅x + b = c.
 * The program gets a, b, and c as command-line arguments,
 * computes x, and prints the result.
 * Treats the three arguments as well as the computed value as double values
 */
public class LinearEq {
	public static void main(String[] args) {
		// Cast the 3 arguments a,b and c from string type to double type
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double c = Double.parseDouble(args[2]);
		
		// Calculate the value of x for the equation type: a*x + b = c
		double x = (c-b)/a;
		
		// Prints the value of x
		System.out.println(a + "*x + " + b + " = " + c);
		System.out.println("x = " + x);
	}
}