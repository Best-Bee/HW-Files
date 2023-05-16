import java.util.Scanner;

/*--------------------------------------------------------------------------------
/ 
/ Author: Brendan Best
/ Program: Determine if a 3 digit number is a palindrome or not
/ Date: 10/20/2021
/
/-------------------------------------------------------------------------------*/

public class Ex3_12 {
	public static void main(String[] args) {

		//initialize scanner
				Scanner input = new Scanner(System.in);

				//Prompt user for a 3 digit number
				System.out.print("Enter a 3 digit number: \n");
				int num = input.nextInt();
				
				//get first and last digit
				int firstDigit = (int) num / 100;
				int lastDigit = num % 10;
				
				//make sure the user doesn't input an invalid number
				while (((num / 1000) >= 1) || (num / 100 < 1)) {
					System.out.println("Error 001: Number not a number between 100 and 999");
					
					//prompt user for 3 digit number (again...)
					System.out.print("Enter a 3 digit number: \n");
					num = input.nextInt();
					
					//get first and last digit (again...)
					firstDigit = (int) num / 100;
					lastDigit = num % 10;
				}
				
				//if first and last digits are equal in a 3 digit number, the number
				//must be a palindrome
				if(firstDigit == lastDigit) {
					System.out.println(num + " is a palindrome");
				} else {
					System.out.println(num + " is not a palindrome");
				}

	}
}
