/**
* Program to creat a quiz on subtractin gtwo random numbers
* @author (Isaiah Magana)
*
* SubQuiz.java
*/

import java.util.Scanner;
import java.util.Random;

public class SubQuiz {
	/**
	main method to run program
	*/
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		int firstValue, secondValue, diffrence, temporary = 0, answer;
		
		//Generates the random numbers that are gonna be subtracted
		firstValue = generator.nextInt(10);
		secondValue = generator.nextInt(10);
		
		//Created three way swap so that we dont get an unwanted negative number when subtracting
		if (secondValue < firstValue) {
			temporary = firstValue;
			firstValue = secondValue;
			secondValue = temporary;
		}
		
		diffrence = secondValue - firstValue;

		System.out.print(secondValue + " - " + firstValue + " = ");
		answer = input.nextInt();
		
		if(answer == diffrence) {
			System.out.print("Good Job!");
		}
		else {
			System.out.println("Incorrect.");
			System.out.print("The correct answer to " + secondValue + " - " + firstValue + " = " + diffrence);

		}
	}
}
		
		
