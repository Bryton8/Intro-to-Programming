/*
Bryton Lunceford
11/15/18
Find divisible by 5 or 6
*/

class Ex5_11 {
	public static void main(String[] args) {
		
		int count = 1;
		for (int i = 100; i <=200; i++) {
			
				if (i % 6 == 0 ^ i % 5 == 0) {
						System.out.print((count ++ % 10 != 0) ? i + " " : i + " \n ");
						
			}
		}	
	}
}