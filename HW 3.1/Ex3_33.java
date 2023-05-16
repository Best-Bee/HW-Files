import java.util.Scanner;

/*--------------------------------------------------------------------------------
/ 
/ Author: Brendan Best
/ Program: Check if a point is inside a circle
/ Date: 10/20/2021
/
/-------------------------------------------------------------------------------*/

public class Ex3_33 {
	public static void main(String[] args) {
		// initialize scanner
		Scanner input = new Scanner(System.in);
				
		// Prompt user for two weights and prices of rice (they better be washing 
		// that rice before they cook it)
		System.out.print("Enter weight and price for package 1: \n");
		double weight1 = input.nextDouble();
		double price1 = input.nextDouble();
		System.out.print("Enter weight and price for package 2: \n");
		double weight2 = input.nextDouble();
		double price2 = input.nextDouble();
		
		// *note, PPU stands for price per unit
		double ppu1 = price1 / weight1;
		double ppu2 = price2 / weight2;
		
		//tell the user which one is more cost effective to buy
		if (ppu1 > ppu2) {
			System.out.println("Package 2 has a better price");
		} else if (ppu2 > ppu1) {
			System.out.println("Package 1 has a better price");
		} else {
			System.out.println("Both have the same value, choose "
					         + "whichever amount of rice you think you will need");
		}
	}

}
