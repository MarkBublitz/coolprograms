import java.util.Random;
import java.util.Scanner;

public class RandomNumberGuesser {
	public static void main (String[] args) {
		Random rnd = new Random();
		Scanner keyboard = new Scanner(System.in);
		
		String doYouWantToTryAgain = "yes";
		
		while (doYouWantToTryAgain.equalsIgnoreCase("yes")) {
			
			int num = rnd.nextInt(101);
			
			dialogue(num);
			
			System.out.println("Do you want to play again?");
			doYouWantToTryAgain = keyboard.next();
			
			while(!doYouWantToTryAgain.equalsIgnoreCase("yes") && !doYouWantToTryAgain.equalsIgnoreCase("no")) {

				System.out.println("Please enter yes or no:");
				doYouWantToTryAgain = keyboard.next();
			}
			}
		
		System.out.println("Thanks for playing");
		
		System.exit(0);
			
		}
			
		
		

	    public static void dialogue(int number) {
		int num = number;
		
		Scanner input = new Scanner(System.in);
		int guess;
		int totalGuesses = 0;
		int min = 0;
		int max = 100;
		
		System.out.println("Enter your first guess (please enter only an integer)");
		guess = input.nextInt();
		
		while (guess != num) {
			totalGuesses++;
			 
			
			if (guess > num) {
				System.out.println("Number of guesses is " + totalGuesses);
				System.out.println("Your guess is too high");
				max = guess;
				System.out.println("Enter your next guess between " + min + " and " + max);
			}
			
			else if (guess < num) {
				System.out.println("Number of guesses is " + totalGuesses);
				System.out.println("Your guess is too low");
				min = guess;
				System.out.println("Enter your next guess between " + min + " and " + max);
			}		
			
			guess = input.nextInt();
			
			while (guess < min || guess > max) {
				
				System.out.println("guess must be between " + min + " and " + max + ", please try again");
				guess = input.nextInt();
			}
		}
		System.out.println("Congratulations, you guessed correctly");
		
	}
}
