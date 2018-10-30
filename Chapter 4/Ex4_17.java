/*
Bryton Lunceford
10/30/18
How many days are in a  month?
*/

import java.util.Scanner;

public class Ex4_17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a year: ");
		int year = input.nextInt();
		System.out.print("Enter a month: ");
		String month = input.next();
		
		boolean leapYear =
			((year % 4 == 0)&& (year % 100 != 0)) || (year % 400 == 0);
				
		System.out.println(month + " " + year + " has ");
		
		
		if ( month.equals("Jan") || month.equals("May") || month.equals("Jul") || month.equals("Mar") || month.equals("Aug") || month.equals("Oct") || month.equals("Dec"))
		
			System.out.println(31 + " days ");
		
		else if ( month.equals("Apr") || month.equals("Jun") || month.equals("Sep") || month.equals("Nov"))
		
			System.out.println(30 + " days ");
			
		else 
		
			System.out.println(((leapYear) ? 29 : 28) + " days ");
	}
}