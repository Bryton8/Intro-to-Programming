/*
Bryton Lunceford
11/30/18
Test program that prompts the user to enter an integer and tests for palindrome
*/

public class Ex6_3 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int number = 0;
		
		System.out.print("Enter an integer: ");
	    	int number = input.nextInt();
	
		if (isPalindrome(number)) {
			System.out.print(number + " is a palindrome");
		}
		else {
			System.out.print(number + " is not a palindrone");
		}
		
		public static boolean isPalindrome(int number)	{
			
			return (number == reverse(number));
		}
		
		public static int reverse(int number) {
			int reverse = 0;
			int digit;
			
		   do {
			digit = number % 10;
			reverse = reverse * 10 + digit;
			number /= 10;
		} while (number != 0);
		
			return reverse;
		}
	}
}