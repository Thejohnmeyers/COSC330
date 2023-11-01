/*
 * Project 1
 * Phillip Riazi
 * COSC 117-605
 * 10/04/20
 * 
 * 
 * This project demonstrates the concepts of variables, loops, scanners, if/else statements,
 * and boolean operators.
 * 
 * This program asks the user for a minimum positive integer and a maximum positive integer
 * and then selects a random integer between the two. The user then has 10 guesses 
 * to guess the number. If they guess the correct number, they are congratulated, and
 * the program outputs how many guesses it took for the user to guess the correct integer.
 * If they cannot guess the integer in 10 guesses the program will output the random integer
 * it selected, and end the program.
 */
import java.util.Scanner;
	public class GuessingGame {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
		
			int rangemin;   // Min and max variables
			int rangemax;
			int userGuess1;   // User's guess variable
			int guessCounter;   // A counter for the number of guesses the user makes
			guessCounter = 1;   // The guess counter will always start at one, you must make at least one guess.
			
			System.out.println("Input a range using two different positive integers! I'll pick a number inbetween them, ");
			System.out.println("and let's see if you can guess my number in at least 10 tries!");
			System.out.println("======================");
			 System.out.println("Input minimum integer: ");
			 
			 while(!sc.hasNextInt()) {	  //The hasNextInt will check to make sure the input is an int, if it is not it will ignore it
				 				          // and wait an int to be inputed
				 sc.nextLine();
			 }
			 rangemin = sc.nextInt();     // Inputed int will be the min
			 
			  System.out.println("Input maximum integer: ");
			     while(!sc.hasNextInt()) {
					 sc.nextLine();
				 }
			     
			     rangemax = sc.nextInt(); // Inputed int will be the  max
			     
			     double randNumber;
				    randNumber = rangemin + (int)(Math.random() * ((rangemax - rangemin) + 1));   // Picks a random number between the
				    																	//min and max
				    System.out.println("======================");
				    System.out.println("Please input a positive integer as your guess."); 
				   while (!sc.hasNextInt()) {  // Again checks to make sure the guess is a positive Int and ignores if not.
					   sc.nextLine();
				   }
				    userGuess1 = sc.nextInt();   // Inputed int is the guess
				     
				    while (userGuess1 != randNumber) {       // If the guess is wrong, it will ask for another guess.
		    			System.out.println("Nope! Guess again!");
		    			 while (!sc.hasNextInt()) {
							   sc.nextLine();
						   }
		    			  userGuess1 = sc.nextInt();
		    				 guessCounter ++;
		    				 if (guessCounter == 10) {   // The user is only allowed 10 tries, then program outputs the random number
								  System.out.println("Uh oh, you ran out of guesses! I guessed " + randNumber + "!");
								  break; 							  
						    }
				    }
				    
				while (guessCounter <10) {    // Outputs this only if the user has guessed<10, if they had guessed 10 times,
											//the program would tell them the answer. If they guess correctly before then
											// the program will congratulate them and tell them how many guesses it took them.
				    if ((userGuess1 == randNumber) &&(guessCounter >1)) {
						 System.out.println("You got it! I guessed " + randNumber + "!");
						 System.out.println("It took you " + guessCounter + " guesses!");
						 break;
					 } else  {    // Used an else so that correct grammar could be user only needed 1 guess.
						 System.out.println("You got it! I guessed " + randNumber + "!");
						 System.out.println("It only took you " + guessCounter + " guess!");  
						 break;
					   }
				}
				sc.close();   //closes the scanner
			
				    }		
		}


