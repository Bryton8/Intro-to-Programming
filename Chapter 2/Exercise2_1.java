/* Bryton Lunceford
	9/26/2018
	Celsius to farenheit
*/
import java.util.Scanner;
class Exercise2_1 {
	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Enter a degree in Celsius: ");
		double Celsius = userInput.nextDouble();
		
		double Farenheit = 9.0 / 5 * Celsius + 32;
		System.out.println(Celsius + " Celsius is " + Farenheit + " Farenheit ");
		
		
	}
}