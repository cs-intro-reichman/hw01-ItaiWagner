/*
 * Three sides can form a triangle if the sum of the lengths of any two sides is greater than the length of the remaining side. 
 * This is known as the Triangle Inequality Theorem. 
 * Write a program that tests if three given integers form a triangle.
 */ 
public class Triangle {
	public static void main(String[] args) {
		// Cast the 3 sides of a triangle a,b and c from string type to int type
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		
		// determine whether any of the combination of the 3 sides form a triangle
		boolean isTriangle1 = a + b > c;
		boolean isTriangle2 = b + c > a;
		boolean isTriangle3 = a + c > b;
		
		// Determine whether at least one of the combinations is true (form a triangle)
		boolean isAnyTriangle = (isTriangle1 || isTriangle2 || isTriangle3);
		
		// Prints the sides values and whether they can form a triangle
		System.out.println(a + ", " + b + ", " + c + ": " + isAnyTriangle);
	}
}
