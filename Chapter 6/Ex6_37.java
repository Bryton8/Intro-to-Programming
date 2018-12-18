/*
Bryton Lunceford
12/18/18
format an integer
*/

import java.util.Scanner;

public class Ex6_37 {

	public static void main(String[] args) {
		System.out.print("Enter an integer: ");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		System.out.print("Enter the width: ");
		int width = input.nextInt();
		System.out.println(format(number, width));
	}

	public static String format(int number, int width) {
		int numberOfDigit = getSize(number);
		String format = String.valueOf(number);

		for (int i = 0; i < width - numberOfDigit; i++) {
			format = "0" + format;
		}

		return format;
	}
	public static int getSize(long d) {

		int numberOfDigit = 1;
		while ((d = d / 10) !=0) {
			numberOfDigit++;
		}
		return numberOfDigit;

	}
}