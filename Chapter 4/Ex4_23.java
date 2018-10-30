/*
Bryton Lunceford
10/30/18
Financial Payroll
*/

import java.util.Scanner;

public class Ex4_23 {
	public static void main(String[] args) {
		Scanner input = new Scaner(System.in);
		System.out.print("Enter employee: ");
		String name = input.nextLine();
		
		System.out.print("Enter number of hours worked in the week ");
		double hours = input.nextDouble();
		
		System.out.print("Enter hourly rate ");
		double rate = input.nextDouble();
		
		System.out.print("Enter federal tax withholding rate ");
		double ftax = input.nextDouble();
		
		System.out.print("Enter state tax withholding rate ");
		double stax = input.nextDouble();
	}
}