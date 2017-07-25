package GuessSecretNumber;

import java.util.Scanner;
import java.util.Random;

public class Guess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		int number = 0; String response= null; 
		// Generate a random secret number between 1 to 100
		Random r = new Random(); 
		int RandomSecretNumber = 1+ r.nextInt(100); 
		do {
			// Prompt the user to input a number
			System.out.println("Guess the Number:");
			Scanner scan1 = new Scanner(System.in);
			number= scan1.nextInt(); 	
			
			// If the user guessed right, print "You guessed right!"
			if (number==RandomSecretNumber){
				System.out.println("You guessed right!");
				    
			}
            
			// If not, compare the number to the random secret number, and print the result based on the comparison
			// Also, Prompt if the user wants to try again.
			if(number<RandomSecretNumber){
			    System.out.println("You guessed too low, try again? (Y/N)");
			    Scanner scan2 = new Scanner(System.in);
			    response = scan2.nextLine();
			    
			} 
			
			if (number>RandomSecretNumber){
			    System.out.println("You guessed too high, try again? (Y/N)");
			    Scanner scan2 = new Scanner(System.in);
			    response = scan2.nextLine();
			    
			} 
				
				
			//continue prompt "Would you like to try again?" if the user's response is not "y" and is not "n" 	
		    while(!response.equalsIgnoreCase("y")&&!response.equalsIgnoreCase("n")){
			    System.out.println("Error Message: input should be y/n");
			    System.out.println("Would you like to try again? y/n");
				Scanner scan3 = new Scanner(System.in);
				response= scan3.nextLine();
 					
					
				}

			}
		//Continue the loop if the user guessed wrong and the user wants to try again
		while (number!=RandomSecretNumber&&!response.equalsIgnoreCase("n"));
		
		//print the the secret number when the user guessed the number wrong and does not want to try again, 
		System.out.println("The Random Secret Number is:" + RandomSecretNumber);

		}
	}
