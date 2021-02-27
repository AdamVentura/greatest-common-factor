/*
 * Adam Ventura
 * 02/27/2021
 * This program uses the Euclidean algorithm to calculate the greatest common factor of two numbers.
 */
package euclidean_algorithm;

import java.util.Scanner;

public class euclidean_algorithm {

	public static void main(String[] args) {
		// Create instance of input reader
		Scanner reader = new Scanner(System.in);
		// Create instance of class
		euclidean_algorithm  ea = new euclidean_algorithm();
		// Declare variables
		int iNum1, iNum2, iGCF;
		// Prompt user for numbers
		System.out.println("Enter in a number: ");
		iNum1 = reader.nextInt();
		System.out.println("Enter in a number: ");
		iNum2 = reader.nextInt();
		// Call the EuclideanAlgorithm method
		iGCF = ea.EuclideanAlgorithm(iNum1, iNum2);
		// Call the PrintGCF method to print the greatest common factor.
		ea.PrintGCF(iGCF);

	}
	
	// Create method of the Euclidean algorithm
	public int EuclideanAlgorithm(int iNum1, int iNum2) {
		// Declare variables
		int iQuotient, iRemainder;
		// Make calculations
		iQuotient = iNum1/iNum2;
		iRemainder = iNum1 % iNum2;
		// If remainder is equal to 0 than iNum2 is the greatest common factor, return iNum2.
		if (iRemainder == 0) {
			return iNum2;
			}
		// If remainder is not equal to 0 use recursion to repeat the method with the numbers modified
		else if (iRemainder != 0) {
			return EuclideanAlgorithm(iNum1 = iNum2, iNum2 = iRemainder);
		}
		// A return statement is required outside of the if statements, though it is impossible that this value would ever be returned 
		// because the if statements cover all numbers negative infinity through infinity.
		return(0);
		
	}
	// Create method to print the greatest common factor
	public void PrintGCF(int iGCF) {
		System.out.println("The greatest common factor is " + iGCF + ".");
	}

}
