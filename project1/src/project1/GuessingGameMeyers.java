/*
 * John Meyers
 * COSC 117-605 Programming Fundamentals
 * This code replicates a guessing game for a number it prompts the user to 
 * supply two numbers a maximum and a minimum and then asks the user again 
 * to supply with a number in between those two numbers and if the user  gives a number that is too
 * low or too high the program will inform the user that it is such
 * and if the user takes more than ten tries the user fails the program completely and then 
 * tells the user the correct number and ends the program but if they guess the correct number
 * then it prints out a congratulations statement and then ends the program
 */




package project1;
import java.util.Scanner;
public class GuessingGameMeyers {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a positive value you want to be the minimum: ");
		int min = sc.nextInt();
		if (min < 0)
		{
			System.out.println("Invalid input please input a positive value for the minimum: ");
			min = sc.nextInt();
		}
		System.out.println("Enter a positive value you want to be the maximum: ");
		int max = sc.nextInt();
		if (max < 0)
		{
			System.out.println("Invalid input please input a positive value for the maximum: ");
			max = sc.nextInt();
		}
		if(max <= min)
		{
			System.out.println("Invalid input the maximum has to be more than the minimum please re-enter the values ");
			System.out.println("Enter a positive value you want to be the minimum: ");
			min = sc.nextInt();
			System.out.println("Enter a positive value you want to be the maximum: ");
			max = sc.nextInt();
		}
		int count = 0;
		double random = Math.random();
		int num = (int) (random * max);
		while(num < min)
		{
			random = Math.random();
			num = (int) (random * max);
			if(num <= max && num >= min)
			{
				break;
			}
		}
		while(count != 10)
		{
			System.out.println("The number you are trying to guess will be between " + min + " and " + max);
			
			
			count++;
			
			System.out.println("Guess a number between " + min + " and " + max + ": ");
			int guess = sc.nextInt();
			if(count == 10)
			{
				System.out.println("You took too many tries :( the correct number was " + num);
				
			}
			else if (guess == num)
			{
				System.out.println("Congrats! You guessed it! It took you " + count + " tries!");
				break;
			}
			else if(guess > max)
			{
				System.out.println("Invalid input your number must be between your maximum and minimum");
			}
			else if(guess < min)
			{
				System.out.println("Invalid input your number must be between your maximum and minimum");
			}
			else if(guess < num)
			{
				System.out.println("Your guess is too low");
			}
			else if(guess > num)
			{
				System.out.println("Your guess is too high");
			}
			else
			{
				System.out.println("Invalid Input");
			}
			
		}
		sc.close();
	}

}

