/*
	Bryton Lunceford
	Savings
	10/3/18
*/

import java.util.Scanner;

public class Exercise2_13 {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);	
		final double Monthly_Interest_Rate = 0.00417;	
		
		System.out.print("Enter the monthly saving amount: ");
		double savingAmount = input.nextDouble();

		
		double total = 100 * (1 + 0.00417); //100.417
		
		total = (100 + total) * (1 + 0.00417); //201.252
		
		total = (100 + total) * (1 + 0.00417); //302.508
		
		total = (100 + total) * (1 + 0.00417); //404.174
		
		total = (100 + total) * (1 + 0.00417); //506.276
		
		total = (100 + total) * (1 + 0.00417); //608.804
		
        
		
		System.out.println("After the sixth month, the account value is " + total);
	}
}