package userInput;

import java.util.Scanner;

public class User {
	
	public static void main(String[] args) {
		
		//Create scanner object
		Scanner input = new Scanner(System.in ); 
		
		//Output the prompt
		System.out.println("Enter a number: ");
		
		//wait for the user to enter something
		int value = input.nextInt();
		
		//Tell the what they entered
		System.out.println("you entered: " + value);
		
	}

}
