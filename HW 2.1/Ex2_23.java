import java.util.Scanner;

public class Ex2_23 {

	public static void main(String[] args) {
		//initialize scanner
		Scanner input = new Scanner(System.in);
						
		//Prompt user for input
		System.out.print("Enter the driving distance: ");
		double dist = input.nextDouble();
		System.out.print("Enter miles per gallon: ");
		double milesPerGal = input.nextDouble();
		System.out.print("Enter price per gallon: ");
		double pricePerGal = input.nextDouble();
		
		//Calculate the cost of the trip
		double price = (dist / milesPerGal) * pricePerGal;

		System.out.println("The cost of driving is: $" + price);

	}

}
