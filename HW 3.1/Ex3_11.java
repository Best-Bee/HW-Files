import java.util.Scanner;

/*--------------------------------------------------------------------------------
/ 
/ Author: Brendan Best
/ Program: Get user input for a month and year and then display the amount of days
/		   in said month.
/ Date: 10/20/2021
/
/-------------------------------------------------------------------------------*/

public class Ex3_11 {
	public static void main(String[] args) {
		
		//initialize scanner
		Scanner input = new Scanner(System.in);
		
		//initialize variable
		int leapYear = 0;
		
		//Prompt user for month and year input
		System.out.print("Enter the number of a month: \n");
		int monthNum = input.nextInt();
		System.out.print("\nEnter the number of a year: \n");
		int yearNum = input.nextInt();
		
		//Switch statement to print out the required information based on user input
		switch(monthNum) {
			case 1:
				System.out.println("\nJanuary, " + yearNum + " has 31 days");
				break;
			case 2:
				//Determines if the year given is a leap year, if the year is evenly divisible
				//by 4 and not 100, it is a leap year or if the year is evenly divisible
				//by 100 and 400 then it is a leap year.
				
				if (((yearNum % 4 == 0) && (yearNum % 100 != 0)) 
				|| ((yearNum % 100 == 0) && (yearNum % 400 == 0))) {
					leapYear = 1;
				}
				System.out.println("\nFebruary, " + yearNum + " has " + (28 + leapYear) + " days");
				break;
			case 3:
				System.out.println("\nMarch, " + yearNum + " has 31 days");
				break;
			case 4:
				System.out.println("\nApril, " + yearNum + " has 30 days");
				break;
			case 5:
				System.out.println("\nMay, " + yearNum + " has 31 days");
				break;
			case 6:
				System.out.println("\nJune, " + yearNum + " has 30 days");
				break;
			case 7:
				System.out.println("\nJuly, " + yearNum + " has 31 days");
				break;
			case 8:
				System.out.println("\nAugust, " + yearNum + " has 31 days");
				break;
			case 9:
				System.out.println("\nSeptember, " + yearNum + " has 30 days");
				break;
			case 10:
				System.out.println("\nOctober, " + yearNum + " has 31 days");
				break;
			case 11:
				System.out.println("\nNovember, " + yearNum + " has 30 days");
				break;
			case 12:
				System.out.println("\nDecember, " + yearNum + " has 31 days");
				break;
			//default statement in case user enters a month below 1 or greater than 12
			default:
				System.out.println("\nInvalid month");
		}
	}
}
