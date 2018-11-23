/*
Bryton Lunceford
11/22/18
count negative, positive numbers and find avaerage
*/

import java.util.Scanner;

class Ex5_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
			System.out.print("Enter a positive or negative number: ");
			int n, countNeg = 0, countPos = 0;
			float sum = 0;
		while ((n = input.nextInt()) != 0)  {
			System.out.print("Enter a positive or negative number (0 to quit): ");
			sum = sum + n;
		if (n > 0) {
			countPos++;
		}	else if (n < 0) {
			countNeg++;
		}
	}
	
	if (countPos + countNeg == 0) {
		System.out.println("No numbers are entered, except 0");
		System.exit(0);
	}	
	System.out.println("The number of positives is " + countPos);
	System.out.println("The number of negatives is " + countNeg);
	System.out.println("The total is " + sum);
	}
}