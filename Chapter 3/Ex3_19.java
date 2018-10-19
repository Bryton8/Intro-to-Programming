/*
Bryton Lunceford
10/19/18
3/19 Compute perimeter of triangle
*/

import java.util.Scanner;

class Ex3_19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
      double perimeter;
      
		System.out.println("Enter three edges for a triangle: ");
		System.out.print(" Side 1: ");
		double s1 = input.nextDouble();
		System.out.print(" Side 2: ");
		double s2 = input.nextDouble();
		System.out.print(" Side 3: ");
		double s3 = input.nextDouble();
      
         if((s1 + s2 >= s3) && (s1 + s3 >= s2) && (s2 + s3 >= s1)) {
          perimeter = s1 + s2 + s3;
          System.out.print("The perimeter of the triangle is " + perimeter + ".");
      } else {
          System.out.print("Invalid values entered.");

 
    }

	}
}