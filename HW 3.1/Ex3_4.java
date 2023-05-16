/*---------------------------------
/ 
/ Author: Brendan Best
/ Program: Generate a random month
/ Date: 10/20/2021
/
/---------------------------------*/


public class Ex3_4 {

	public static void main(String[] args) {
		
		//generate a random integer between 1 and 12
		int randMonth = (int) (Math.random() * 12 + 1);
		
		// Use random number generated to go through a switch case and
		// print out the number correlated to the number generated
		
		switch (randMonth) {
			case 1: 
				System.out.println("January");
				break;
			case 2: 
				System.out.println("February");
				break;
			case 3: 
				System.out.println("March");
				break;
			case 4: 
				System.out.println("April");
				break;
			case 5: 
				System.out.println("May");
				break;
			case 6: 
				System.out.println("June");
				break;
			case 7: 
				System.out.println("July");
				break;
			case 8: 
				System.out.println("August");
				break;
			case 9: 
				System.out.println("September");
				break;
			case 10: 
				System.out.println("October");
				break;
			case 11: 
				System.out.println("November");
				break;
			case 12: 
				System.out.println("December");
				break;
			
		}
	}

}
