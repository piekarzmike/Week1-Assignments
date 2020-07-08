import java.util.Scanner;

public class AgeGuess {
	/*Create a new Java program called AgeGuess which
		
		1. Creates a new Scanner object
		
		2. Declares two variables:
				String name;
				int ageGuess;

		3. Uses the Scanner object’s methods to read in the name and ageGuess from the keyboard.
				Make sure to prompt the user for each value. The value entered should be on the same line as
				the prompt.

		4. Displays the ageGuess and name variable values. Make sure to label each.*/

	public static void main(String[] args) {
		
		// Create Scanner Object
		Scanner userInput = new Scanner(System.in);
		
		//Ask User to input their full name (first and last)
		System.out.print("Please, enter your full name (first & last) here: ");
		//Read user input for name
		String name = userInput.nextLine();
		
		//Ask User to input their age
		System.out.print("Please, enter your age here: ");
		//Read user input for their age
		byte ageGuess = userInput.nextByte();
		
		// Skip a line
		System.out.println();
		
		//Output the data the User entered for their name and age
		System.out.print("Your name is " + name + " and you are " + ageGuess + " years old!!!");
	

	}

}
