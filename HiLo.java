import java.util.Scanner;

public class HiLo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	//Creates Scanner object to read from keyboard
		String playAgain = "";	//if == y, game restarts

		do {
			// Create a random number for the user to guess
			int theNumber = (int)(Math.random() * 100 + 1);
			//System.out.println(theNumber);	//Uncoment this in case we want to know the number (for testing).
			int guess = 0;	//Number entered by the player
			int count =0;	//Number of tries of guessing the number
			while(guess != theNumber){
				
				System.out.println("Guess a number between 1 and 100:");
				guess = scan.nextInt();	//Reads the number typed on the keyboard by the player
				count++;	//Plus 1 every time a number is entered
				System.out.println("You entered " + guess +".");
				if(guess < theNumber) {	//If number entered is smaller
					System.out.println("The number is bigger" + ", try again!");
					System.out.println("Number of tries: " + count);
				} else if(guess > theNumber) { //If number entered is bigger
					System.out.println("The number is smaller" + ", try again!");
					System.out.println("Number of tries: " + count);
				} else {	//If both previous cases are false
					System.out.println("Congratulations! You've found the number!");
				}
			}
			//Once guess == theNumber
			System.out.println("Number of tries: " + count);
			System.out.println("Play again? (y/n)");
			playAgain = scan.next();	//Reads the String entered from keyboard by the player
		}
		while(playAgain.equalsIgnoreCase("y"));		//If player enters y, start again.
		//Otherwise
		System.out.println("Thank you for playing! Goodbye :)");
		scan.close();	//Close scanner
	
	}	//Close main
}	//Close class


