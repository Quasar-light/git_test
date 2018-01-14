package play;

import java.util.Scanner;

public class testing {
	public static void main(String[] args) {
		
		System.out.println("Are you wise?");

		Scanner scanner = new Scanner(System.in);

			System.out.println("Enter age: ");
		 
		int value = 0;
		 value = scanner.nextInt();
		
		
		if (value > 25) {
		System.out.println("you are wise");}
		
		else { System.out.println("you are not wise"); }
		
		
		}
}
