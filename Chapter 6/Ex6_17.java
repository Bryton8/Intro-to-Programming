/*
Bryton Lunceford
12/10/18
Display a matrix of 0's and 1's
*/

import java.util.Scanner;

public class Ex6_17 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter n: ");
		System.out.print("Enter n: ");
		int n = input.nextInt();
		printMatrix(n);
	}

	public static void printMatrix(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(intRandom(0, 1) + " ");
			}
			System.out.println();
		}

	}

	public static int intRandom(int lowerBound, int upperBound) {
		return (int) (lowerBound + Math.random()* (upperBound - lowerBound + 1));
	}

}
		
