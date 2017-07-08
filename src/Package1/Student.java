/**
 * Java program which access the package from another package.
 * If you use import keyword then only declared class of this package will be accessible 
 * in sub packages.
 */

package Package1; // Creating package 1

public class Student { // Creating a class
	String name = "Nitish Negi"; // Declaring String variable
	int roll = 111; // Declaring integer variable

	public void display() { // display method

		System.out.println(name + " " + roll);
	}
}
