/*
Bryton Lunceford
11/26/18
Display a pyramid with height of n where n is given by user
*/

import java.util.Scanner;

class Ex5_17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int rows = 0;
		
		System.out.print("Enter height of pyramid (1-15): ");
		rows = input.nextInt();
		
		while (rows < 1 || rows > 15 ) {
			System.out.print("Enter height of pyramid (1-15): ");
			rows = input.nextInt();
		}
		
		for (int r = 1; r <= rows; r++) {
			// count number of spaces
			for (int spaces = 1; spaces <= (rows - r); spaces++) {
				System.out.print("   ");
			}
			
			// print left side of pyramid
			for (int left =  r; left >= 1; left--) {
				if (left > 9){
					System.out.print(left + " ");
				}
				else {
					System.out.print(left + "  ");
				}
			}
			// print right side of pyramid
			for (int right = 2; right <= r; right++) {
				if (right > 9) {
					System.out.print(right + " ");
					}
				else {
					System.out.print(right + "  ");
				}
			}
			System.out.println();			
		}
	}
}