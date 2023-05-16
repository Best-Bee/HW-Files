import java.util.Scanner;

/*--------------------------------------------------------------------------------
/ 
/ Author: Brendan Best
/ Program: Rock paper scissors
/ Date: 10/20/2021
/
/-------------------------------------------------------------------------------*/

public class Ex3_17 {
	public static void main(String[] args) {
		//initialize scanner
		Scanner input = new Scanner(System.in);
				
		//Prompt user for rock paper or scissors
		System.out.print("scissor (0), rock (1), paper (2): \n");
		int userChoice = input.nextInt();
		
		
		//generate a random integer between 0 and 2
		int randNum = (int) (Math.random() * 3);
			
		// Use the user choice first to determine which of the three sets of
		// if tests to go through, then goes through the three to determine what
		// the computer and person was and then displays the appropriate message.
			
		if (userChoice == 0) {
			if (randNum == 0) {
				System.out.println("The computer is scissor. You are scissor too. It is a draw.");
			} else if (randNum == 1) {
				System.out.println("The computer is rock. You are scissor. You lose.");
			} else {
				System.out.println("The computer is paper. You are scissor. You win.");
			}
		} else if (userChoice == 1) {
			if (randNum == 0) {
				System.out.println("The computer is scissor. You are rock. You win.");
			} else if (randNum == 1) {
				System.out.println("The computer is rock. You are rock too. It is a draw.");
			} else {
				System.out.println("The computer is paper. You are rock. You lose.");
			}
		} else if (userChoice == 2) {
			if (randNum == 0) {
				System.out.println("The computer is scissor. You are paper. You lose.");
			} else if (randNum == 1) {
				System.out.println("The computer is rock. You are paper. You win.");
			} else {
				System.out.println("The computer is paper. You are paper too. It is a draw.");
			}
		}
	}
}
