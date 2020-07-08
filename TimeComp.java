import java.util.Scanner;

public class TimeComp {
	
	/*Create a new Java program called TimeComp that reads a value representing a number of
	seconds, and then prints the equivalent amount of time as a combination of hours, minutes,
	and seconds. For example, 9999 seconds is equivalent to 2 hours, 46 minutes, and 39 seconds.*/

	public static void main(String[] args) {
		
		// Create Scanner Object
		Scanner userInput = new Scanner(System.in);
		
		//Ask User to input seconds to convert to hours/mins/sec
		System.out.print("Enter the total number of seconds you would like to convert to HH:MM:SS: ");
		//Read user input for seconds
		long seconds = userInput.nextLong();
		
		//Enter in new line
		System.out.println("");
		
		//Calculate Hours 
		int hours = (int) (seconds/3600);
	
		//Calculate minutes 
		int minutes = (int) (seconds%3600);
		minutes = minutes/60;
	
		//Calculate seconds
		int second = (int) (seconds%60);
		
		//Notify User of Conversion from Seconds to Hours/ Minutes / Seconds
		System.out.println("The " + seconds + " seconds you entered is equivalent to " + hours + "hours, " + minutes + " minutes, and " + second + " seconds or " +hours+":"+minutes+":"+second);
		
		
	}

}
